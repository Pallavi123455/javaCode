package com.core.interview_related_questions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int p=n;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
			System.out.println(n);
		}
		System.out.println(n);
		System.out.println(sum);
		if(p==sum)
		{
		System.out.println("The Number is an Armstrong number");
		}
		else
		{
			System.out.println("The Number is not an Armstrong Number");
		}
	}

}
