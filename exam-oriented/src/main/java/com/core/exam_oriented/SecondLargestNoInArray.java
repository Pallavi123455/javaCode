package com.core.exam_oriented;

import java.util.Scanner;

public class SecondLargestNoInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		int firstlargest;
		int secondlargest;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		firstlargest = array[0];
		secondlargest = array[1];
		if (array[0] > array[1]) {
			array[0] = firstlargest;
			array[1] = secondlargest;
		} else {
			array[1] = firstlargest;
			array[0] = secondlargest;

		}
		for (int i = 2; i < n; i++) {
			if (array[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = array[i];

			} else if (array[i] < firstlargest && array[i]>secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println("SeconLargest element in array is" + secondlargest);
	}

}
