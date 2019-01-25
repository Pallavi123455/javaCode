package com.print.star;

public class Star7 {
	public static void main(String[] args) {
		int j = 8;
		for (int i = 1; i <= 5; i++) {
			for (j = 1; j >= 8; j--) {
				System.out.print(" ");
			}
			
			j = j - 3;
			for (j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			

			System.out.println(" ");
		}
	}

}
