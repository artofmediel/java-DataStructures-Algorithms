package  com.dynamicarrays.mypackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//dynamic arrays - are arrays with resizable capacities
		/*
		 * Advantages
		 * 1. Random access of elements 0 (1)
		 * 2. Good locality of reference and data cache utilization
		 * 3. Easy to insert/delete at the end
		 * 
		 * Disadvantages
		 * 1. Wastes more memory
		 * 2. Shifting elements is time consuming 0(n)
		 * 3. Expanding/Shrinking the array is time consuming 0(n)
		 */

		//ArrayList<String> arrayList = new ArrayList<String>();
		
		DynamicArray dynamicArray = new DynamicArray(5);

		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");

		//try grow
		dynamicArray.add("F");
		
		//try shrink
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");

		
		//try insert
		//dynamicArray.insert(0,"X");

		System.out.println(dynamicArray);
		System.out.println("size : " + dynamicArray.size);
		System.out.println("capacity : " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
		//try delete
		//dynamicArray.delete("A");
		
		System.out.println(dynamicArray);
		System.out.println("size : " + dynamicArray.size);
		System.out.println("capacity : " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
		//try search
		//System.out.println(dynamicArray.search("C"));
		
		
	}

}
