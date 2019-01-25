package com.java.simple;

public class App1 {

	static {
		System.out.println("sb1");
	}
	static {
		System.out.println("sb2");
	}

	public static void main(String[] args) {

		System.out.println("main");
		
		App1 a1=new App1();
		App1 a2=new App1();
	}

	static {
		System.out.println("sb3");
	}
}
