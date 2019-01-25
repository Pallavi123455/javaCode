package com.java.inheri;

public class App {
	public static void main(String[] args) {
		Child c=new Child();
		c.m1(); // parent
		c.m2(); // child over
		c.m3(); // child
		
		Parent p=new Child();
		p.m1(); // parent
		p.m2(); // child over or child impl
		//p.m3();
		
		c.setX(10);
		System.out.println(c.getX()); // child value will be called
		System.out.println(p.getX()); // child over impl but parent value will be called
		
		p.setX(20);
		System.out.println(p.getX()); // parent value will be returned from the child impl
		
		System.out.println(p);
		
		p.m4(); // Parent.m4()
		c.m4(); // Child.m4()
		
		p=null;c=null;
		p.m4(); // Parent.m4()
		c.m4(); // Child.m4()
		
	}
}
