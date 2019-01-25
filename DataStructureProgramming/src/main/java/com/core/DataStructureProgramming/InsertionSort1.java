package com.core.DataStructureProgramming;

import java.util.Scanner;

public class InsertionSort1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int j = 1; j < n; j++) {
			int k = j - 1;
			int key = array[j];
			while (k > -1 && array[k] > key) {
				array[k + 1] = array[k];
				k--;
			}
			array[k + 1] = key;
		}
		for (int s : array) {
			System.out.println(s);
		}
	}
}
