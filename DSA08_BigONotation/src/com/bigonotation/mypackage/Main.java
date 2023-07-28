package com.bigonotation.mypackage;



public class Main {

	public static void main(String[] args) {
		//"how code slows as data grows"
		
		/*
		 * 1. Describes the performance of an algorithm as the amount of data increases
		 * 2. Machine Independent (# of steps to completion)
		 * 3. Ignore smaller operation 0(n+1)-> 0(n)
		 * 
		 * example:				n = amount of data
		 *  0(1)				(it's a variable like x)
		 *  0(n)
		 *  0(log n)
		 *  0(n^2) 
		 *
		 * --------------------------------------------------
		 * 
		 * -----0(n) linear time-----
		 * int addUp(int n){
		 * 	
		 * 	int sum = 0;
		 * 	for(int i =0; i <= n; i++){
		 * 		sum +=1;
		 * 	}
		 * 	return sum;
		 * }
		 * 
		 * what if n = 1000000
		 * ~1000000 steps
		 *
		 * -----0(1) constant time-----
		 * int addUp(int n){
		 * 
		 * 		int sum = n *(n+1) /2;
		 * 	return sum;
		 * }
		 * 
		 * n = 1000000
		 * ~3 steps
		 * 
		 * 
		 * 0(1) = constant time
		 * 		= random access of an element in an array
		 * 		= inserting at the beginning of linked list
		 * 
		 * 0(log n) = logarithmic time
		 * 			= binary search
		 * 
		 * 0(n) = linear time
		 * 		= looping through elements in an array
		 * 		= searching trhough a linkedlist
		 * 
		 * 0(n log n) = quasilinear time
		 * 			  = quicksort
		 * 			  = mergesort
		 * 			  = heapsort
		 * 
		 * 0(n^2) = quadratic time
		 * 		  = insertion sort
		 * 		  = selection sort
		 * 		  = bubblesort
		 * 
		 * 0(n!) = factorial time
		 *       = traveling salesman problem
		 * 
		 * */
	}

}
