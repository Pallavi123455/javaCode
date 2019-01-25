package com.core;

import java.util.Scanner;

public class IncrementTheInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string[];
		int digit[];
		System.out.println("Enter the length of number and digit");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the String to which you want to print");
		string = new String[a];
		System.out.println("Enter the number to which you want to print");
		digit = new int[b];
		for (int i = 0; i < a; i++) {
			string[i] = sc.nextLine();
		}
		for (int j = 0; j < b; j++) {
			digit[j] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			System.out.println(string[i]);
		}
	}
}
