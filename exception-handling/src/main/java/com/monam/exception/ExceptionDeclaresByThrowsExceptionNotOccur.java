package com.monam.exception;

import java.io.IOException;

public class ExceptionDeclaresByThrowsExceptionNotOccur {
	void m()throws IOException
	{
		System.out.println("Here Exception not occured");
	}
	public static void main(String[] args) throws IOException {
		ExceptionDeclaresByThrowsExceptionNotOccur aa=new ExceptionDeclaresByThrowsExceptionNotOccur();
		aa.m();
		System.out.println("Code Flow");
		
	}

}
