package com.core;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.name = string;
		this.age = j;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (age == o.age)
			return 0;
		else if (age < o.age) {
			return 1;
		} else {
			return -1;
		}
	}

}
