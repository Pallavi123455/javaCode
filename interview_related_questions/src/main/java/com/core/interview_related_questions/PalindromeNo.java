package com.core.interview_related_questions;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int sum = 0;
		int input = sc.nextInt();
		while (input > 0) {
			int rem = input % 10;
			sum = sum + rem;
			input = input / 10;
			break;
		}
		if (sum == input) {
			System.out.println("the number is a palindrome");
		}
	}

}
