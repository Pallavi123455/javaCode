//WAP TO PRINT THE DUPLICATE CHARACTER IN A STRING
package com.core.interview_related_questions;

import java.util.Scanner;

public class ReadDuplicateCharacterInAnInputString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in which you want to check the characters are repeated or not");
		String input = sc.nextLine();
		int count = 0;
		char in[] = input.toCharArray();
		for (int i = 0; i <= input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (in[i] == in[j]) {
					System.out.println("The duplicate character in the String is:"+in[j]);
				}
			}
		}
	}
}
