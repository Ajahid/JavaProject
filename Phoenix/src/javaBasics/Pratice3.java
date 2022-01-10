package javaBasics;

public class Pratice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; // Declaration process. Reserving the name 
		num1 = 555; // Initialization Process. Assigning a value to reserve name
		int num2 = 666; // Both declaration & initialization process
		num2 = 4; // Assignment Process. Assigning a value to num2 for 2nd time. Can't use variable when assigning the identifier 
		
		// Difference between Initialization & Assignment 
		
		// Initialization is assigning the value for the first time
		//  the value after the first time is known is assignment. Can't use with variables
		
		
		// Date Types
		
		// We have 2 Data Types " Primitives / Reference "
		
		// Primitives Data Types - Total 8 Primitives 
		// 1. Byte - (whole numbers) - 1 byte - (-128 to 127)
		// 2. Short - (whole numbers) - 2 bytes - (-32,768 to 32,767)
		// 3. int - (whole numbers) - 4 bytes - (-2,147,483,648 to 2,147,483, 647)
		// 4. long - (whole numbers) - 8 bytes - (9,223,372,036,854,775,807L) - Put L at end
		// 5. float - (numbers with decimal) - 4 bytes -(3.40282347F(6-7 significant decimal digits) - F at the end
		// 6. double - (numbers with decimal) - 8 bytes - (1.79769313486231570E - (15 significant decimal digits)
		// 7. char - (one character e.g 'f') - 2 bytes (0 to 65,536 (unsigned))
		// 8. boolean - (True/False) - not assigned 
		
		
		// Reference Data Type (Object		
		
		
		int num4 = 5;
		int num5 = 8;
		int num6 = 13;
		
		num4 = num5; // num 1 should be 8 now
		num5 = num6; // num 2 should be 13
		num6 = num4; // num1 is 8 so answer should be 8
		
		// The answer will be 8 
		
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(2%2);
		System.out.println(2/2);
		System.out.println(3%4);
		System.out.println(17%7);
		System.out.println(0/9);
		// System.out.println(9/0); (Exception) Will give error message 
		// (0/0) Exception
		// (1.0/0) - Infinity 
		// (0.0 / 0.0) - Nan
		
		
		System.out.println(5+7/3-6%4); // First it will calculate division and modulus and then addition 
		
		double v = 6.7;
		int g = 6;
				
		System.out.println(v+g);	// Double is more accurate date and there for it will should as double
		System.out.println(v/g);
				
		int num8 = 5;
		
		num8 *= 10;
		
		System.out.println(num8);
		
		// Modulus Examples (% is know is modulus)
		// 2 % 2 = 0
		// 3 % 2 = 1
		// 4 % 2 = 0
		// 5 % 2 = 1
		// 6 % 2 = 0
		// 3 % 4 = 3
		
		int x = 10;
		int y = 5;
		
		if (x == 11 || ++x == 10) {
			System.out.println("True");
		}else {
			System.out.println(x);
		}
		
	}

}
