package com.java.simple;

public class App4 {
	static {
		System.out.println("sb1");
	}
	{
		System.out.println("nsb1");
	// 	App4 a5=new App4(); // stack overflow error beacuse current class object
	}

	
	// look at object class ctrl shift t
	App2 a4=new App2(); // different class object 
	public static void main(String[] args) {
		System.out.println("main");
		
		App4 a4=new App4();
		App4 a5=new App4();
		
	}
}
