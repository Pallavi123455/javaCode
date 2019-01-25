package com.monami.assign;

/**
 * Hello world!
 *
 */
class B
{
	public void m1() // not using static keyword here because this is a instance method
	{
		System.out.println("instance method: m1()");
	}
	
	public String m2() // not using static keyword here because this is a instance method
	{
		String name="John";
		return name;
	}
}

class App 
{
	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		System.out.println(b.m2());
	}
}