package com.mkyong.common;
 
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.Trigger;
import java.util.Date;
 
 //Run every 3 seconds.
public class CronTriggerExample 
{
    public static void main( String[] args ) throws Exception
    {
 
    	JobDetail job = new JobDetail();
    	job.setName("dummyJobName");
    	job.setJobClass(HelloJob.class);
 
    	CronTrigger trigger = new CronTrigger();
    	trigger.setName("dummyTriggerName");
    	trigger.setCronExpression("0/3 * * * * ?");
 
    	//schedule it
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);
		
		//How to list all Jobs in the Quartz Scheduler
		//url: http://www.mkyong.com/java/how-to-list-all-jobs-in-the-quartz-scheduler/
		
		//loop all group
		for (String groupName : scheduler.getJobGroupNames()) {	 
			//loop all jobs by groupname
			for (String jobName : scheduler.getJobNames(groupName)) {
		 
				  //get job's trigger
			  Trigger[] triggers = scheduler.getTriggersOfJob(jobName,groupName);
			  Date nextFireTime = triggers[0].getNextFireTime();
		 
			  System.out.println("[jobName] : " + jobName + " [groupName] : "
					+ groupName + " - " + nextFireTime);
		 
			}	 
		}
 
    }
}