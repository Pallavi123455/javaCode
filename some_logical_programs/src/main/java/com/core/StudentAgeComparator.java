package com.core;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.name.compareTo(s2.name);

	}

}
