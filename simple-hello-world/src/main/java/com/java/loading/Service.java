package com.java.loading;

public class Service {

	static{
		System.out.println("sb1");
	}
	{
		System.out.println("nsb1");
	}
	public Service() {
		// TODO Auto-generated constructor stub
		System.out.println("cons");
	}
	
	public void m1()
	{
		System.out.println("m1()");
	}
}
