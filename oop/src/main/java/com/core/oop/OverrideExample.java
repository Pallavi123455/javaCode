package com.core.oop;

public class OverrideExample {
	public static void main(String[] args) {
		// method overriding

		Serviceee.m1();
	}
}

class Parent {
	public int m1() {
		return 10;
	}

	public int m2() {
		return 30;
	}

	public int m3(int x) {
		return 40;
	}

	public int m4(int x) {
		return 50;
	}

}

class Child extends Parent {
	// parent m2 is available due to inheritance
		// first priorty is child method . if not exists call the inherited parent method
		
	public int m2() {
		return 20;
	}

	public int m3(int x) {
		return 400;
		// m3 with int is avilable due to inheritance
		// child m4-> parent m4(int), child m4(long) -> overloading
	}

	public int m4(long x) {
		return 800;
	}
}

class Serviceee {
	public static void m1() {
		Parent p = new Parent();
		int r = p.m1();
		System.out.println(r);
		p = new Child();// overriding
		r = p.m2();
		System.out.println(r);
		p = new Parent();
		r = p.m3(100);
		System.out.println(r);
		p = new Child();
		r = p.m3(200);
		System.out.println(r);
		// int < long
		int x = 10;
		long y = x;

		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		p = new Parent();
		r = p.m4(300);
		System.out.println(r);
		p = new Child();
		r = p.m4(993456788);
		System.out.println(r);

	}
}
