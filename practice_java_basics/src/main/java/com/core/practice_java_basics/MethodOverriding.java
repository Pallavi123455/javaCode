package com.core.practice_java_basics;

class Parent {
	void run() {
		System.out.println("A dog can run");
	}
}

class Child extends Parent {
	void run() {
		System.out.println("A cat can run");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent mm = new Parent();
		mm.run();
		Child cc = new Child();
		cc.run();
		Parent pp = new Child();
		pp.run();

	}

}
