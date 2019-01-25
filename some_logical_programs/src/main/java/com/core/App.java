package com.core;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter a string formattted data(Letter+Digit)"); String
		 * input = sc.nextLine();
		 */
		String input = "A123";
		int i = 0;
		int integer23;
		StringBuffer ss = new StringBuffer(input.length());
		for (i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				ss.insert(i, c);
			} else {
				break;
			}

			String subStringInteger = input.substring(i, input.length() - i);
			try {
				int in = Integer.parseInt(subStringInteger);
				integer23 = in;
			} catch (NumberFormatException e) {
				System.out.println(subStringInteger + "is not a valid integer");
				return;
			}
			if (Integer.toString(integer23).length() == Integer.toString(integer23 + 1).length()) {
				ss.insert(i + 1, Integer.toString(integer23 + 1));
				System.out.println(ss.insert(i + 1, Integer.toString(integer23)));
			}

			else {
				ss.insert(i + 1, Integer.toString(integer23 + 1));
			}
		}
	}
}