package com.core.interview_related_questions;

import java.util.Scanner;

public class FibonacciUptoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth series upto which I want to print fibonacci series");
		int n=sc.nextInt();
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				firstNumber=secondNumber;
				secondNumber=thirdNumber;
				thirdNumber=firstNumber+secondNumber;
			}
		}
	}

}
