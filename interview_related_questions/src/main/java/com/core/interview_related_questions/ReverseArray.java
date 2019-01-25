package com.core.interview_related_questions;

import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numers of elements in array");
	int n=sc.nextInt();
	System.out.println("Enter the elements in the array");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=n-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
}
