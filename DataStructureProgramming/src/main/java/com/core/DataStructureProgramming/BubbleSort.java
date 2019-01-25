//Running Time= Space complexity= maximum Iteration
//Worst Case Time Complexity [ Big-O ]: O(n2)
/*Best Case Time Complexity [Big-omega]: O(n)
Average Time Complexity [Big-theta]: O(n2)
Space Complexity: O(1)*/
package com.core.DataStructureProgramming;

import java.util.Scanner;

public class BubbleSort {
	void bubbleSort(int input[]) {
		int l = input.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
	}

	void printArray(int input[]) {
		int n = input.length;
		for (int i = 0; i < n; i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = sc.nextInt();
		int input[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		BubbleSort bb = new BubbleSort();
		// bb.printArray(input);
		bb.bubbleSort(input);
		bb.printArray(input);
	}

}
