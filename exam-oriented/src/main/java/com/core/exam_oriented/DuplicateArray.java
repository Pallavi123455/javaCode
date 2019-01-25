//To find the duplicate element in array.
package com.core.exam_oriented;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the element of the array");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]==array[j])
				{
					int count=0;
					System.out.println("Duplicate element is"+array[i]);
					count++;
					System.out.println("The element"+array[i]+"is repeated"+count+"times");
				}
			}
		}
	}

}
