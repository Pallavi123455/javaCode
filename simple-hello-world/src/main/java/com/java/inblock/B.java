package com.java.inblock;

public class B extends A {
	static {
		System.out.println("sb1:b");
	}
	{
		System.out.println("nsb1: b");

		System.out.println(this.getClass());
	}

	B() {
		System.out.println("B()");
	}

}
