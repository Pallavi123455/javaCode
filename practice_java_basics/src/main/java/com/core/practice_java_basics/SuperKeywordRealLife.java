package com.core.practice_java_basics;

class SuperRealLife {
	int id;
	String name;

	public SuperRealLife(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
}

class ChildRealLife extends SuperRealLife {
	float salary;

	public ChildRealLife(int id, String name, float salary) {
		// TODO Auto-generated constructor stub
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + "  " + name + "  " + salary);
	}

}

public class SuperKeywordRealLife {
	public static void main(String[] args) {
		ChildRealLife aa = new ChildRealLife(1, "Pallavi", 76453543f);
		aa.display();
	}

}
