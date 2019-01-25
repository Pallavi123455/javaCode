package com.java.mento;

import java.util.HashMap;
import java.util.Map;

public class HashhMap {

	public static void main(String[] args) {
		// Implement hashmap put, puAll, containsKey, containsValue,
		// Iteration using entrySet
		// 1.add some elements
		HashMap<Integer, String> aa = new HashMap<Integer, String>();
		aa.put(1, "pallu");
		aa.put(2, "oolu");
		aa.put(3, "kulu");
		aa.put(4, "galu");
		aa.put(1, "pallu");
		aa.put(5, "oolu");
		aa.put(6, "kullu");
		aa.put(7, "kulu");
		aa.put(8, "HHa");
		aa.put(9, "fdfads");
		aa.put(10, "hjsh");
		System.out.println("the key and values of HashMap are" + aa);
		// 2.putAll()
		HashMap<Integer, String> aa1 = new HashMap<Integer, String>();
		aa1.put(1, "Sahi");
		aa1.put(1, "Sahi");
		aa1.put(12, "Sahi1");
		aa1.put(13, "Sahi2");
		aa1.put(14, "Sahi3");
		aa1.put(15, "Sahi4");
		aa.putAll(aa1);
		System.out.println("putAll" + aa1);
		// 3.containsKey()
		Boolean b = aa.containsKey(4);
		System.out.println("containsKey" + b);
		// 4.containsValue()
		Boolean c = aa.containsValue("Sahi");
		System.out.println("containsValue" + c);
		// 5.Iteration using entrySet
		for (Map.Entry m : aa.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
