package com.java.mento;
import java.util.ArrayList;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;
public class ArrayyList {
	public static void main(String[] args) {
		// Implement arraylist add multiple, add all, 
		//contains, reatainAll, removeAll, clear, iteration using for each loop.
		//1.add multiple elements
		ArrayList<Integer> aa=new ArrayList<Integer>();
		ArrayList<Integer> aa1=new ArrayList<Integer>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		System.out.println("Here Multiple elements are added"+aa);
		//2.add all elements
		aa1.add(7);
		aa1.add(8);
		aa1.add(9);
		aa1.add(10);
		aa1.add(11);
		aa1.add(12);
		aa.addAll(aa1);
		System.out.println(aa);
		//8.Iterator
		java.util.Iterator ii=aa.iterator();
		for(Integer a:aa)
			System.out.println(a);
		//3.contains() work
		Boolean b=aa.contains(5);
		System.out.println("Is 5 present in that array:"+b);
		//4.retaianAll()
		aa.retainAll(aa1);
		System.out.println("the retainAll() gives the element"+aa);
		//5.remove a element
		aa.remove(5);
		System.out.println(aa);
		//6.clear all elements
		aa.clear();
		System.out.println(aa);
		//7.removeall()
		aa1.removeAll(aa);
		System.out.println(aa1);
	}

}
