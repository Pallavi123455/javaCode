package com.core.exam_oriented;

import java.util.Scanner;

public class SumOfTwoElementsInArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the summation which you want ");
		int summation=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int i = 0;
		for (i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] + array[j] == summation) {
					System.out.println("The elements of which summation is 10: " + array[i] + ", " + array[j]);
				}
			}
		}
	}

}
