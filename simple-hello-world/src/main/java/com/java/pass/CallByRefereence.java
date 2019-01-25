package com.java.pass;

public class CallByRefereence {
	public static void main(String[] args) {
		int array[]= {100,200};
		System.out.println("THe first element before calling the method is"+array[0]);
		 printArray(array);
		System.out.println("THe first element After calling the method is"+array[0]);
	}
	public static void printArray(int[] value)
	{
		System.out.println("The First element before changing the value is"+value[0]);
		value[0]=123;
		System.out.println("The first element after changing the value is"+value[0]);
	}

}
