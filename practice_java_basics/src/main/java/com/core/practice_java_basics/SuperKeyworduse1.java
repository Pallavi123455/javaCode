package com.core.practice_java_basics;

class A {
	void m() {
		System.out.println("Man is Mortal");
	}
}

class B extends A {
	void m() {
		System.out.println("Every living Organisim Is too mortal");
	}

	void display() {
		super.m();
		m();
	}
}

public class SuperKeyworduse1 {
	public static void main(String[] args) {
		B aa = new B();
		aa.display();
	}

}
