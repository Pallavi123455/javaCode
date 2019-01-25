package com.core;
/* Test case:
input=""
input="123"
input="AAAA0"
input="ABC000"
input="ACVD0001"
input="12ABCV"
input="CABC999"
input="ABC0009"
input="A"
input="A0"
input="A9"
input="A09"

*/

import java.util.Scanner;

public class App2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string formattted data(Letter+Digit)");
		// String input ="A900009";
		String input = sc.nextLine();// reads input
		int index = 0;// Initialize a Variable to Know the position of alphanumeric data.
		int numeric_part;
		if (input.length() == 0) {
			System.out.println("Final Output String is null as input is null");
			return;
		}

		StringBuffer alpha_part = new StringBuffer(input.length());// String is immutable But String_Buffer is
																	// immutable.So prefered String_Buffer

		int string_length = input.length();// To know the input_length
		while (string_length != 0) {
			char c = input.charAt(index);// it returns the character according to index

			if (Character.isLetter(c)) {// This method checks letter or not
				alpha_part.insert(index, c);// It inserts the data
				string_length--;// length is decreasing by 1
				index++;// index is increasing
			} else {
				if (index == 0) {
					System.out.println("Not a valid input as String Doesnot starts with Character");
					return;
				} else
					break;
			}
		}
		// System.out.println(alpha_part);
		String subStringInterger = input.substring(index, input.length());
		// Index value starts when it will find a digit

		try {
			// As numeric part is in StringFormattedData so we have
			// to parse as integer
			numeric_part = Integer.parseInt(subStringInterger);
			System.out.println(input + " is  a valid integer number");

		} catch (NumberFormatException e) {
			// If it is seeing any alphabet then NumberFormatException will found
			System.out.println(input + " is not a valid integer number");
			return;
		}
		// checking the length after parsing and before parsing of numerical value

		if (subStringInterger.length() == Integer.toString(numeric_part + 1).length()) {
			// It is checking length of before increment and after increment
			StringBuffer incremented_Value = alpha_part.insert(index, Integer.toString(numeric_part + 1));
			System.out.println("After auto incrementation of the numeric part:" + incremented_Value);
		} else if (subStringInterger.length() > Integer.toString(numeric_part + 1).length()) {
			int lenth_zero = subStringInterger.length() - Integer.toString(numeric_part + 1).length();
			while (lenth_zero-- != 0) {
				alpha_part.insert(index, 0);
				index++;
			}
			alpha_part.insert(index, Integer.toString(numeric_part + 1));
			System.out.println("After auto incrementation of the numeric part:a " + alpha_part);

		}
		else {
			StringBuffer non_Incremented_Value = alpha_part.insert(index, Integer.toString(numeric_part));
			System.out.println(non_Incremented_Value + " :is unable to increment");
		}

	}
}
