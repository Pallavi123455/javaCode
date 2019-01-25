package com.core.practice_java_basics;

import java.util.Scanner;

class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
String n=sc.nextLine();
String reverse="";
for(int i=n.length()-1;i>0;i--)
{
reverse=reverse+n.charAt(i);
}
System.out.println(reverse);
}
}