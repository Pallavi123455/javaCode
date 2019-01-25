package com.java.inheri;

public class App1 {
	int x=10;
	final int y=20; // it cant be change but not shareable without object
	//final int z; // must be initialized
	{
		// y=40;// final vars cant be reasigned
	}
	
	static int w=30; // it is shareable but can be changed, so it is a varible
	
	final static int r=40; // shareable and cannt be changed=constant
	
	public static void main(String[] args) {
		App1 a1=new App1();
		System.out.println(a1.x);
		
		App1 a2=new App1();
		a2.w=50;
		
		App1 a3=new App1();
		System.out.println(a3.w); // 50 because shareable
		
		//a3.r=90;// final var we cant change
		System.out.println(a3.r);
		System.out.println(a2.r);
	}
}
