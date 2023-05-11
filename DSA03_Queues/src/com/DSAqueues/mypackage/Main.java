package com.DSAqueues.mypackage;

import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		//**************************************************************
		
		//Queue = FIFO data structure. First-In First-out (ex. A line of people)
		//	A collection designed for holding elements prior to processing
		//	Linear data structure
		
		//	add = enqueue, offer()
		//	remove = dequeue, poll()
		
		//**************************************************************
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty());
		
		queue.offer("karen");
		queue.offer("chad");
		queue.offer("steve");
		queue.offer("harold");
		
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.size());
		
		System.out.println(queue.contains("harold"));
		
		System.out.println(queue.peek());
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		// where are queues useful?
		
		// 1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer queue (Print jobs should be completed in order).
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
	}

}
