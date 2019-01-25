package com.core.interview_related_questions;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term upto which you want to print the fibonacci series");
		int n=sc.nextInt();
		int firstTerm=0;
		int secondTerm=1;
		int c=0;
		System.out.println(0);
		for(int i=1;i<n;i++)
		{
			firstTerm=secondTerm;
			secondTerm=c;
			c=firstTerm+secondTerm;
			System.out.println(c);
		}
		
	}

}
