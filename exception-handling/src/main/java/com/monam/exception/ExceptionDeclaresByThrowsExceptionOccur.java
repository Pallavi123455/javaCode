package com.monam.exception;

import java.io.IOException;

public class ExceptionDeclaresByThrowsExceptionOccur {
	void m() throws IOException
	{
		throw new IOException("Exception not handled...");
	}
	public static void main(String[] args) throws IOException {
		ExceptionDeclaresByThrowsExceptionOccur aa=new ExceptionDeclaresByThrowsExceptionOccur();
		aa.m();
		System.out.println("IT won't run");
	}

}
