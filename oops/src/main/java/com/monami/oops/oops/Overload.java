package com.monami.oops.oops;
class Over
{
	void sum(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	void sum(char c)
	{
		System.out.println(c);
	}
}

public class Overload {
public static void main(String[] args) {
	Over aa=new Over();
	aa.sum(4,5);
	aa.sum('A');
}
}
