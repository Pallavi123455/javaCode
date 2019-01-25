package com.core;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationFor2CapitalNumberAnd21Letter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		try {
			String input = sc.nextLine();
			if (input.length() == 23) {
			String numeric_part = input.substring(2, 23);
			String phoneNumberPattern = "^[0-9]{21}$";
			Pattern pattern = Pattern.compile(phoneNumberPattern);
			Matcher matcher = pattern.matcher(numeric_part);
				if (input.charAt(0) == 'A' && input.charAt(1) == 'E' && matcher.matches()) {
					System.out.println("It is a valid number");
				} else {
					System.out.println("It is an invalid number.......");
				}
			} else {
				System.out.println("It's an invalid number");
			}
		} 	
		catch (NumberFormatException ee) {
			ee.printStackTrace();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}