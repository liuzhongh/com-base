/**
 * COPYRIGHT (C) 2012 3KW. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Liuzh
 * Created On: 2013-3-23 14:34:24
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.shangkang.bo;

import com.shangkang.core.bo.Model;

public class BatchJobLog extends Model{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	
	/**
	  *	工作日志索引
	  */
	private Long jobLogOid;

	/**
	  *	工作索引
	  */
	private Long jobOid;

	/**
	  *	P：优先级更改
S：工作状态更改
	  */
	private String type;

	/**
	  *	更改状态
	  */
	private String status;

	/**
	  *	工作状态更改人
	  */
	private String userId;

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
	  *	工作日志索引
	  */
	public Long getJobLogOid()
	{
		return jobLogOid;
	}
	
	/**
	  *	工作日志索引
	  */
	public void setJobLogOid(Long jobLogOid)
	{
		this.jobLogOid = jobLogOid;
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
	  *	P：优先级更改
S：工作状态更改
	  */
	public String getType()
	{
		return type;
	}
	
	/**
	  *	P：优先级更改
S：工作状态更改
	  */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	  *	更改状态
	  */
	public String getStatus()
	{
		return status;
	}
	
	/**
	  *	更改状态
	  */
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	/**
	  *	工作状态更改人
	  */
	public String getUserId()
	{
		return userId;
	}
	
	/**
	  *	工作状态更改人
	  */
	public void setUserId(String userId)
	{
		this.userId = userId;
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
		return "BatchJobLog [" + 
					"jobLogOid=" + jobLogOid + 
					", jobOid=" + jobOid + 
					", type=" + type + 
					", status=" + status + 
					", userId=" + userId + 
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

