package com.core.interview_related_questions;

import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String firstString = sc.nextLine();
		System.out.println("Enter the SEcond String");
		String secondString = sc.nextLine();
		int found = 0;
		if (firstString.length() == secondString.length()) {
			for (int i = 0; i < firstString.length(); i++) {
				for (int j = 0; j <= secondString.length(); j++) {
					if (firstString.charAt(i) == secondString.charAt(j)) {
						found = 1;
						break;
					}
				}
			}
		}
		if (found == 1) {
			System.out.println("The two String are  Anagram");
		}
		if (found == 0) {
			System.out.println("The Strings are not anagram");
		}

	}

}
