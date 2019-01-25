package com.java.pass;

public class CallByValue {
	public static void main(String[] args) {
		int num;
		num=100;
		System.out.println("The value of the number Before passing the method"+num);
		change(num);
		System.out.println("The value of the number after passing the method"+num);
	}
	public static void change(int p)
	{
		System.out.println("The value of p is:"+p);
		p=p+100;
		System.out.println("the value of P is"+p);
	}

}
