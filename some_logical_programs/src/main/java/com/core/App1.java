package com.core;

import java.util.Scanner;

public class App1 
{
	public static void main(String args[]) 
	{
		//Accept user imput
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string formattted data(Letter+Digit)");
		String input = sc.nextLine();
		
		// Initialize a Variable to Know the position of alphanumeric data.
		int index = 0;
		int numeric_part;
		StringBuffer alpha_part = new StringBuffer(input.length());// String is immutable But String_Buffer is
																	// immutable.So prefered String_Buffer
		// Get Charecters from input
		int string_length = input.length();
		while (string_length != 0) 
		{
			char c = input.charAt(index);
			
			if (Character.isLetter(c)) 
			{
				alpha_part.insert(index, c);
				string_length--;
				index++;
			} 
			else 
			{
				break;
			}
		}
		
		//Get numbers from input
		String subStringInterger = input.substring(index, input.length());
		int num_length = subStringInterger.length();
		
		//Convert number in input from string to numeric
		try 
		{
			numeric_part = Integer.parseInt(subStringInterger);
			System.out.println(input + " is  a valid integer number");
		} 
		catch (NumberFormatException e) 
		{
			// If it is seeing any non-number then NumberFormatException will be thrown
			System.out.println(input + " is not a valid integer number");
			return;
		}
		
		int newnumber = numeric_part + 1;
		String sNewNumber = Integer.toString(newnumber);
		
		// Left Pad the integer part with 0's to make it same is original number lebgth
		
		
		// checking the length of numeric part after parsing and before parsing of numerical value
		if (num_length == Integer.toString(newnumber).length()) 
		{
			// It is checking length of before increment and after increment
			StringBuffer incremented_Value = alpha_part.insert(index, Integer.toString(numeric_part + 1));
			System.out.println("After auto incrementation of the numeric part:" + incremented_Value);
		} 
		// checking the length after parsing and before parsing of numerical value
		else if (subStringInterger.length() > Integer.toString(numeric_part + 1).length()) {
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
