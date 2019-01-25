package com.core.increament;


public class PreIncrementOperator {
	public static void main(String[] args) {
		Increment aa=new Increment();
		aa.call();
		aa.call();
		aa.call();
		
	}
}
	class Increment
	{
		static int c=0;
		int a=20;
		int b=30;
		void call()
		{
		a++;
		System.out.println("Value of b is"+b++);
		System.out.println("Value Of a is"+a);
		System.out.println("Value of c is"+c);
		c++;
	}

}

