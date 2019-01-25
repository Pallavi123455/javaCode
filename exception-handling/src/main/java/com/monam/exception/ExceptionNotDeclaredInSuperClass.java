package com.monam.exception;

import java.io.IOException;

class Super {
	void m()
	{//throws IOException {//Mandatory to declare the Exception Otherwise it will show compile Time Error
		System.out.println("Super Class");
	}

}

public class ExceptionNotDeclaredInSuperClass extends Super {
	void m() throws ArithmeticException {
		System.out.println("TestExceptionChild");

	}

	public static void main(String[] args) {
		Super ss = new ExceptionNotDeclaredInSuperClass();
		try {
			ss.m();
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
