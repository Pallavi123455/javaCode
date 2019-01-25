package com.monami.assign;

class A 
{
	
}
class C extends A 
{

}
public class Inherit 
{
	public static void main(String[] args)
	{
		Inherit bb=new Inherit();
		bb.getMyB();
	}
	
	public A getMyB()
	{
		return new C();
	}
}