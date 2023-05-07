package com.DSA0102Stacks.mypackage;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args){
		
		//stack = LIFO data structure, Last-in First-out
		//		stores objects into a sort of "vertical tower"
		//		push() to add to the top
		//		pop() to remove from the top
		
		Stack<String> stack = new Stack<String>();
		
		//check stack if empty : returns true
		//System.out.println(stack.empty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Doom");
		stack.push("Borderlands");
		stack.push("FFVII");
		
		//try pop
		//stack.pop();
		
		//when you pop something from a stack, it actually get its value
		//so you can assign it to a variable
		String myfavoriteGame = stack.pop();
		
		//check stack if empty
		//System.out.println(stack.empty());
		
		//display
		System.out.println(stack);
		System.out.println(myfavoriteGame);

		//try peek
		System.out.println(stack.peek());
		
		//try search
		System.out.println(stack.search("Doom"));
		System.out.println(stack.search("Minecraft"));
		System.out.println(stack.search("Fallout76"));
		
		//its possible to run out of memory in using stack
		//returns an error: java.lang.OutOfMemoryError: Java heap space
		//example adding a billion item on a stack
		//for(int i = 0;i<1000000000;i++) {
		//	stack.push("HalfLife3");
		//}
		
		//uses of stack?
		// 1. undo/redo features in text editors
		// 2. moving back/forwards through browser history
 	 	// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
	}
	
}
