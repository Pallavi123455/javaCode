package com.java.mento;

import java.util.HashSet;

public class HashhSet {

	public static void main(String[] args) {
		//  Implement hashset add multiple, contains, isEmpty,remove, size.
		HashSet<Integer> hh=new HashSet<Integer>();
		//1.add multiple elements
		hh.add(1);
		hh.add(2);
		hh.add(3);
		hh.add(4);
		hh.add(5);
		hh.add(6);
		hh.add(7);
		hh.add(8);
		hh.add(9);
		hh.add(10);
		hh.add(11);
		hh.add(12);
		System.out.println(hh);
		//2.contains()
		Boolean b=hh.contains(13);
		System.out.println("is the HashSet contains 13"+b);
		//3.isEmpty()
		Boolean c=hh.isEmpty();
		System.out.println(c);
		//5.size()
		int d=hh.size();
		System.out.println("The size of the HashSet"+d);
		//4.remove()
		hh.remove(12);
		hh.remove(1);
		hh.remove(2);	
		System.out.println(" After removal of elwments HashSet contains"+hh);
		//5.size()
		int e=hh.size();
		System.out.println("The size of the HashSet"+e);

	}

}
