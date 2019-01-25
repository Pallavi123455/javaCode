package com.monam.exception;

import java.io.IOException;

public class Exception3 {
	public static void main(String[] args) {
		try {
			Exception3 ee = new Exception3();
			ee.m();
		} catch (Exception e) {
			System.out.println("Error handled");
		}
	}

	void m() throws IOException {
		throw new IOException("Device error");
	}
}
