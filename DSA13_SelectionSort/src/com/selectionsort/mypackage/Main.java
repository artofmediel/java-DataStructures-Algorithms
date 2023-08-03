package com.selectionsort.mypackage;


public class Main {

	public static void main(String[] args) {
		//selection sort = serach an array and keep track of the minimum value during
		//			each iteration. At the end of each iteration, we swap variables.
		
		// quadratic time 0(n^2)
		// small data set = okay
		// large data set = bad
		
		int array[] = {8, 7, 9, 2, 3, 1, 5, 4 , 6};
		
		selectionSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}

	}
	
	public static void selectionSort(int[] array) {
		
		for(int i=0; i < array.length-1; i++) {
			int min = i;
			for (int j = i + 1; j <array.length; j++) {
				
				//ascending
				if(array[min] > array[j]) {
					min = j;
				}
				
				//descending
				/*if(array[min] < array[j]) {
					min = j;
				}*/
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

}
