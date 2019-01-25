package com.monami.exam.equals_hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentMoverride1 {
	public static void main(String[] args) {
		{
			StudentOverride1 ss = new StudentOverride1("pallavi", 23);
			StudentOverride1 ss1 = new StudentOverride1("Pallavi", 24);
			StudentOverride1 ss2 = new StudentOverride1("pallavi", 25);
			StudentOverride1 ss3 = new StudentOverride1("pallavi", 26);
			List<StudentOverride1> aa=new LinkedList<StudentOverride1>();
			aa.add(ss);
			aa.add(ss1);
			/*HashSet<StudentOverride1> aa=new HashSet<StudentOverride1>();
			aa.add(ss);*/
			System.out.println(ss.equals(ss3));
			System.out.println("Student1 hashcode" + ss.hashCode() + "Student2 hashcode" + ss2.hashCode());

		}
	}

}
