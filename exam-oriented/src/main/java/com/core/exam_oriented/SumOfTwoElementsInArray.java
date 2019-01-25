package com.core.exam_oriented;

import java.util.Scanner;

public class SumOfTwoElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the Summation to which you want to print");
		int summation = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]+array[j]==summation)
				{
					System.out.println("The summation is"+summation+"and the operands are"+array[i]+" , "+array[j]);
				}
			}
		}

	}

}
