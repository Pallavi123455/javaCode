package com.core.interview_related_questions;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the  position in which you want to delete the element");
		int p = sc.nextInt();

		for (int i = p; i < a.length-1; i++) {
			a[i] = a[i + 1];
			System.out.println(a[i]);
		}
		System.out.println(a);
	}
}
