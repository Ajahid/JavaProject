package javaBasics;

public class SwappingValuesExamples {

	public static void main(String[] args) {
		
		
		
		// Swapping values of variable with temporary  variables
		
		int a = 10;
		int r = 15;
		
		int temp = 0; // We create a temporary variable to swap the values 
		
		System.out.println("Print original value of a & r " + a + "-" + r);
		
		
		System.out.println("*******************************");
		
		temp = a;
		a = r;
		r = temp;
		
		System.out.println("Printing value after swapping of a & r " + a + "-" + r);
	
		
		System.out.println("*******************************");
		
		
		// Swapping values with (+ & -)
		
		
		
		int x1 = 20;
		int x2 = 30;
		
		System.out.println("Printing value before swapping " + x1);
		System.out.println("Printing value before swapping " + x2);
		
		x1 = x1 + x2; // x1 = 20 + 30 = 50
		x2 = x1 - x2; // x2 = 50 - 30 = 20
		x1 = x1 - x2; // x1 = 50 - 20 = 30
		
		System.out.println("*************************************");
		
		System.out.println("Printing value after swapping " + x1);
		System.out.println("Printing value after swapping " + x2);
		
		
		System.out.println("*************************************");
		
		
		// Swapping values using multiplication and division 
		
		int xa = 25 ;
		int xb = 50;
		
		System.out.println(" Printing value before swapping xa " + xa);
		System.out.println(" Printing value before swapping xb " + xb);
		
		
		xa = xa * xb; // xa = 25 * 50 = 1250
		xb = xa / xb; // xb = 1250/50 = 25
		xa = xa / xb; // xa = 1250/25 = 50
		
		
		System.out.println("****************************************");
		
		
		System.out.println(" Printing value after swapping xa " + xa);
		System.out.println(" Printing value after swapping xb " + xb);
			
		
		System.out.println("****************************************");
		
		
		// Swapping values with single statement 
		
		int a1 = 40;
		int a2 = 60;
		
		System.out.println(" Printing value before swapping a1 " + a1);
		System.out.println(" Printing value before swapping a2 " + a2);
		
		System.out.println("****************************************");
		
		a2 = a1 + a2 - (a1 = a2); // a2 = 40 + 60 (100) - a1 = 40= 60 (60) 
		
		
		System.out.println(" Printing value after swapping a1 " + a1);
		System.out.println(" Printing value after swapping a2 " + a2);
		

	}

}
