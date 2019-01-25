package com.core.interview_related_questions;

import java.util.Scanner;

public class SwappingTwoNumbersUsingThirdVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Integers to which you want to swap");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=a+b;
		a=c-a;
		b=c-a;
		System.out.println(" "+a+" "+b);
	}
}
