package scanner;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner (System.in);
		
		int intNumber ;
		double doubleNumber;
		boolean booleanName ;
		
		
		System.out.println("Please type Integer: ");
		
		intNumber = keyboardInput.nextInt();
		
	
		System.out.println("You type: " + intNumber);
		
		System.out.println("\n\nEnter Any Decimal number: ");
		
		doubleNumber = keyboardInput.nextDouble();
		
		System.out.println("You Enter Decimal number: " + doubleNumber);
		
		
		
		
		
	}
	
	
	

}
