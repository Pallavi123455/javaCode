package com.java.instances;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s = new Service();
		s.m2(); // but no meaning if you access by object
		s.m1();

		System.out.println(s.z);
		System.out.println(s.x);
		System.out.println(s.y);
		
		System.out.println("##########################");
		
	}

}
