package test.testPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import test.ExcelTest;

public class DmsTimedTaskJobAction implements Job {
	public DmsTimedTaskJobAction(){
		super();
	}
	
	/** 
	 * 所有需要执行的定时任务，都要写在这个方法体内
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("=============================================================================================");
		  System.out.println(new SimpleDateFormat("yy年MM月dd日 hh:mm:ss").format(new Date()));
		  
		  try {
		   System.out.println("********通知:定时任务启动！********");
		   DBtoExcel.main(null);
		   //这里添加具体需要执行的方法，这里把我系统中的方法去掉了
		   System.out.println("********通知:定时任务顺利结束！********");
		  } catch (Exception e) {
		   System.out.println("********通知:定时任务执行失败！DBtoExcel.main(null)抛出异常了********");
		  }
		  System.out.println("=============================================================================================");
	}

}
