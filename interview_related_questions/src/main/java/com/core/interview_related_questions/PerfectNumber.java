package com.core.interview_related_questions;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int product = 1;
		int sum = 0;
		int n = sc.nextInt();
		while (n > 0) {
			int r = n % 10;
			product = product * r;
			sum = sum + r;
			n = n / 10;
		}
		if (product == sum) {
			System.out.println("The Number is a Perfect Number");
		} else {
			System.out.println("THe number is not a perfect Number");
		}
	}
}
