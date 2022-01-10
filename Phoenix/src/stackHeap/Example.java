package stackHeap;

public class Example {

	public static void main(String[] args) {
		
		
		String a = "test" ;
		String b = "test" ;
		
		String c = new String ("test");
		
		System.out.println(a == b); // Print true
		System.out.println(a.equals(b)); // Print true 
		
		System.out.println(a == c); // Print false
		
		System.out.println(a.equals(c)); // Print true
		
		

	}

}
