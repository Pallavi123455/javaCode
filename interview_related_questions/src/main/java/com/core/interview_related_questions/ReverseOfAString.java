package com.core.interview_related_questions;

import java.util.Scanner;

public class ReverseOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String n = sc.nextLine();
		String reverse = "";
		for (int i = n.length()-1; i >= 0; i--) {
			reverse = reverse + n.charAt(i);

		}
		System.out.println(reverse);
	}

}
