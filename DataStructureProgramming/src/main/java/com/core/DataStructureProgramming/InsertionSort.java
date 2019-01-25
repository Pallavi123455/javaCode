//Time Complexity=O(n2)
package com.core.DataStructureProgramming;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionMethod(int array[]) {
		int l = array.length;
		for (int i = 1; i < l; i++) {
			int key = array[i];
			int j = i - 1;
			while (j > -1 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		insertionMethod(array);
		System.out.println("The elements after sorting");
		for (int i : array) {
			System.out.println(i);
		}
	}

}
