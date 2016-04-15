/**
 * COPYRIGHT (C) 2012 3KW. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Liuzh
 * Created On: 2013-3-23 14:34:25
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.shangkang.bo;

import com.shangkang.core.bo.Model;

public class BatchJob extends Model{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	
	/**
	  *	工作索引
	  */
	private Long jobOid;

	/**
	  *	工作名称
	  */
	private String jobName;

	/**
	  *	工作模块
	  */
	private String jobModule;

	/**
	  *	工作请求人ID
	  */
	private String userId;

	/**
	  *	6：待处理的工作
4：暂停的工作
8：运行中的工作
0：取消执行的工作
1：已执行完成的工作
	  */
	private String jobStatus;

	/**
	  *	9：紧急的
8：高优先级
7：普通的
6：低优先级
	  */
	private String jobPriority;

	/**
	  *	工作执行类
	  */
	private String jobExecuteClass;

	/**
	  *	工作执行方法
	  */
	private String jobExecuteMethod;

	/**
	  *	线程分配数
	  */
	private Integer threadAssignNum;

	/**
	  *	任务总数
	  */
	private Integer taskTotal;

	/**
	  *	任务成功数
	  */
	private Integer taskSuccess;

	/**
	  *	任务失败数
	  */
	private Integer taskFail;

	/**
	  *	工作添加时间
	  */
	private String jobAddTime;
	
	/**
	  *	计划执行时间
	  */
	private String planExecuteTime;

	/**
	  *	工作完成时间
	  */
	private String jobFinishedTime;

	/**
	  *	描述
	  */
	private String description;

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
	 * 工作类型
	 */
	private String jobType;
	
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
	  *	工作名称
	  */
	public String getJobName()
	{
		return jobName;
	}
	
	/**
	  *	工作名称
	  */
	public void setJobName(String jobName)
	{
		this.jobName = jobName;
	}
	
	/**
	  *	工作模块
	  */
	public String getJobModule()
	{
		return jobModule;
	}
	
	/**
	  *	工作模块
	  */
	public void setJobModule(String jobModule)
	{
		this.jobModule = jobModule;
	}
	
	/**
	  *	工作请求人ID
	  */
	public String getUserId()
	{
		return userId;
	}
	
	/**
	  *	工作请求人ID
	  */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	/**
	  *	6：待处理的工作
4：暂停的工作
8：运行中的工作
0：取消执行的工作
1：已执行完成的工作
	  */
	public String getJobStatus()
	{
		return jobStatus;
	}
	
	/**
	  *	6：待处理的工作
4：暂停的工作
8：运行中的工作
0：取消执行的工作
1：已执行完成的工作
	  */
	public void setJobStatus(String jobStatus)
	{
		this.jobStatus = jobStatus;
	}
	
	/**
	  *	9：紧急的
8：高优先级
7：普通的
6：低优先级
	  */
	public String getJobPriority()
	{
		return jobPriority;
	}
	
	/**
	  *	9：紧急的
8：高优先级
7：普通的
6：低优先级
	  */
	public void setJobPriority(String jobPriority)
	{
		this.jobPriority = jobPriority;
	}
	
	/**
	  *	工作执行类
	  */
	public String getJobExecuteClass()
	{
		return jobExecuteClass;
	}
	
	/**
	  *	工作执行类
	  */
	public void setJobExecuteClass(String jobExecuteClass)
	{
		this.jobExecuteClass = jobExecuteClass;
	}
	
	/**
	  *	工作执行方法
	  */
	public String getJobExecuteMethod()
	{
		return jobExecuteMethod;
	}
	
	/**
	  *	工作执行方法
	  */
	public void setJobExecuteMethod(String jobExecuteMethod)
	{
		this.jobExecuteMethod = jobExecuteMethod;
	}
	
	/**
	  *	线程分配数
	  */
	public Integer getThreadAssignNum()
	{
		return threadAssignNum;
	}
	
	/**
	  *	线程分配数
	  */
	public void setThreadAssignNum(Integer threadAssignNum)
	{
		this.threadAssignNum = threadAssignNum;
	}
	
	/**
	  *	任务总数
	  */
	public Integer getTaskTotal()
	{
		return taskTotal;
	}
	
	/**
	  *	任务总数
	  */
	public void setTaskTotal(Integer taskTotal)
	{
		this.taskTotal = taskTotal;
	}
	
	/**
	  *	任务成功数
	  */
	public Integer getTaskSuccess()
	{
		return taskSuccess;
	}
	
	/**
	  *	任务成功数
	  */
	public void setTaskSuccess(Integer taskSuccess)
	{
		this.taskSuccess = taskSuccess;
	}
	
	/**
	  *	任务失败数
	  */
	public Integer getTaskFail()
	{
		return taskFail;
	}
	
	/**
	  *	任务失败数
	  */
	public void setTaskFail(Integer taskFail)
	{
		this.taskFail = taskFail;
	}
	
	/**
	  *	工作添加时间
	  */
	public String getJobAddTime()
	{
		return jobAddTime;
	}
	
	/**
	  *	工作添加时间
	  */
	public void setJobAddTime(String jobAddTime)
	{
		this.jobAddTime = jobAddTime;
	}
	
	/**
	 * @param planExecuteTime the planExecuteTime to set
	 */
	public void setPlanExecuteTime(String planExecuteTime)
	{
		this.planExecuteTime = planExecuteTime;
	}

	/**
	 * @return the planExecuteTime
	 */
	public String getPlanExecuteTime()
	{
		return planExecuteTime;
	}

	/**
	  *	工作完成时间
	  */
	public String getJobFinishedTime()
	{
		return jobFinishedTime;
	}
	
	/**
	  *	工作完成时间
	  */
	public void setJobFinishedTime(String jobFinishedTime)
	{
		this.jobFinishedTime = jobFinishedTime;
	}
	
	/**
	  *	描述
	  */
	public String getDescription()
	{
		return description;
	}
	
	/**
	  *	描述
	  */
	public void setDescription(String description)
	{
		this.description = description;
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
	
	/**
	 * 工作类型
	 * @return
	 */
	public String getJobType()
	{
		return jobType;
	}

	/**
	 * 工作类型
	 * @return
	 */
	public void setJobType(String jobType)
	{
		this.jobType = jobType;
	}

	public String toString()
	{
		return "BatchJob [" + 
					"jobOid=" + jobOid + 
					", jobName=" + jobName + 
					", jobModule=" + jobModule + 
					", userId=" + userId + 
					", jobStatus=" + jobStatus + 
					", jobPriority=" + jobPriority + 
					", jobExecuteClass=" + jobExecuteClass + 
					", jobExecuteMethod=" + jobExecuteMethod + 
					", threadAssignNum=" + threadAssignNum + 
					", taskTotal=" + taskTotal + 
					", taskSuccess=" + taskSuccess + 
					", taskFail=" + taskFail + 
					", jobAddTime=" + jobAddTime + 
					", jobFinishedTime=" + jobFinishedTime + 
					", planExecuteTime=" + planExecuteTime + 
					", description=" + description + 
					", createBy=" + createBy + 
					", createDate=" + createDate + 
					", updateBy=" + updateBy + 
					", updateDate=" + updateDate + 
					", jobType=" + jobType + 
				"]";
	}
}

