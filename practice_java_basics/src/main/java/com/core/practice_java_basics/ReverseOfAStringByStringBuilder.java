package com.core.practice_java_basics;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ReverseOfAStringByStringBuilder {
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		String sbr = sb.toString();
		if (str.equals(sbr)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.nextLine();
		ReverseOfAStringByStringBuilder.isPalindrome(input);
		System.out.println(ReverseOfAStringByStringBuilder.isPalindrome("jatin"));  
	}
}
