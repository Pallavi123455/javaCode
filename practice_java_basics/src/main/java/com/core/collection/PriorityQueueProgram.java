package com.core.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProgram {
	public static void main(String[] args) {
		Queue<String> q1 = new PriorityQueue();
		q1.add("Ram");
		q1.add("Shyam");
		q1.add("Nitesh");
		q1.add("Hari");
		q1.add("Soumya");
		System.out.println("head  " + q1.element());
		System.out.println("head    " + q1.peek());
		System.out.println("Iterating the elements");
		Iterator<String> ii = q1.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println(q1.remove());
		System.out.println(q1.poll());
		System.out.println("After removing the elements");
		Iterator itr = q1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
