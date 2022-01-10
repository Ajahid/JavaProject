package collections;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		// Collections - Collection Framework 
		
		// Collections are used to store data, process data and retrieving the store data.
		
		
		
		
		// Storing Data
		// Retrieving data
		// Searching data
		// Sorting data
		// Changing data
		
		// We need to think which one of the collection classes are good to save data, retrieve data, search data 
		// change data etc and then use the same class for our records
		
		// How much memory space it take 
		// How much time it take to process data
		
		
		// Iterable - Main Interface 
		// Collection - is interface extends from iterable
		
		// List - is interface extended from collection
		
		//Queue - is interface extended from collection
		
		// Set - is interface extended from collection
		
		
		
		// Set (Interface)
	
		
		// ArrayList (Class) - LinkedList (Class) - vector (Class) - Stack (Class)
		
		
		
		// ArrayList - This is a class
		
		// ArrayList is used to create array
		
		// ArrayList are fixed in size 
		// Array list are store in contiguous block of memory. this means that data will be store at same place in the physical memory
		// Its easy to retrieve data from memory 
		
		
		// Default size of ArrayList - 10
		// If the date is more the 10 indexes it will use below formula and create bigger array.
		// Data will be moved by Java to new (Bigger Array)
		// The previous array will be garbage collected. 
		// Formula for increasing size of ArrayList - (Oldcapacity * 3)/2 +1 
		
		
		// Not ideal with large data set
		// Not ideal with big data changes
		// Not ideal with deletion/
		
		
		// Good with retrieval of data 
		// Good with searching of data
		// 
		
		
		ArrayList <String> data = new ArrayList <> ();
		
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		
		System.out.println(data);
		
		data.remove(3);
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
