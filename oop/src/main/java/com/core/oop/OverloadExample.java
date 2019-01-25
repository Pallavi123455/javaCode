package com.core.oop;

public class OverloadExample {
	public static void main(String[] args) {
		Servicee s = new Servicee();
		int r = s.sum(10, 20);
		System.out.println(r);
		r=s.sum(10, 20, 30);
		System.out.println(r);
	}
}
class Servicee {
	//parameter:they should be different in number,order,type
	//method name should be same
	public int sum(int x, int y) {
		return x + y;
	}

	public int sum(int x, int y, int z) {
		return x + y + z;
	}
}
