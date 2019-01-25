package com.core.exam_oriented;

import java.util.Scanner;

public class EqualityOfTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of two arrays");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the elements of the first array");
		int inputFirstArray[] = new int[a];
		boolean equal = false;
		for (int i = 0; i < a; i++) {
			inputFirstArray[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of the second array");
		int[] inputSecondArray = new int[b];
		for (int i = 0; i < b; i++) {
			inputSecondArray[i] = sc.nextInt();
		}
		if (inputFirstArray.length == inputSecondArray.length) {
			for (int i = 0; i < a; i++) {
				if (inputFirstArray[i] == inputSecondArray[i]) {
					equal = true;
				}

			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal ");
		}
	}
}
