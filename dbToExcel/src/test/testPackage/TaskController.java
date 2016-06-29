package test.testPackage;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.apache.log4j.Logger;
import org.quartz.CronTrigger;

/**
 * 
 * @author 强
 * 定时任务控制类
 *
 */
public class TaskController implements ServletContextListener {
	@SuppressWarnings("unused")
	 private static final SimpleTrigger CronTrigger = null;
	 public static void main(String[] args){
	  try {
		  Logger log = Logger.getLogger(TaskController.class);
	   test();
	  } catch (Exception e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	    }

	public static void test(){
		//通过SchedulerFactory来获取一个调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler;
        try {
        	   scheduler = schedulerFactory.getScheduler();
        	  
        	        //引进作业程序
        	        JobDetail jobDetail = 
        	        new JobDetail("jobDetail-s1", "jobDetailGroup-s1", DmsTimedTaskJobAction.class);
        	         //new一个触发器
        	        SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", "triggerGroup-s1");
        	        CronTrigger trigger =  new CronTrigger("Test", Scheduler.DEFAULT_GROUP, "0 0 9 * * ?");  //表示每天9点执行
        	        //在8-17之间每1分钟执行一次,并且为10秒间隔
//        	        CronTrigger trigger = new CronTrigger("Test", Scheduler.DEFAULT_GROUP, "0/10 0/1 8-23 * * ?");  //表示每天9点执行
//        	        CronTrigger trigger = new Trigger().set  //表示每天9点执行
        	      //表示每20秒执行一次 
//        	        CronTrigger trigger = new Trigger().withIdentity("trigger1", "group1").withSchedule(cronSchedule("0/20 * * * * ?")).build();
        	        //设置作业启动时间 
//        	        long ctime = System.currentTimeMillis()+1000*30;  //表示30秒之后启动 测试时用1000*5
//        	        long ctime = System.currentTimeMillis()+1000*5; 
//        	        simpleTrigger.setStartTime(new Date(ctime));
        	        Calendar cal = Calendar.getInstance();   
        	        trigger.setStartTime(cal.getTime());
        	        //设置作业执行间隔 
//        	        simpleTrigger.setRepeatInterval(1000*18000); //设置成每天5个小时提醒一次18000 测试时用300
//        	        simpleTrigger.setRepeatInterval(1000*300); //设置成每天5个小时提醒一次18000 测试时用300
        	        //设置作业执行次数
        	        //simpleTrigger.setRepeatCount(-1);  //测试时用10，-1表示无限次
        	       
        	        //设置作业执行优先级默认为5
        	       // simpleTrigger.setPriority(10);
        	         
        	        //作业和触发器设置到调度器中
        	        scheduler.scheduleJob(jobDetail, trigger);
        	        
        	        //启动调度器
        	        scheduler.start();
        	  } catch (SchedulerException e) {
        	   // TODO Auto-generated catch block
        	   System.out.println("启动定时任务失败！");
        	  } catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		test();
	}

}
