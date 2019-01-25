package com.core.java8;

import java.util.ArrayList;

public class CollectionForEachLoop {
	public static void main(String[] args) {
	ArrayList<String> aa=new ArrayList<String>();
	aa.add("Nitu");
	aa.add("Sniti");
	aa.add("Ruchi");
	
	for(String name:aa)
	{
		System.out.println(name);
	}
	}
}
