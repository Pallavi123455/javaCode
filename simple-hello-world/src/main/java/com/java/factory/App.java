package com.java.factory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = ObjectFactory.createEmployee();
		Student s1 = ObjectFactory.createStudent();
		System.out.println(e1.getId());
		System.out.println(s1.getRollNum());
	}

}
