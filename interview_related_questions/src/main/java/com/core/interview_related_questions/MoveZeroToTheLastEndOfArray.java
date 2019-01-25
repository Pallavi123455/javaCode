package com.core.interview_related_questions;

import java.util.Scanner;

public class MoveZeroToTheLastEndOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		int count=0;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(array[i]!=0)
			{
				array[count]=array[i];
			}
		}
		if(count<=array.length)
		{
			array[count]=0;
		}
	}

}
