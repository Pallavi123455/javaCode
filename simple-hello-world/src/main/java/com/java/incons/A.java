package com.java.incons;

public class A {
	int x;

	public A() { // if you dont have this then call explicitly constructor from the child
		// TODO Auto-generated constructor stub
		System.out.println("A()");
	}

	public A(int x) {
		System.out.println("A(.)");
		this.x = x;
	}

}
