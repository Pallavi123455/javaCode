package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
	public static void main(String[] args) {
		ArrayList<Student> listStrings = new ArrayList<Student>();
		listStrings.add(new Student(1, "Pallavi", 18));
		listStrings.add(new Student(2, "allavi", 18));
		listStrings.add(new Student(3, "llavi", 18));
		listStrings.add(new Student(4, "llavi", 18));
		listStrings.add(new Student(5, "Plavi", 18));
		Comparator<Student> cm1 = Comparator.comparing(Student::getName);
		Collections.sort(listStrings, cm1);
		System.out.println("Sorting by Name");
		for (Student st : listStrings) {
			System.out.println(st.id + " " + st.name + " " + st.age);
		}
	}

}
