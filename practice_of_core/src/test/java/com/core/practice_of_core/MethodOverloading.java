package com.core.practice_of_core;

public class MethodOverloading {
	int sid;
	String sname;
	MethodOverloading(int sid,String name)
	{
		this.sid=sid;
		this.sname=sname;
	}
	public MethodOverloading(int sid) {
		// TODO Auto-generated constructor stub
		this.sid=sid;
	}
	void display()
	{
		System.out.println("id:"+sid+"Name:"+sname);
	}
	public static void main(String args[])
	{
		MethodOverloading mm=new MethodOverloading(111);
		MethodOverloading mm2=new MethodOverloading(111,"Pallavi");
		mm.display();
		mm2.display();
	}

}
