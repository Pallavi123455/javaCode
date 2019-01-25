package com.monami.exam.Exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Titu");
		hm.put(2, "Titu1");
		hm.put(3, "Titu2");
		hm.put(4, "Titu3");
		hm.put(5, "Titu4");
		hm.put(6, "Titu5");
		System.out.println(hm);
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.get(2));
		boolean b = hm.containsKey(5);
		System.out.println(b);
		boolean c = hm.containsValue("Titu5");
		System.out.println(c);
		Set<Integer> s = new HashSet<Integer>();
		s = hm.keySet();
		System.out.println(s);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(hm.size());

	}
}
