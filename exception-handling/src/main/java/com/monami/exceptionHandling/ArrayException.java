package com.monami.exceptionHandling;

public class ArrayException {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println("Access the First Element" + a[0]);
			System.out.println("Acess the  th Elementy" + a[6]);//We can't access the 6Th element as the array size is declared as 6.

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}
