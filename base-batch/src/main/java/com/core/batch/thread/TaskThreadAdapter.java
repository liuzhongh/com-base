package com.core.batch.thread;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.core.batch.constant.BatchConstant;
import com.core.batch.job.task.TaskQueue;
import com.core.batch.manager.ThreadPoolManager;
import com.core.batch.support.BatchParameterHelper;
import com.shangkang.core.exception.ServiceException;
import com.shangkang.core.util.SpringBeanHelper;
import com.shangkang.dto.BatchTaskDTO;
import com.shangkang.tools.UtilHelper;
import org.springframework.util.Assert;

/**
 * Dec 22, 2009 Liuzh
 */
@Component("taskThreadAdapter")
public class TaskThreadAdapter {

	private volatile boolean exit = false;

	private TaskQueue taskQueue;

	private Logger log				= LoggerFactory.getLogger(getClass());
	
	@Autowired
	public void setTaskQueue(TaskQueue taskQueue) {
		this.taskQueue = taskQueue;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	/**
	 * 往任务队列中添加任务
	 * @throws ServiceException
	 */
	private void doAddQueue() throws ServiceException
	{
		List<BatchTaskDTO> tasks = taskQueue.processTaskQueue();

		this.doAddQueue(tasks);
	}
	
	/**
	 * 往任务队列中添加任务
	 */
	private void doAddQueue(List<BatchTaskDTO> tasks)
	{
		if (UtilHelper.isEmpty(tasks))
			return;

		for (BatchTaskDTO task : tasks) {
			TaskThreadExecutor taskThreadExecutor = (TaskThreadExecutor) SpringBeanHelper
					.getBean("taskThreadExecutor");

			taskThreadExecutor.setJobOid(task.getJobOid());
			taskThreadExecutor.setPriority(task.getPriority());
			taskThreadExecutor.setTaskOid(task.getTaskOid());
			taskThreadExecutor.setExecuteClassName(task.getJobExecuteClass());
			taskThreadExecutor.setExecuteMethod(task.getJobExecuteMethod());
			taskThreadExecutor.setTaskParameter(task.getTaskParameter());

			ThreadPoolManager.getInstance().addTask(taskThreadExecutor);
		}
	}
	
	/**
	 * 按周期轮循线程池
	 * @throws ServiceException
	 * 
	 */
	public void processThreadTaskCycle() throws ServiceException
	{
		String cycle = BatchParameterHelper.getParameter(BatchConstant.SYS_PARAMETER_THREAD_CYCLE_TIME);
		String cycleNumStr = BatchParameterHelper.getParameter(BatchConstant.SYS_PARAMETER_THREAD_CYCLE_NUM);

		Assert.notNull(cycle, "参数线程轮询周期[threadCycleTime]没有设置!");
		Assert.notNull(cycleNumStr, "参数线程轮询最大次数[threadCycleNum]没有设置!");

		log.info("线程轮询周期为:" + cycle + "(ms),轮询最大次数为:" + cycleNumStr);
		
		long cycleTime = Long.valueOf(cycle);
		int cycleNum = Integer.valueOf(cycleNumStr);
		
		this.startThreadPool();//启动线程池
		
		int counter = 0;
		
		for(;;)
		{
			if(ThreadPoolManager.getInstance().isEmpty() && exit) {
				log.info("接收到退出命令,线程即将退出!");
				break;
			}

			try {
				log.info("当前线程轮循周期为：" + cycleTime + "(ms).");
				Thread.sleep(cycleTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(ThreadPoolManager.getInstance().isEmpty())
			{
				List<BatchTaskDTO> tasks = taskQueue.processTaskQueue();

				if(UtilHelper.isEmpty(tasks)) {
					counter++;

					if(counter > cycleNum)
						counter = 0;
				}else
				{
					this.doAddQueue(tasks);
					counter = 0;
				}
				
				cycleTime = Long.valueOf(cycle) * ( (int) Math.ceil((double)(counter / 5)) + 1);
			}
		}
	}

	/**
	 * 启动线程池
	 * @throws ServiceException
	 */
	private void startThreadPool() throws ServiceException {					
		ThreadPoolManager.getInstance(BatchParameterHelper.getMaxThreads());//初始化线程池
		
		doAddQueue();//添加任务
	}
	
}
