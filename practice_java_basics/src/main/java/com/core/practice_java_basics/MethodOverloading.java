package com.core.practice_java_basics;

public class MethodOverloading {
	void m(char c) {
		System.out.println(c);
	}

	void m(String name) {
		System.out.println(name);
	}

	void m(int a) {
		System.out.println(a);
	}

	void m(byte b) {
		System.out.println(b);
	}

	void m(boolean ab) {
		System.out.println(ab);
	}

	void m(short pp) {
		System.out.println();
	}

	void m(long aaa) {
		System.out.println(aaa);
	}

	public static void main(String[] args) {
		MethodOverloading mm = new MethodOverloading();
		mm.m(false);
		mm.m(12);
		mm.m('a');
		mm.m(15);
		mm.m(12131);
		mm.m(1);
		mm.m("Sohani");
	}

}
