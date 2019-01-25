//WAP TO CHECK IF A STRING IS PALINDROME OR NOT
package com.core.interview_related_questions;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to which you want to check Palindrome or not");
		String input=sc.nextLine();
		String reverse="";
		for(int i=0;i<input.length();i++)
		{
			reverse=reverse+input.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(input);
		if(reverse.equals(input))
		{
			System.out.println("The String is a Paliondrome");
		}
		else
		{
			System.out.println("THe String is not a Paliondrome");
		}
	}

}
