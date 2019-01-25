package com.core.core;

public class Overload {
	public static void main(String[] args) {
		Overload aa=new Overload();
		aa.display(5);
		aa.display(4,5);
	}
	public void display(int a)
	{
		int areaOfSquare=a*a;
		System.out.println("Area="+areaOfSquare);
	}
	public void display(int a,int b)
	{
		int areaOfRectangle=a*b;
		System.out.println("Area="+areaOfRectangle);
	}
}
