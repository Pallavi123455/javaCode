package com.core.practice_java_basics;

import java.util.Scanner;

public class Employee {
	int e_id;
	String e_name;
	Address address;

	public Employee(int id, String name, Address address) {
		// TODO Auto-generated constructor stub
		this.e_id = id;
		this.e_name = name;
		this.address = address;
	}

	void display() {
		System.out.println(e_id + "   " + e_name);
		System.out.println(address.building_no + "    "+address.city);
	}

	public static void main(String[] args) {
		Address aa = new Address(111, "Jajpur", 12313);
		Employee ee = new Employee(1, "Suresh", aa);
		ee.display();

	}

}
