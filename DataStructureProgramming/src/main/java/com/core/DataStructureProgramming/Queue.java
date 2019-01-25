package com.core.DataStructureProgramming;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue {
	public int array[];
	public int length, front, rear, size;

	public void arrayQueue(int n) {
		length = 0;
		front = -1;
		rear = -1;
		int array[] = new int[n];
		length = 0;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	public void insert(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			array[rear] = i;
		} else if (rear + 1 >= size)

		{
			throw new IndexOutOfBoundsException("Overflow exception");
		} else if (rear + 1 < size) {
			array[++rear] = i;
			length++;
		}
	}

	public int remove() {
		int ele;
		if (isEmpty())

		{
			throw new NoSuchElementException("Undeflow Exception");
		} else {
			length--;
			ele = array[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}
		return ele;
	}

	public void dispaly() {
		for (int i = front; i <= rear; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the size of the array"); int n = sc.nextInt(); int
		 * array[] = new int[n]; System.out.println("Enter the elements of the array");
		 * for (int i = 0; i < n; i++) { array[i] = sc.nextInt(); }
		 */
		Queue q = new Queue();
		q.arrayQueue(6);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		q.insert(8);
		q.insert(9);
		q.remove();

	}
}