package com.monami.exam.equals_hashcode;

public class EqualsOverride {
	private String id;
	public EqualsOverride(String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	public void equals()
	{
		System.out.println("true");
	}

	public static void main(String[] args) {
		EqualsOverride ee=new EqualsOverride("123");
		EqualsOverride ee1=new EqualsOverride("123");
		System.out.println(ee.equals(ee1));
		
	}

}
