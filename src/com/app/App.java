package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cust.Cust;
import com.frame.Biz;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");

		Biz biz = (Biz) factory.getBean("cbiz");
		
		Cust cust = new Cust("id02","pwd01","james",10);
		
		try {
			biz.register(cust);
		} catch (Exception e) {
			System.out.println("Ex.... ");
		} finally {
			System.out.println("Final....");
		}
		
		//Cust dbcust = null;
		//try {
		//	dbcust = (Cust) biz.get("id03");
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}	
		
		//System.out.println(dbcust);
		
	
	}

}
