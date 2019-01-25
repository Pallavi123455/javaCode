//Time Complexity=O(n)
package com.core.DataStructureProgramming;

public class Stack {
	static final int Max = 4;
	int a[] = new int[Max];
	int top;

	boolean isFul() {
		if (top >= (Max - 1)) {
			return true;
		} else {
			return false;
		}
	}

	int push(int x) {
		if (!isFul()) {
			a[++top] = x;
			System.out.println(x + "pushed into stack");
		}
		return 1;
	}

	int pop() {
		if (!isEmpty()) {
			int x = a[top--];
			System.out.println(x + "popped from stack");
		}
		return 1;
	}

	boolean isEmpty() {
		if (top < 0) {
			return true;
		} else {
			return false;
		}
	}

	void display() {
		for (int i = 0; i < top; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(45);
		s.push(35);
		s.push(65);
		s.pop();
		System.out.println("the elements in the stack");
		s.display();
	}

}
