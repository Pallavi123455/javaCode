package com.core.interview_related_questions;

import java.util.Scanner;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth element in the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
