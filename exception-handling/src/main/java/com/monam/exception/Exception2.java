package com.monam.exception;

import java.io.IOException;

public class Exception2 extends Throwable {
	public static void main(String args[]) {
		Exception2 obj = new Exception2();
		obj.p();
		System.out.println("normal flow...");
	}

	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		} catch (IOException ee) {
			System.out.println("exception handled");
		}
	}
}
