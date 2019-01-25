package com.java.instances;

public class Service {

	public static int x;
	public static int y = 10;
	public int z = 20;

	public void m1() {
		System.out.println("m1()");
	}

	public static void m2() {
		//m1(); // CE: Cannot make a static reference to the non-static method m1() from the type Service
		Service s=new Service();
		s.m1();
		System.out.println("m2()");
		
	}

}
