package com.core.batch.thread;

import com.core.batch.facade.BatchLoggerFacade;
import com.shangkang.core.exception.ServiceException;
import com.shangkang.core.util.SpringBeanHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DefaultThreadPoolExecutor extends ThreadPoolExecutor {

	private BatchLoggerFacade batchLoggerFacade;
	private Logger logger				= LoggerFactory.getLogger(getClass());
	
	public DefaultThreadPoolExecutor(int corePoolSize, int maximumPoolSize,
			long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, new CallerRunsPolicy());
		
		batchLoggerFacade = (BatchLoggerFacade) SpringBeanHelper.getBean("batchLoggerFacade");
	}
	
	public void beforeExecute(Thread t, Runnable r)
	{
		super.beforeExecute(t, r);
		
		TaskThreadExecutor task = (TaskThreadExecutor) r;
		
		try
		{
			batchLoggerFacade.processBatchStatusRun(task.getTaskOid());
		} catch (ServiceException e)
		{
			e.printStackTrace();
		}
		
		logger.debug("********* beforeExecute ********************* " + task);
		
	}

	public void afterExecute(Runnable r,
            Throwable t)
	{
		super.afterExecute(r, t);
		
		TaskThreadExecutor task = (TaskThreadExecutor) r;
					
		try
		{
			batchLoggerFacade.processBatchTaskFinishedLog(task.getTaskOid(), task.isFailed(), task.getExecuteStartTime(), task.getException());
		} catch (ServiceException e)
		{
			e.printStackTrace();
		}
		
		logger.debug("***** afterExecute ************************* " + task);
	}
			
	public void terminated()
	{
		super.terminated();
	}

}
