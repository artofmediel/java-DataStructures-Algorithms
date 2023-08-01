package com.linearsearch.mypackage;

public class Main {

	public static void main(String[] args) {
		// linear search - iterate a collection one element at a time
		
		// runtime complexity : 0(n)
		
		// Disadvantages:
		// Slow for large data sets
		
		// Advantages:
		// Fast for search of small to medium data sets
		// Does not need to sorted
		// Useful for data structures that do not have random access
		// (Linked List)
		
		int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		// test outputs
		//int index = linearSearch(array, 1);
		//int index = linearSearch(array, 5);
		int index = linearSearch(array, 10);
		
		if(index != -1)
		{
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found.");
		}
	}
	
	private static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i ++) {
			if(array[i] == value){
				return i;
			}
		}
		return -1;
	}

}
