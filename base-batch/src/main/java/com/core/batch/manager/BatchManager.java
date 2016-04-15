/**
 * 1、创建工作任务池
 * 2、
 */
package com.core.batch.manager;

import com.core.batch.thread.TaskThreadAdapter;
import com.shangkang.core.exception.ServiceException;
import com.shangkang.core.util.SpringBeanHelper;

/**
 * @author liuzh
 *
 */
public class BatchManager 
{
	private BatchManagerThread batchManagerThread;
	private static BatchManager batchManager;

	public static void start( ) throws ServiceException
	{
		batchManager = new BatchManager();

		batchManager.startServer();
	}

	public static boolean isServerAlive() throws ServiceException{
		return batchManager.isAlive();
	}

	public static void stop() throws ServiceException{
		batchManager.stopServer();
	}
	
	public void startServer() throws ServiceException
	{
		batchManagerThread = new BatchManagerThread();
		
		batchManagerThread.start();
	}

	public boolean isAlive() throws ServiceException
	{
		return batchManagerThread.isAlive();
	}

	public void stopServer()
	{
		batchManagerThread.stopServer();
	}
	
	private class BatchManagerThread extends Thread
	{
		TaskThreadAdapter taskThreadAdapter;
		public BatchManagerThread()
		{
		}

		public void run()
		{
			taskThreadAdapter = (TaskThreadAdapter) SpringBeanHelper.getBean("taskThreadAdapter");
			
			try {
				taskThreadAdapter.processThreadTaskCycle();
			} catch (ServiceException e)
			{
				e.printStackTrace();
			}
		}

		public void stopServer()
		{
			taskThreadAdapter.setExit(true);
		}
	}
	
}
