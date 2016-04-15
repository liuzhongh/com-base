/**
 * COPYRIGHT (C) 2012 3KW. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Liuzh
 * Created On: 2013-3-23 14:34:22
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.shangkang.bo;

import com.shangkang.core.bo.Model;

public class BatchTaskExceptionLog extends Model{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	
	/**
	  *	任务异常日志索引
	  */
	private Long taskExceptionOid;

	/**
	  *	任务索引
	  */
	private Long taskOid;

	/**
	  *	异常信息
	  */
	private String exceptionMessage;

	/**
	  *	异常堆栈信息
	  */
	private String exceptionStackMessage;

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
	  *	任务异常日志索引
	  */
	public Long getTaskExceptionOid()
	{
		return taskExceptionOid;
	}
	
	/**
	  *	任务异常日志索引
	  */
	public void setTaskExceptionOid(Long taskExceptionOid)
	{
		this.taskExceptionOid = taskExceptionOid;
	}
	
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
	  *	异常信息
	  */
	public String getExceptionMessage()
	{
		return exceptionMessage;
	}
	
	/**
	  *	异常信息
	  */
	public void setExceptionMessage(String exceptionMessage)
	{
		this.exceptionMessage = exceptionMessage;
	}
	
	/**
	  *	异常堆栈信息
	  */
	public String getExceptionStackMessage()
	{
		return exceptionStackMessage;
	}
	
	/**
	  *	异常堆栈信息
	  */
	public void setExceptionStackMessage(String exceptionStackMessage)
	{
		this.exceptionStackMessage = exceptionStackMessage;
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
		return "BatchTaskExceptionLog [" + 
					"taskExceptionOid=" + taskExceptionOid + 
					", taskOid=" + taskOid + 
					", exceptionMessage=" + exceptionMessage + 
					", exceptionStackMessage=" + exceptionStackMessage + 
					", createBy=" + createBy + 
					", createDate=" + createDate + 
					", updateBy=" + updateBy + 
					", updateDate=" + updateDate + 
				"]";
	}
}

