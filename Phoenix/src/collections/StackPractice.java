package collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		
		// Stack - implements from List
		
		// Stack means stacking something. Putting something over other things.
		// Stack extends from List. This is a class.
		// Stack will be save based on index numbers
		
		// LIFO - List In First Out
		// The data we entered last will be out first.
		
		
		Stack <String> data = new Stack <>();
		
		data.push("one");
		data.push("Two");
		data.push("Three");
		
		
		System.out.println(data);
		System.out.println(data.peek()); // Peek will show the last element we saved in the stack
		
		System.out.println(data.pop()); // Pop will return the value and also removed the value from stack.
		System.out.println(data);
		
		
		

	}

}
