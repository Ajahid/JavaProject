package javaBasics;

public class MyFirstProgram {
	public static void main(String[] args) {
		
		System.out.println("Java is Fun");
		int x = 10;
		String y = "test";
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(4+5); // addition of 2 numeric values
		System.out.println(4 + " test"); //concatenation - Adding non numeric values
		System.out.println(x+5 + " Some text"); // concatenation - Adding non numeric values
		System.out.println("Some text " + x+5); // Concatenation - Adding non numeric values
		System.out.println("Some text " + (x+5)); // Concatenation - Will run parenthesis code first
		

		int num1 = 10;
		int num2 = 15;
		
		if (num1 > num2) {
			
			System.out.println("The answer is yes");
		}else {
			System.out.println("The answer is no"); // This will print because 10 is not greater then 15
		}
		
		int x1 = 10;
		int x2 = 2;	
		
		System.out.println(x1/x2);
		System.out.println(10/27);
		
//		int a = 10; // Run time error. We can't divide by 0
//		int b = 0;	
//		
//		int z = a/b;
//		
//		System.out.println(a/b);
		
		System.out.println("sum: " + (x1 -x2)); // Logical error
		
		System.out.println("sum: " + x1 + "+" + x2 + " = " + (x1 -x2));
		
		

		// Java Comments
		// Single line comments
		// Slect line or lines then ===> CTRL + /
		
		
		// Block of comments
		// Start /*
		// end with */ - Any thing between the two considered a comment
		
		/*
		 * hjvjhvjhvj
		 * jhvjhvh
		 * nbvjnhbvhj
		 */
	
		
		
		
		
		
		
		
	}
	
}

