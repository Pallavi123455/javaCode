package com.java.statics;

public class App {

	public static void main(String[] args) {
		System.out.println(Service.x);
		System.out.println(Service.y);

		// System.out.println(Service.z); // CE: Cannot make a static reference to the
		// non-static field Service.z

		Service.m2();
		// Service.m1(); // CE: Cannot make a static reference to the non-static method
		 //m1();
		// from the type
		// Service
	}
}
