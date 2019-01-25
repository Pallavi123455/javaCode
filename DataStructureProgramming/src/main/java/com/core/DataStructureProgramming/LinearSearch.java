package com.core.DataStructureProgramming;

import java.util.Scanner;

public class LinearSearch {
	public static boolean linratSearch(int array[], int x) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in the array");
		int x = sc.nextInt();
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		boolean status = LinearSearch.linratSearch(array, x);
		if (status == true) {
			System.out.println("The element is present");
		} else {
			System.out.println("the element is not present");
		}
	}

}
