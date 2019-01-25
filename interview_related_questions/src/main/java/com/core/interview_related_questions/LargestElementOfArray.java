package com.core.interview_related_questions;

import java.util.Scanner;

public class LargestElementOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of element");
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
