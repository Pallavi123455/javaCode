package com.core.oop;

public class Interface1 {
	public static void main(String[] args) {
		B aa=new C();
		aa.m1();
		aa.m2();
		A a=new C();
		a.m1();

	}
}

interface A {
	void m1();
}
interface B extends A
{
	void m2();
}
class C implements B

{

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}
