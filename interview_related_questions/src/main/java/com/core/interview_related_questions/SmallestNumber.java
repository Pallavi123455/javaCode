package com.core.interview_related_questions;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of an array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
