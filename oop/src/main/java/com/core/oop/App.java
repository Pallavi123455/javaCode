package com.core.oop;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// method overriding

		Service1.m1();
	}
}

class Parentt {
	public int m1() {
		return 10;
	}
	
	public int m2()
	{
		return 30;
	}
	
	public int m3(int x)
	{
		return 200;
	}
	
	public int m4(int x)
	{
		return 300;
	}
	
}

class Childd extends Parentt {

	public int m1() {
		return 20;
	}
	// parent m2 is available due to inheritance
	// first priorty is child method . if not exists call the inherited parent method
	
	public int m3(int x)
	{
		return 500;
	}
	
	// m3 with int is avilable due to inheritance
	// child m4-> parent m4(int), child m4(long) -> overloading
	public int m4(long x)
	{
		return 800;
	}
}

class Service1 {
	public static void m1() {
		Parentt p = new Parentt ();
		int r = p.m1();
		System.out.println(r);

		p=new Childd();// overriding
		r=p.m1();
		System.out.println(r);
		
		p=new Parentt();
		r=p.m2();
		System.out.println(r);
		
		p=new Childd();
		r=p.m2();
		System.out.println(r);
		
		p=new Parentt();
		r=p.m3(200);
		System.out.println(r);
		
		p=new Childd();
		r=p.m3(200);
		System.out.println(r);
		
		
		// int < long
		 int x=10;
		 long y =x;
		
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		
		p=new Childd();
		r=p.m4(200);
		System.out.println(r);
	}
}