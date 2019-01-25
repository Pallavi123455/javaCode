package com.core.interview_related_questions;

import java.util.Scanner;

public class PrimeNumberHowManyUptoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor = 0;
		int counter = 0;
		System.out.println("Enter the last range of the number");
		int n = sc.nextInt();
		int p = n;
		sc.close();
		for (int i = 1; i <= p; i++) {

			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					divisor++;
				}
			}
			if (divisor == 2) {
				System.out.println("The prime numbers are" + i);
			}
		}
	}

}
