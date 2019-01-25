//WAP TO CONVERT THE STRING INTO CHARACTER ARRAY
package com.core.interview_related_questions;

import java.util.Scanner;

public class ConvertStringToCharArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to which you want to arrange in Characterwise");
	String input=sc.nextLine();
	char[] ch=input.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}

}
}
