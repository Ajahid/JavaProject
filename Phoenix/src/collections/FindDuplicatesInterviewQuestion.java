package collections;

import java.util.HashSet;

public class FindDuplicatesInterviewQuestion {

	public static void main(String[] args) {
		
		
		// Write a function that will show if there is a duplicate value in a given Array
		
		
		int [] data1 = {1,2,3,4,5,6,7,8,8,9};
		
		int [] data = {1,2,3,4};
		
		System.out.println(hasDuplicate(data1));
		System.out.println(hasDuplicate2(data));
		
		

	}

	public static boolean hasDuplicate (int[] data) { // We mentioned object because it will accept any data type as it is parent of all classes
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
			if (data[i] == data[j]) {
				return true;
			}
			}
		}
		
		return false; 
	
	}
	
	// Finding duplicate of an Array using HashSet
	
	public static boolean hasDuplicate2 (int [] data) {
		HashSet <Integer> temp = new HashSet <>();
		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])){
				return true;
			}
		}
		
		
		return false;
		
	}
	
}
