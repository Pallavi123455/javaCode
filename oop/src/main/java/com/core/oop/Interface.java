package com.core.oop;

class Service2 {
	public static void m1() {
		ICosService aa = new Customer();
		int count=aa.m1();
		//aa.m1();
		System.out.println(count);
	}
}

public class Interface {
	public static void main(String[] args) {
		Service2.m1();

	}
}

interface ICosService {
	int m1();
}

class Customer implements ICosService {

	public int m1() {
		// TODO Auto-generated method stub
		return 20;
	}

}
