package com.core.interview_related_questions;

import java.util.Scanner;

public class FindithElementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the Array");
		int inputElement[]=new int[n];
		for(int i=0;i<n;i++)
		{
			inputElement[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to which you want to find");
		int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(inputElement[i]==x)
			{
				System.out.println("The element found in the position=:"+i);
			}
		}
		System.out.println("Enter the position of the element");
		int findPosition=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i==findPosition)
			{
				System.out.println(inputElement[findPosition]);
			}
		}
	}

}
