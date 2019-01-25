package com.monami.assign;

import java.util.Scanner;

public class StringReverse1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String myString="";
		String reverse=null;
		System.out.println("Enter the String you want to reverse");
		myString=sc.nextLine();
		for(int i=myString.length()-1;i>0;i--)
		{
			 reverse=reverse+reverse.charAt(i);
		}
		System.out.println(reverse);
	}

}
