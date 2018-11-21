package com.frame;

//import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {
	public static void logger(JoinPoint jp, Object obj) {
		System.out.println("***************************");
		//Date d = new Date();
		System.out.println(jp.getSignature().getName());
		System.out.println(jp.getArgs()[0].toString());
		
		System.out.println(obj.toString()); //예외발생시 나올 결과
		System.out.println("***************************");
		
		//Date d = new Date();
		//String str = "";
		//str += d.toString();
		//str += d.getTime();
		//System.out.println(str);
		
	}
}
