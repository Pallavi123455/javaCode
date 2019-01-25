package com.core.exam_oriented;

import java.util.Scanner;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the two array");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the elements of the first array");
		int array1[] = new int[a];
		for (int i = 0; i < a; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements of the Second array");
		int array2[] = new int[b];
		for (int i = 0; i < b; i++) {
			array2[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}

}
