package collections;

import java.util.HashMap;

public class CountChars {

	public static void main(String[] args) {
		
		
		// Count the frequency of each Character in a given String
		
		String str = "this is a test String that we should count the number of the occurance of each character";
		
		
		int count_t = 0;
		
		for (int i = 0; i < str.length(); i++) {
		
			if (str.charAt(i) == 't') {
				count_t++;
				
				
			}
		
		}
		
		
		System.out.println("t: "+ count_t);
		
		
		System.out.println("-------------------------");
		
		// count occurrence of all charters
		// make a map with chars as keys and int as values
		// we will store count of each char, in the value
		
		HashMap <Character, Integer> CharOccurrence = new HashMap <>();
		
		
		// go through all the chars
		// we check to see if the char is already in the map
		// if yes, get the current count and increase the current count
		// if not in the map, then add char to map and give it count of 1 
		
		for (char c : str.toCharArray()) {
			
			if (CharOccurrence.containsKey(c)){
				
				// true means char is already in the map
				// we have to get the current count
				// increase the current count
				int newCount = CharOccurrence.get(c)+1 ;
				CharOccurrence.put(c, newCount);
			} else {
				// The char is not in the map 
				  
				// its the first time we are seeing the char
				// add the char to the map
				// add the value 1 to the count
				CharOccurrence.put(c, 1);
				
				
			}
		}
		
		System.out.println(CharOccurrence);
	}

}
