package com.core.exceptionprogram;

public class ExampleOfDefaultException {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(100/0);
	}
}
