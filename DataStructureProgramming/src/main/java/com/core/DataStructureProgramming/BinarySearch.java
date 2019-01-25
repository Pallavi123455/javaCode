/*Worst case Time Complexity=O(logn)
Best case =O(1)
Average Case=O(logn)*/
package com.core.DataStructureProgramming;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int array[], int f, int l, int x) {
		if (f == l) {
			if (array[f] == x) {
				return x;
			}
		} else if (f < l) {
			int mid = (f + l) / 2;
			if (array[mid] > x) {
				return binarySearch(array, mid + 1, l, x);
			} else if (array[mid] < x) {
				return binarySearch(array, 0, mid - 1, x);
			} else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to which you want to search");
		int e = sc.nextInt();
		int result = binarySearch(array, 0, n - 1, e);
		System.out.println(result);
	}

}
