package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		
		// LinkedList - is a class
		// LinkedList is not based on indexes
		// LinkedList is saved in nodes.
		// LinkedList is store in different places in the physical memory (Decided by Java)
		// LinkedList nodes are connected to each other as chains.
		
		
		
		// We have 2 type of LinkedList
		
		// Singly LinkedList - Each node has 2 section (Data - next Reference
		// Doubly LinkedList - Each node has 3 section (Previous Reference - Data - next Reference)
		
		
		
		// It's also called Block-Chain - Chain of blocks.
		
		
		// We have 2 things in nodes
		// 1 - Data type 2- Reference to next node (each node should know where is next node)
		// We refer to nodes using index number as we did for ArrayList.
		
		
		
		
		// The code complexity for LinkedList is constant  
		
		
		
		// Ideal - Good (LinkedList)
		// Ideal with large set of data - add time is constant
		// Ideal with change in the data - If we remove data it will bypass that one node 
		
		
		// Not Ideal - (LinkedList)
		// Not ideal to retrieve data - Because nodes are saved at different location in the memory
		
		
		// Below is doubly LinkedList
		LinkedList <String> data = new LinkedList <>(); // This is coded the same way as ArrayList
		
		data.add("1"); // The first index is called geniuses block
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		
		System.out.println(data);
		
		data.remove(2);
		
		System.out.println(data);
		
		System.out.println(data.get(4));
		
		
		
		// Java will give us doubly LinkedList by default
		// It's also possible to make a singly LinkedList. We need to build a singly LinkedList or download it from library 
		
		
		// Singly LinkedList - If we need to retrieve data from node 4999 node. it will check 4999 nodes and provide the data
		// Single way road - Only one way to go
		
		
		// Doubly LinkedList - It knows previous and next nodes reference. If the node is after middle it will start from the end
		// if it is before the middle it will start searching from the . 
		// Double way road - Can go both ways
		
		
		
		
		List <String> data1 = new ArrayList <>(); // Polymorphsim - Upcasting - List is parent and ArrayList is sub
		
		List <String> data2 = new LinkedList <>(); // Calling parent class and initializing child class
		
		
		
		
	}

}
