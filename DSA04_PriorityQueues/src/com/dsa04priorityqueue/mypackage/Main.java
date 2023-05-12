package com.dsa04priorityqueue.mypackage;

import java.util.*;


public class Main {

	public static void main(String[] args) {

		//Priority queue= A FIFO data structure that serves elements
		//		with the highest priorities first
		//		before elements with lower priority
		
		Queue<Double> queue = new PriorityQueue<>();
		//	reverse
		//Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
		
		//----------------------------------------------------------
		
		Queue<String> queue2 = new PriorityQueue<>();
		
		queue2.offer("B");
		queue2.offer("C");
		queue2.offer("A");
		queue2.offer("F");
		queue2.offer("D");
		
		while(!queue2.isEmpty()){
			System.out.println(queue2.poll());
		}
		
	}

}
