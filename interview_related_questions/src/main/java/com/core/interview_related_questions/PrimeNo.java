package com.core.interview_related_questions;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to which you want to check it is prime or not");
		int n = sc.nextInt();
		while (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			break;
		}
		if (count == 2) {
			System.out.println("The number is a prime number");
		} else {
			System.out.println("The number is not a prime number");
		}

	}

}

