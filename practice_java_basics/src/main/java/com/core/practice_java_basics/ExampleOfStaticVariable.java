package com.core.practice_java_basics;

class Student {
	private String name;
	private int rollNo;
	static String collegeName = "NC";
Student(String n,int r)
{
	name=n;
	rollNo=r;
}
void display()
{
	System.out.println("Name is"+name+"  Roll No Is"+rollNo+"   College Name Is"+collegeName);
}
}
public class ExampleOfStaticVariable {
public static void main(String[] args) {
	Student s1=new Student("Raju", 11);
	Student s2=new Student("Jiten", 12);
	s1.display();
	s2.display();
}
}
