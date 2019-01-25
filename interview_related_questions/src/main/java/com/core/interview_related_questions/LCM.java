package com.core.interview_related_questions;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int lcm=1;
		while(true)
		{
		if(lcm%num1==0 && lcm%num2==0)
		{
			System.out.println(lcm);
			break;
		}
		++lcm;
		}
	}

}
