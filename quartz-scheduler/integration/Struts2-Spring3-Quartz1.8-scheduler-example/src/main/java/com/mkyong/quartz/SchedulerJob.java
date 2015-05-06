package com.mkyong.quartz;
 
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
 
public class SchedulerJob extends QuartzJobBean
{
 
	protected void executeInternal(JobExecutionContext context)
	throws JobExecutionException {
 
		System.out.println("Struts 2.3.4 + Quartz 1.8.6 + Spring 3.1.2");
 
	}
}