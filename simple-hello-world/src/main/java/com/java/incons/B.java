package com.java.incons;

public class B extends A {

	public B() {
		// TODO Auto-generated constructor stub
		// super(); // after compilation by default
		// I dont have A().
		// so I have to call explict another constructor parent
		super(10); // super() constructor calls must be first line in the constructor
		System.out.println(super.x);
		System.out.println("B()");

	}
}
