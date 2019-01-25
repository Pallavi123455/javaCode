package com.monami.exam.Exam;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
			HashSet<String> aa=new HashSet<String>();
			aa.add("Ramu");
			aa.add("Ramu2");
			aa.add("Ramu3");
			aa.add("Ramu4");
			aa.add("Ramu1");
			aa.add("Ramu2");
			aa.add("Ramu5");
			aa.add("Ramu6");
			System.out.println(aa);
			Boolean b=aa.contains("Ramu");
			System.out.println(b);
			boolean c=aa.isEmpty();
			System.out.println(c);
			Iterator ee=aa.iterator();
			for(String value:aa)
			{
				System.out.println(value);
			}
		}

	}

