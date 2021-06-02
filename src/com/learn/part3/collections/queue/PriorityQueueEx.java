package com.learn.part3.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		queue.add(10);
		queue.add(15);
		queue.add(20);
		
		Object peek = queue.peek();
		System.out.println(peek);
		
		Object poll = queue.poll();
		System.out.println(poll);
		
		System.out.println(queue.peek());
		
		queue.add(45); //15, 20, 45
		
		System.out.println("-----------------");
		System.out.println("Iterating all elements from queue");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------");
		System.out.println("started polling");
		while (queue.peek() != null) {
			Object poll2 = queue.poll();
			System.out.println(poll2);
		}
		System.out.println("------");
		System.out.println("size - "+ queue.size());
	}
}
