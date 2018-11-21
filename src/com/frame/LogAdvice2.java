package com.frame;

//import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogAdvice2 {
	public static void logger(JoinPoint point) {
		System.out.println("***************************");
		//Date d = new Date();
		System.out.println(point.getSignature().getName());
		System.out.println(point.getArgs()[0].toString());	
		System.out.println();
		System.out.println("***************************");
	}
	//around
	public Object aroundLogger(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		//custbiz�� get �ִ� �Լ��� ����ȴٴ� �ǹ̿� ����. 
		System.out.println("Before ....");
		//System.out.println(pjp.getSignature().getName());
		//System.out.println(pjp.getArgs()[0].toString());
		System.out.println("---------------");
		StopWatch watch = new StopWatch();
		watch.start();
		result = pjp.proceed();
		Thread.sleep(398);
		watch.stop();
		System.out.println(watch.getTotalTimeMillis());
		System.out.println("---------------");
		//System.out.println(result);
		System.out.println("After ....");
		return result;
	}
	
	 public void exLogger(JoinPoint jp, Exception ex) {
		 System.out.println(ex.getMessage());
		 
	}
	
	
	
	
	
	
	
}
