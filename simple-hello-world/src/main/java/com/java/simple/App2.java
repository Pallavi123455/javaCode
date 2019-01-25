package com.java.simple;

public class App2 {

	{ // for each object creation
		System.out.println("nsb1");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		App2 a2=new App2();
	}
	
	{
		System.out.println("nsb2");
	}
}
