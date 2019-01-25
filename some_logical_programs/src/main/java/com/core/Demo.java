package com.core;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String name;
		System.out.println("Enter name:");
		name = sc.nextLine();
		if (!name.matches("[a-zA-Z]+")) {
		    System.out.println("Invalid name");
		}
		String number;
		System.out.println("Enter number:");
		number = sc.nextLine();
		if (!number.matches("[0-9]+")) {
		    System.out.println("Invalid number");
		}
	}

}
