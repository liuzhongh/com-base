package com.core.batch.thread;

import com.shangkang.tools.DateHelper;
import com.shangkang.tools.UtilHelper;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * Dec 22, 2009
 * Liuzh
 */
@Service("taskThreadExecutor")
@Scope("prototype")
public class TaskThreadExecutor implements ApplicationContextAware, Runnable{
	
	private String priority;
	
	private String executeClassName;
	
	private Object executeClazz;
	
	private String executeMethod;
	
	private String taskParameter;
	
	private Long taskOid;
	
	private Long jobOid;
	
	private ApplicationContext context = null;

	private Object returnResult;
	
	private Timestamp executeStartTime;
	
	private boolean failed = false;
	
	private Exception exception;
	
	public Timestamp getExecuteStartTime() {
		return executeStartTime;
	}

	public Exception getException() {
		return exception;
	}

	public boolean isFailed() {
		return failed;
	}

	public Long getJobOid() {
		return jobOid;
	}

	public void setJobOid(Long jobOid) {
		this.jobOid = jobOid;
	}

	public String getExecuteClassName() {
		return executeClassName;
	}

	public void setExecuteClassName(String executeClassName) {
		this.executeClassName = executeClassName;
	}

	public Object getExecuteClazz() {
		return executeClazz;
	}

	public void setExecuteClazz(Object executeClazz) {
		this.executeClazz = executeClazz;
	}

	public String getExecuteMethod() {
		return executeMethod;
	}

	public void setExecuteMethod(String executeMethod) {
		this.executeMethod = executeMethod;
	}

	public String getTaskParameter() {
		return taskParameter;
	}

	public void setTaskParameter(String taskParameter) {
		this.taskParameter = taskParameter;
	}
	
	public Object getReturnResult() {
		return returnResult;
	}
	
	public Long getTaskOid() {
		return taskOid;
	}

	public void setTaskOid(Long taskOid) {
		this.taskOid = taskOid;
	}
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;		
	}

	public void call(){
		
		try
		{
			Object owner = null;
			executeStartTime = DateHelper.nowTimestamp();
			
			if(UtilHelper.isEmpty(executeClassName)) owner = this.executeClazz;
			else owner = context.getBean(executeClassName);
			
			TaskExecutor taskThreadInvokeExecutor = (TaskExecutor) context.getBean("taskExecutor");
			returnResult = taskThreadInvokeExecutor.processBatchBusinessTask(owner, executeMethod, taskParameter);
		}
		catch(Exception e)
		{			
			failed = true;
			exception = e;			
		}
		
	}

	public void run(){
		this.call();		
	}
	
}
