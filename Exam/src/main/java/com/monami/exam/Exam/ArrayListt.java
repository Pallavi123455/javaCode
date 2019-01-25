package com.monami.exam.Exam;

import java.util.ArrayList;

public class ArrayListt {
	public static void main(String[] args) {
		ArrayList<String> aa=new ArrayList<String>();
		ArrayList<String> aa1=new ArrayList<String>();
		aa.add("A");
		aa.add("B");
		aa.add("I");
		 aa.clear();
		aa.add("D");
		aa.add("E");
		aa.add("I");
		System.out.println(aa);
		aa1.add("F");
		aa1.add("G");
		aa1.add("H");
		aa1.add("I");
		aa.addAll(aa1);
		System.out.println(aa.lastIndexOf("I"));
		System.out.println(aa);
		System.out.println(aa1);
		Object[] aaa=aa1.toArray();
		for(String value:aa)
		{
			System.out.println(value);
		}
		Object[] aaa1=aa1.toArray(aaa);
		for(String value:aa)
		{
			System.out.println("\n"+value);
		}
		aa1.addAll(1,aa);
		System.out.println(aa1);
	}
	}
	


