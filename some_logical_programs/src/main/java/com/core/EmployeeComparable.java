package com.core;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {
	public static void main(String[] args) {
		ArrayList<Employee> aa = new ArrayList<Employee>();
		aa.add(new Employee(101, "Pallavi", 20));
		aa.add(new Employee(102, "allavi", 20));
		aa.add(new Employee(103, "llavi", 20));
		aa.add(new Employee(104, "avi", 20));
		aa.add(new Employee(105, "vi", 20));
		aa.add(new Employee(106, "i", 20));
		Collections.sort(aa);
		for(Employee emp:aa)
		{
			System.out.println(emp.id+""+emp.name+""+emp.age);
		}
		
	}

}
