package Exceptions;

import java.io.FileInputStream;

public class ThrowAndThrowsExamples {

	public static void main(String[] args) {
		
		// throw and throws
		
		
		// 1 - 1st method of throw exception
		
//		throw new ArithmeticException() ; // This will give us arithmetic exception
		
		
		// 2nd method of throw exceptions
		
		ArithmeticException myException = new ArithmeticException ();
		
		throw myException ;
		
		// As soon as we throw an exception, the execution of the program will stop 
		
		
		

	}
	
	
	public static void doSomething () {
		FileInputStream file = new FileInputStream (new File (""));
	}

}
