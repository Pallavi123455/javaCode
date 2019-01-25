package com.core.interview_related_questions;

import java.util.Scanner;

public class SwappingBetweenTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Integer");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping of num1 and num2 :"+num1+" "+num2);
	}
	
}
