package com.monami.assign;

public class Demo {

	public Demo(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Demo aa=new Demo("123");
		Demo aa1=new Demo("123");
		System.out.println(aa.equals(aa1));
		String str=new String("123");
		String str1=new String("123");
		System.out.println(str.equals(str1));
		Integer it=256;
		Integer it1=256;
		System.out.println(it.equals(it1));
		System.out.println(it==it1);
		
		

	}

}
