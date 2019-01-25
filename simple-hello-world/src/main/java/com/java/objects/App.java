package com.java.objects;

public class App {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(10);
		
		Employee e2=new Employee();
		e2.setId(20);
		
		Employee e3=e2;
		
		e2=e1;
		
		System.out.println(e3.getId()); // 20
		System.out.println(e2.getId()); // 20
		
		e2.setId(30);
		
		System.out.println(e3.getId()); // 20
		System.out.println(e1.getId()); // 30
		System.out.println(e2.getId()); // 30
	}
}
