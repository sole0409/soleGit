package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendars {
	private  static int ACT_BEGIN_TIME_1 = 10;
	private  static int ACT_END_TIME_1 = 15;
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//	System.out.println(sdf.format(new Date()));
		
		Calendar cc = Calendar.getInstance();
		// …Ë÷√ ±º‰
		cc.set(Calendar.MINUTE, 0);
		cc.set(Calendar.SECOND, 0);	    
		cc.set(Calendar.HOUR_OF_DAY, ACT_BEGIN_TIME_1);
		Long beginTime1 = cc.getTime().getTime();
		cc.set(Calendar.MINUTE, 59);
		cc.set(Calendar.SECOND, 59);	    
		cc.set(Calendar.HOUR_OF_DAY, ACT_END_TIME_1);
		Long endTime1 = cc.getTime().getTime(); 
		if(new Date().getTime() < beginTime1){
			System.out.println("11111");
		}else if(new Date().getTime()>= beginTime1 && new Date().getTime() <= endTime1){
			System.out.println("22222");
		}
		System.out.println(sdf.format(beginTime1));
	}

}
