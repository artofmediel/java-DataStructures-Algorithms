package com.dsalinkedlists.mypackage;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		// ********************************************************************
		
		// Linkedlist = stores Nodes in 2 parts (data + address)
		//	Nodes are in non-consecutive memory locations
		//	Elements are linked using pointers
		
		// 					Singly Linked List
		//		Node				Node				Node
		// [data | address] -> [data | address] -> [data | address]
		//
		//					Doubly Linked List
		//			Node							Node
		// [address | data | address] <->  [address | data | address]
		
		// Advantages?
		//	1. Dynamic Data Structure (allocates needed memory while running)
		//	2. Insertion and Deletion of Nodes is easy. 0(1)
		//	3. No/Low memory waste
		
		// Disadvantages?
		//	1. Greater memory usage (additional pointer)
		//	2. No random access of elements (no index [i])
		//	3. Accessing/searching elements is more time consuming. 0(n)
		
		// Uses?
		// 1. implement Stacks/Queues
		// 2. GPS navigation
		// 3. music playlist
		
		// ********************************************************************
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//use as a stack
		/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		*/
		
		//use as a queue
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll();
		
		//add
		linkedList.add(4, "E");
		
		//remove
		linkedList.remove("E");
		
		//searching index
		System.out.println(linkedList.indexOf("F"));
		
		//peak
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
		//add on head or tail
		linkedList.addFirst("0");
		linkedList.addLast("G");
		
		//storing a removed value
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();

		System.out.println(first + " " + last);
		
		System.out.println(linkedList);

	}

}
