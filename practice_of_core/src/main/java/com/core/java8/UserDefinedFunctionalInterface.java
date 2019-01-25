package com.core.java8;
interface DemoFunctional
{
	public String animal(String a,String b);
}
public class UserDefinedFunctionalInterface {
	public static void main(String[] args) {
		DemoFunctional aa=(a,b)->a+b;
		System.out.println("Result:"+aa.animal("eat","rice"));
	}

}
