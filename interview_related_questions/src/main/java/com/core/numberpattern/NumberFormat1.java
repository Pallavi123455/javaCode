
package com.core.numberpattern;

import java.util.Scanner;

public class NumberFormat1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int input = sc.nextInt();
		int no = 1;
		for (int i = 0; i <= input; i++) {

			for (int j = 0; j <= input; j++) {
				System.out.print(" "+ no);
				no++;
			}

			System.out.println();
		}
	}

}
