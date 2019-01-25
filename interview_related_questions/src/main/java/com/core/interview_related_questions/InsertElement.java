package com.core.interview_related_questions;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of the element in the array");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want to insert element");
		int pos=sc.nextInt();
		System.out.println("Enter the elements you want to insert");
		int x=sc.nextInt();
		for(int i=n-1;i>=(pos-1);i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
