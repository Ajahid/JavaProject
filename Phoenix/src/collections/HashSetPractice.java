package collections;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		
		
		// SET
		
		
				// Set can not have duplicate value
				
				
				// HashSet - implements Set
				// HashSet are un-ordered
				
				
				HashSet <String> data = new HashSet <>();
				
				data.add("One");
				data.add("Two");
				data.add("Two"); // This will not be added as this is duplicate.
				
				System.out.println(data); // Can't add duplicate values to HashSet
				
				
				data.add("two"); // It will add this value as this is lower case t (not match with first Two)
				
				System.out.println(data);
				
				System.out.println(data.add("Three")); // The return value of the HashSet is boolean
				
				HashSet <String> data1 = new HashSet <>();
				
				System.out.println(data1.add("Abdul")); // result will be true because its added to the data
				System.out.println(data1.add("Mohammad")); // Result will be true because its added to the data
				System.out.println(data1.add("Abdul"));// result will be False because its duplicate
				
				// HashSet is unorder. 
				// It can print last value first and first value last
				System.out.println(data1);
				
				
				

	}

}
