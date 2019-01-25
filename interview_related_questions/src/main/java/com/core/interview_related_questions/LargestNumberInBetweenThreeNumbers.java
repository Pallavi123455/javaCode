package com.core.interview_related_questions;

import java.util.Scanner;

public class LargestNumberInBetweenThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && b > c) {
			System.out.println("a is the largest number");
		}
		if (b > c && b > a) {
			System.out.println("b is the largest number");
		} else {
			System.out.println("c is the largest number");
		}
	}

}
