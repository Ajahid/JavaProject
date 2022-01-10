package stackHeap;

public class StackHeapStringStaticPool {

	public static void main(String[] args) {
		
		
		
		int a = 10 ; // All byte/int/double/float/long values will be save in stack in the memory
		
		// All String values will be saved in the String Static pool in the Heap. 
		
		
		String x = "test"; // This will save inside String Static pool
		String y = "test"; // This will also save inside String static pool
		
		
		System.out.println(x == y); // This will check the reference of both string and will give true result
		
		
		// All constructor/classes/object will be saved outside the String Static pool in Heap.  
		
		
		String z = new String ("test"); // This is a constructor and will be saved outside String static pool
		
		
		System.out.println(z == y); // Equality operator will check the reference of both values. 
		// Z is saved outside static pool and and y is inside static pool. Therefore results will not match
		
		System.out.println(z.equals(y)); // .equal will loop through the string to check the characters in both string not the references or location 

		// String is made of Char. Each and every character inside the String is made of char
		
		
		Person obj1 = new Person ();
		
		obj1.name = "Jack";
		
		Person obj2 = obj1 ;
		
		obj2.name = "David";
		
		System.out.println("1: " + obj1.name);
		System.out.println("2: " + obj2.name);
		
		System.out.println("Is obj1 & obj2 at same location: " + (obj1 == obj2)); // This will check reference/location of both objects
		
		System.out.println("Is obj1 & obj2 has same data: " + obj1.equals(obj2)); // This will check the data of both objects
		
		
		
		
		
		
	}

}
