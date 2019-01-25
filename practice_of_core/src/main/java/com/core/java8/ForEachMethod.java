package com.core.java8;

import java.util.Scanner;

public class ForEachMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] i=new int[5];
		i[0]=23;
		i[1]=54;
		i[2]=56;
		i[3]=14;
		i[4]=15;
		for(int number:i)
		{
			System.out.println(number);
		}
	}

}
