/**
 * COPYRIGHT (C) 2012 3KW. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Liuzh
 * Created On: 2013-3-23 14:34:23
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.shangkang.bo;

import com.shangkang.core.bo.Model;

public class BatchTask extends Model{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	
	/**
	  *	任务索引
	  */
	private Long taskOid;

	/**
	  *	工作索引
	  */
	private Long jobOid;

	/**
	  *	任务参数关键字
	  */
	private String taskParameterKey;
	
	/**
	  *	工作执行类
	  */
	private String jobExecuteClass;

	/**
	  *	工作执行方法
	  */
	private String jobExecuteMethod;

	/**
	  *	任务参数
	  */
	private String taskParameter;

	/**
	  *	A：待处理的任务
P：暂停的任务
R：运行中的工作
C：取消的任务
F：执行失败的任务
S：执行成功的任务


	  */
	private String executeStatus;

	/**
	  *	执行开始时间
	  */
	private String executeStartTime;

	/**
	  *	执行结束时间
	  */
	private String executeEndTime;

	/**
	  *	执行总时间
	  */
	private Integer executeTimes;

	/**
	  *	创建人
	  */
	private String createBy;

	/**
	  *	创建时间
	  */
	private String createDate;

	/**
	  *	修改人
	  */
	private String updateBy;

	/**
	  *	修改时间
	  */
	private String updateDate;

	/**
	  *	任务索引
	  */
	public Long getTaskOid()
	{
		return taskOid;
	}
	
	/**
	  *	任务索引
	  */
	public void setTaskOid(Long taskOid)
	{
		this.taskOid = taskOid;
	}
	
	/**
	  *	工作索引
	  */
	public Long getJobOid()
	{
		return jobOid;
	}
	
	/**
	  *	工作索引
	  */
	public void setJobOid(Long jobOid)
	{
		this.jobOid = jobOid;
	}
	
	/**
	  *	任务参数关键字
	  */
	public String getTaskParameterKey()
	{
		return taskParameterKey;
	}
	
	/**
	  *	任务参数关键字
	  */
	public void setTaskParameterKey(String taskParameterKey)
	{
		this.taskParameterKey = taskParameterKey;
	}
	
	/**
	 * @return the jobExecuteClass
	 */
	public String getJobExecuteClass()
	{
		return jobExecuteClass;
	}

	/**
	 * @param jobExecuteClass the jobExecuteClass to set
	 */
	public void setJobExecuteClass(String jobExecuteClass)
	{
		this.jobExecuteClass = jobExecuteClass;
	}

	/**
	 * @return the jobExecuteMethod
	 */
	public String getJobExecuteMethod()
	{
		return jobExecuteMethod;
	}

	/**
	 * @param jobExecuteMethod the jobExecuteMethod to set
	 */
	public void setJobExecuteMethod(String jobExecuteMethod)
	{
		this.jobExecuteMethod = jobExecuteMethod;
	}

	/**
	  *	任务参数
	  */
	public String getTaskParameter()
	{
		return taskParameter;
	}
	
	/**
	  *	任务参数
	  */
	public void setTaskParameter(String taskParameter)
	{
		this.taskParameter = taskParameter;
	}
	
	/**
	  *	A：待处理的任务
P：暂停的任务
R：运行中的工作
C：取消的任务
F：执行失败的任务
S：执行成功的任务


	  */
	public String getExecuteStatus()
	{
		return executeStatus;
	}
	
	/**
	  *	A：待处理的任务
P：暂停的任务
R：运行中的工作
C：取消的任务
F：执行失败的任务
S：执行成功的任务


	  */
	public void setExecuteStatus(String executeStatus)
	{
		this.executeStatus = executeStatus;
	}
	
	/**
	  *	执行开始时间
	  */
	public String getExecuteStartTime()
	{
		return executeStartTime;
	}
	
	/**
	  *	执行开始时间
	  */
	public void setExecuteStartTime(String executeStartTime)
	{
		this.executeStartTime = executeStartTime;
	}
	
	/**
	  *	执行结束时间
	  */
	public String getExecuteEndTime()
	{
		return executeEndTime;
	}
	
	/**
	  *	执行结束时间
	  */
	public void setExecuteEndTime(String executeEndTime)
	{
		this.executeEndTime = executeEndTime;
	}
	
	/**
	  *	执行总时间
	  */
	public Integer getExecuteTimes()
	{
		return executeTimes;
	}
	
	/**
	  *	执行总时间
	  */
	public void setExecuteTimes(Integer executeTimes)
	{
		this.executeTimes = executeTimes;
	}
	
	/**
	  *	创建人
	  */
	public String getCreateBy()
	{
		return createBy;
	}
	
	/**
	  *	创建人
	  */
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	/**
	  *	创建时间
	  */
	public String getCreateDate()
	{
		return createDate;
	}
	
	/**
	  *	创建时间
	  */
	public void setCreateDate(String createDate)
	{
		this.createDate = createDate;
	}
	
	/**
	  *	修改人
	  */
	public String getUpdateBy()
	{
		return updateBy;
	}
	
	/**
	  *	修改人
	  */
	public void setUpdateBy(String updateBy)
	{
		this.updateBy = updateBy;
	}
	
	/**
	  *	修改时间
	  */
	public String getUpdateDate()
	{
		return updateDate;
	}
	
	/**
	  *	修改时间
	  */
	public void setUpdateDate(String updateDate)
	{
		this.updateDate = updateDate;
	}
	
	public String toString()
	{
		return "BatchTask [" + 
					"taskOid=" + taskOid + 
					", jobOid=" + jobOid + 
					", taskParameterKey=" + taskParameterKey + 
					", taskParameter=" + taskParameter + 
					", executeStatus=" + executeStatus + 
					", executeStartTime=" + executeStartTime + 
					", executeEndTime=" + executeEndTime + 
					", executeTimes=" + executeTimes + 
					", createBy=" + createBy + 
					", createDate=" + createDate + 
					", updateBy=" + updateBy + 
					", updateDate=" + updateDate + 
				"]";
	}
}

