package com.core.interview_related_questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToTheFrontEndOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[n];
		int counter = array.length - 1;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[counter] = array[i];
				counter--;
			}
		}
		while (counter >= 0) {
			array[counter] = 0;
			counter--;
		}

		// System.out.println(counter);
		System.out.println(Arrays.toString(array));
	}

}
