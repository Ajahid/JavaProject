package collections;

import java.util.HashMap;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		
		// HashMap - 
		
		// Maps are key -value data structure 
		// Keys must be unique
		// We define data type for keys and values
		// Key comes first, the the value like ==== <key, value>
		// to assign value we use put (key, value)
		// to get value we use method get(key)
		
		
		// some the the important methods
		
		// keySet(); this will return all the keys in the map
		// values(); this will return all the values in your map
		// containesValue (); will check to see if such value exist in the map, if yes it return true if not then false
		// containesKey (); will check to see if such key exist in the map, if yes it return true if not then false

		
		// Maps will not work will well with loops as they are not saved based on indexes. 
		
		
		
		
		
		
		// This data structure will take a key and a value for the same key
		// Key
		// Value
		
		// This is not based on the index or it is not saved in memory based on the indexes 
		
		// Firstname - this will be key
		// "Abdul" - This will be value
		
		// The key must have unique value or can't have duplicate 
		
		// This process is also called mapping.
		
		// The value can be any thing (List of something, Integer or String)
		
		
	
		
		
		
		HashMap <String, String> data = new HashMap <>();
		
		data.put("firstName", "Abdul");
		data.put("lasName", "Jahid");
		data.put("age", "35");
		
		System.out.println(data);
		
		System.out.println(data.get("firstName"));
		System.out.println(data.get("lastName"));
		System.out.println(data.get("age"));
		
		
		data.put("firstName", "Mohammad"); // The Firstname will be change to Mohammad if the 
		
		// Key can not have several values but we can change the vlaues to a key 
		
		System.out.println(data.get("firstName"));
		
		
		HashMap <Integer, String> data1 = new HashMap <>();
		
		
		data1.put(1, "one");
		data1.put(2, "two");
		data1.put(3,  "three");
		
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
		System.out.println(data1.get(3));
		
		System.out.println(data1.keySet()); // Will return all the keys in the map
		
		System.out.println(data1.values());
		
		System.out.println(data1.containsValue("three"));  // This will return true as we have the value three in the map
		
		System.out.println(data1.containsValue("four")); // This will return false as we don't have four value in the map
		
		System.out.println(data1.containsKey(1)); // This will return true as we have the key 1 in the map
				
		System.out.println(data1.containsKey(5)); // This will return false as we don't have 5 key in the map
		
		
		// How to iterate through the map 
		
		// To get one value from a map, we use get(key).
		
		// We can iterate only through for-each loop
		
		
		System.out.println(data1.get(1));
		
		// to get all the keys we use keySet()
		
		// to get both values and key we use below code
		
		for (Integer key : data1.keySet()) {
			
			System.out.println("Key: " + key + "  Value: " + data1.get(key));
			
		}
		
		// With below we can only get the value not the keys
		
		for (String Value : data.values()) {
			System.out.println(Value);
		}
		
		
	}
	
	

}
