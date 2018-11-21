package com.cust;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.frame.Dao;

//annotation안하겠다는 의미 
public class CustDao implements Dao<String, Cust> {
	
	String dbip;
	
	public String getDbip() {
		return dbip;
	}

	public void setDpip(String dbip) {
		this.dbip = dbip;
	}

	@Override
	public void insert(Cust v) {
		System.out.println(v);
		System.out.println(dbip+"Inserted...");
	}

	@Override
	public void delete(String k) {
		System.out.println(k);
		System.out.println("Deleted...");		
	}

	@Override
	public void update(Cust v) {
		System.out.println(v);
		System.out.println("Updated...");			
	}

	@Override
	public Cust select(String k) {
		return new Cust("id34","pwd34","Kim",34);
	}


	@Override
	public ArrayList<Cust> select() {
		// TODO Auto-generated method stub
		ArrayList<Cust> list = new ArrayList<>();
		list.add(new Cust("id34","pwd34","Kim",34));
		list.add(new Cust("id35","pwd35","Lee",35));
		list.add(new Cust("id36","pwd36","Han",36));
		list.add(new Cust("id37","pwd37","Hong",37));
		list.add(new Cust("id38","pwd38","Jun",38));
		list.add(new Cust("id39","pwd39","Joo",39));
		return list;
	}

}
