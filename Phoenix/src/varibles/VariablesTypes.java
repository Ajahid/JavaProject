package varibles;

import javaBasics.VariablesTypes;

public class VariablesTypes {

	// We have 3 types of variables in Java
	
		// 1 - Instance Variable / Global Variable
		// 2 - Static Variable
		// 3 - public Variable
		
		int age ; // Instance Variable (Created inside the class outside the method)
		String name ;
		public int myage ; // This is also called instance variables
		
		
		// 1 - Instance variable - The variables which are declared inside curly braces of a class are know as instance variables.
		// We should create an object of the class to access these variables 
		
		
		
		public static int x = 10; // Static Variables (Created inside class outside main method)
		static String college;
		static int population;
		
		// 2 - Static variables that are created inside the curly braces of the class using status keyword.
		// We do not need an object of the class to call these variables.
		
		
		public int sum() { // Any signature which has parenthesis in inside declaration are called methods
			
			// 3 - Local Variables - Variables that are created inside the method are know as local variables
			// We can't access local variables from outside it's method. We need to call the method.
			
			
			int num = 20;
			int num2 = 30;
			
			return num + num2 ;
					
			
		}
		
		
		public static void main(String[] args) {
			
			VariablesTypes obj = new VariablesTypes(); // Created Object of VariableTypes Class
			
			System.out.println(obj.age); // Age is instance variables and there for we need to create object of the class to access this variable
			
			
			System.out.println(college); // College is static variable and we can access it directly without object.
			
			System.out.println(obj.college); // We can also access static variable with calling objects as well
			
			int x = 5 ; // These are local variables. Created inside the class
			int y = 10 ; // We can access these directly in the class
			
			System.out.println(x+y); // Calling local variables directly inside the method.
			
			System.out.println(obj.sum()); // if we want to call local variables outside the main method we need to call object and method name
			
			
			System.out.println(Integer.MAX_VALUE); // to find the value integer can save 2147483647

		}

	
}
