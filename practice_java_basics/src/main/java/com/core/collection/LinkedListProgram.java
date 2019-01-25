package com.core.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
	public static void main(String[] args) {
		LinkedList<String> aa = new LinkedList<String>();
		aa.add("Nitu");
		aa.add("Ritu");
		aa.add("Situ");
		aa.add("Nitu");
		aa.add("Nitu");
		aa.add("Nitu");
		aa.add("Nitu");
		Iterator ii = aa.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}
	}

}
