package com.core.oop;

public class ReturnTypeExample {

	public static void main(String[] args) {
		/*
		 * static methods, non static methods, return types, void, return statements
		 */
		Service.m2();
		Service aa = new Service();
		aa.m1();
		int r = aa.m3();
		System.out.println(r);
		aa.m4(10);
		aa.m4(100);
		int r1 = aa.m5(10);
		System.out.println(r1);
		r1 = aa.m5(100);
		System.out.println(r1);
	}
}

class Service {
	public void m1() {
		System.out.println("Hii");
	}

	public static void m2() {
		System.out.println("Hello");
	}

	public int m3() {
		System.out.println("m3");
		return 10;
	}

	public void m4(int x) {
		if (x == 10) {
			System.out.println("I am returning");
		}
		System.out.println("m4");
	}

	public int m5(int x) {
		if (x == 10) {
			System.out.println("I am returning m5");
		}
		System.out.println("I am executing m5");
		return 20;
	}

}
