package com.core.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Pallavi");
		aa.add("Nitu");
		Iterator itr = aa.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
