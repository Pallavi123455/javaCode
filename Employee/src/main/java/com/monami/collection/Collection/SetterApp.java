package com.monami.collection.Collection;

import com.monami.collection.model.Employee;
import com.monami.collection.model.SetterEmployee;

public class SetterApp {
	public static void main(String[] args) {
		SetterApp aa=new SetterApp();
		aa.getApp();
	}
		public SetterEmployee getApp()
		{
		SetterEmployee ee = new SetterEmployee();
		ee.setId(12);
		ee.setName("Pallavi");
		ee.setAddress("Jajpur");
		return ee;
		System.out.println(ee.getId()+""+ee.getName()+""+ee.getAddress());
		}
		
		}
			


