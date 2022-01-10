package Mutation;

public class MutableAndImmutable {

	public static void main(String[] args) {
		
		// Mutable and Immutable
		
		
		// Immutable
		
		// String is an Immutable
		// String value are saved in Static Pool
		// We can change the value but it will change the position of the position in the memory and assigned it to X
		// It can not change itself in the same location, it will create a new location in the memory and the previous value will be garbage collected
		
		
		
		String x = "test";
		
		x = "test2"; // We can change the value of x but we are changing the position of x in the memory

		System.out.println(x.toUpperCase()); // Will convert to upper case
		
		// Mutable
		
		StringBuilder sb = new StringBuilder ("test2");
		
		sb.replace(0, 2, "ab"); // It will change the value at same location.
		
		System.out.println(sb); 
		
		
		// StringBuilder/StringBuffer are mutable
		// They are saved in Heap
		// When we create a SB it will be created in the heap and if we want to change the value it will be chnaged at same location 
		
		
		
		
		
	}

}
