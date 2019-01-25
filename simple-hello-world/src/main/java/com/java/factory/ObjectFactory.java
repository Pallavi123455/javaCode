package com.java.factory;

public class ObjectFactory {

	public static Employee createEmployee() {
		// complexity of creatinbg obvject is hiden here
		Employee e = new Employee();
		e.setId(10);
		return e;
	}

	public static Student createStudent() {
		Student s = new Student();
		s.setRollNum(1000);
		return s;
	}
}
