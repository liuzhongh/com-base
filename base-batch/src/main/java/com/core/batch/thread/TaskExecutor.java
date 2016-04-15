package com.core.batch.thread;

/**
 * Jan 13, 2010
 * Liuzh
 */
public interface TaskExecutor {

	/**
	 * 执行业务逻辑
	 * @param owner
	 * @param methodName
	 * @param taskParameter
	 * @return
	 * @throws Exception
	 */
	public Object processBatchBusinessTask(Object owner, String methodName,
										   String taskParameter) throws Exception;

}