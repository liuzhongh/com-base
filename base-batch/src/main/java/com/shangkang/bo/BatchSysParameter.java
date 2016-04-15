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

public class BatchSysParameter extends Model{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	
	/**
	  *	索引
	  */
	private Long batchSysParameterOid;

	/**
	  *	参数名
	  */
	private String batchParameter;

	/**
	  *	参数值
	  */
	private String parameterValue;

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
	  *	索引
	  */
	public Long getBatchSysParameterOid()
	{
		return batchSysParameterOid;
	}
	
	/**
	  *	索引
	  */
	public void setBatchSysParameterOid(Long batchSysParameterOid)
	{
		this.batchSysParameterOid = batchSysParameterOid;
	}
	
	/**
	  *	参数名
	  */
	public String getBatchParameter()
	{
		return batchParameter;
	}
	
	/**
	  *	参数名
	  */
	public void setBatchParameter(String batchParameter)
	{
		this.batchParameter = batchParameter;
	}
	
	/**
	  *	参数值
	  */
	public String getParameterValue()
	{
		return parameterValue;
	}
	
	/**
	  *	参数值
	  */
	public void setParameterValue(String parameterValue)
	{
		this.parameterValue = parameterValue;
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
	
	public String toString()
	{
		return "BatchSysParameter [" + 
					"batchSysParameterOid=" + batchSysParameterOid + 
					", batchParameter=" + batchParameter + 
					", parameterValue=" + parameterValue + 
					", description=" + description + 
					", createBy=" + createBy + 
					", createDate=" + createDate + 
					", updateBy=" + updateBy + 
					", updateDate=" + updateDate + 
				"]";
	}
}

