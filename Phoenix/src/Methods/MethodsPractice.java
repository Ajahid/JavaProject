package Methods;

import java.util.Scanner;

public class MethodsPractice {
	
	
	// We have total 4 types of methods
	
	// 1 - Methods with no return type and arguments
	
	void addLine () {
		System.out.println();
	}
	
	void addNumbers() {
		
		int x = 40;
		
		int y = 60;
		System.out.println();// To add space between lines
		int result = x + y;
		
		System.out.println(result);
		
		
		
		
		
		
		}
	
	void multi () {
		
		int a = 8;
		int b = 6;
		
		int result = a*b;
		
		System.out.println(result);
	
		
	}
	
	// 2 - Methods with passing arguments and with no return types
	
	void addValues (int num1, int num2) {
		
		System.out.println("You Entered These Values "+ num1 + " & " + num2);
		int x = num1;
		int y = num2;
		
		int result = x+y;
		
		System.out.println();
		
		System.out.println(result);
					
		
	}
	
	void printNumbers (int startPoint, int endPoint) {
		
		for (int a = startPoint; a < endPoint; a++) {
			System.out.println(a);
		}
	}
	
	
	void printTwice (String text) {
		
		
		System.out.println(text);
		addLine();
		System.out.println(text);
	}

	
	// method using static keyword - We can call these methods using class name
	// No need to create objects of the call to call these methods out side the class
	// No need for class and object if calling static methods within the same class.
	
	// can not call non static method in the main method in the same class if no object is created
	
	
	
	static void printTime(int hour, int minute) {
		
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.println("AM/PM");
		
		
	}
	
	
	static boolean purchase (int age) {
		
		boolean eligible = false ;
		
		if(age >= 18)
			System.out.println("Your are Eligible");
		else 
			System.out.println("Your are not Eligible");
		
		return eligible;
	}
	
	

	public static void main(String[] args) {
		
		
		MethodsPractice obj = new MethodsPractice ();
		MethodsPractice obj1 = new MethodsPractice ();
		
		obj.addNumbers(); // We are calling add numbers method
		
		obj1.addNumbers(); // Calling the same method again 
		
		System.out.println();
		
		MethodsPractice obj2 = new MethodsPractice ();
		
		obj2.multi(); // Calling multiplication method
		
		System.out.println("-------------------");
		
		MethodsPractice obj3 = new MethodsPractice ();
		
		System.out.println();
		
		obj3.addValues(12, 13); // Calling 3rd method of addvalues
		
		
		// Using addValues method with scanner class
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Add Two Numbers:");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		obj.addValues(a, b);
		
		
		
		System.out.println("****************************");
		
	
		int newage = 21;
		
		if (purchase(newage)) 
		System.out.println("You can Purchase");
		else 
			System.out.println("You can not purchase");
		
		
	}
	
	
	
	
}
