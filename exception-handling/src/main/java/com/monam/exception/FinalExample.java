package com.monam.exception;

public class FinalExample {
	public static void main(String[] args) {
		final int x=100;
		final int y;
		final int z;
		//x=200;the value can't be modified
		System.out.println(x);
		{
			y=1054;
		}
		{
			z=1234;
		}
		System.out.println(y);
		System.out.println(z);
	}

}
