package com.core.interview_related_questions;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int product=1;
		int input=sc.nextInt();
		for(int i=1;i<=input;i++)
		{
			product=product*i;
		}
		System.out.println(product);
	}

}
