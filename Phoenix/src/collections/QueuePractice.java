package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		// Queue - implements interface of List
		
		
		// This is like a Queue (line). Anything save first will go out first.
		// FIFO - First In First Out
		
		// We can create priority and non priority Queue
		
		
		
		Queue <String> data = new PriorityQueue <>();
		
		
		data.add("One");
		data.add("Two");
		data.add("Three");
		
		System.out.println(data);
		System.out.println(data.peek()); // This will give us the first element we saved in the Queue
		
		System.out.println(data.poll()); // This will return the first element and removed it from Queue.
		
		System.out.println(data);
		
		// Peek will give us first value and poll will return and remove the value from Queue

	}

}
