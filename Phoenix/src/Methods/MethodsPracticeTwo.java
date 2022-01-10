package Methods;

import java.util.Iterator;
import java.util.Scanner;

public class MethodsPracticeTwo {

	public static void main(String[] args) {
		
		MethodsPractice obj = new MethodsPractice ();
		

		int startPoint = 4;
		int endPoint = 20;
		
		for (int j = startPoint; j <= endPoint; j++) {
			
			System.out.println(j);
		}
		
		obj.addLine();
		
		int startPoint1 = 50;
		int endPoint1 = 100;
		
		for (int a = startPoint1; a <= endPoint1; a++) {
			
			System.out.println(a);
		
		}
		
		System.out.println("****************");
		
		obj.printNumbers(2, 16); // Calling method on startPoint and endPoint
		
		obj.addLine();
		
		obj.printNumbers(23, 48);
		
		obj.addLine();
		
		obj.printTwice("Majeed"); // Calling PrintTwice method
		
		obj.addLine();
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Hour: ");
		int h = scan.nextInt();
		System.out.println("Enter Minutes: ");
		int m = scan.nextInt();		
		
		obj.addLine();
		
		
		
		obj.printTime(h, m);
		
		
		MethodsPractice.printTime(6, 45);  // We can call static methods using class name, no need to create object of the class 
		
		
		
	}

}
