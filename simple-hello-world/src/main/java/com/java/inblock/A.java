package com.java.inblock;

public class A {
	static {
		System.out.println("sb1:a");
	}
	{
		System.out.println("nsb1: a");

		System.out.println(this.getClass());
	}

	A() {
		System.out.println("A()");
	}
}
