//Write a java program to find the intersection of two arrays?
package com.core.exam_oriented;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the  Two arrays");
		int A[];
		int B[];
		int a = sc.nextInt();
		int b = sc.nextInt();
		A = new int[a];
		B = new int[b];
		for(int i=0;i<a;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			B[i]=sc.nextInt();
		}
		//ArrayList<Integer> aa=new ArrayList<Integer>();
		for (int i= 0; i< a; i++) {
			for(int j=0;j<b;j++)
			{
				if(A[i]==(B[j]))
				{
					System.out.println(A[i]);
				}
			}
		}
	}
}
