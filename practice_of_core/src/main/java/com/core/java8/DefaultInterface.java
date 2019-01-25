package com.core.java8;
interface Demo
{
	default void example()
	{
		System.out.println("Featue of java8");
	}
}

public class DefaultInterface {
	public static void main(String[] args) {
		DefaultInterface aa=new DefaultInterface();
		aa.example();
	}

	

}
