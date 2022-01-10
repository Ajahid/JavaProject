package javaBasics;

public class CastingExemples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 5;
//		int a = (int) 5.0; // Converting double value to integer 
//		
//		double num = 10.9; 
//		
////		System.out.println(num);
////		System.out.println((int)num);
////		
////		double num2 = a/2;
////		
////		System.out.println(num2);
////		
////		// Implicit
////		// Explicit
////		// Promotion 
////		
//		int num3 = 10;
//		num3 += 10; // += mean adding 10 +10 here
//		 
//		System.out.println(num3+10);
//		
//		int num7 = 5;
//		num7 *= 10;
//		
//		System.out.println(num7);


		int x2 = 15;
		int y2 = 15;
		
		while (x2 >= 0) {
		while (y2 >= x2) {
		System.out.print(y2 + " ");
		y2--;	
		}
		System.out.println();
		y2 = 15;
		x2--;
		}
		
		
		System.out.println("-----------------------------------------");
		
		// if the percentage is above 90, assign grade A
		// if the percentage is above 75, assign grade B
		// if the percentage is above 65, assign grade C
		
		
		
		int x3 = 74;
		
		if (x3 >= 90) {
		System.out.println("You achived Grade A");	
		} else if (x3 >= 75) {
			System.out.println("You achived Grade B");
		} else if (x3 >= 65) {
			System.out.println("You achived Grade C");
		}
		
		int x5 = 10;
		
		if (x5 <= 0) {
			System.out.println("Number is 0");
		} else {
			System.out.println(x5);
		}
		
		
		String code = "123";
		
		if (code == "on") {
			System.out.println("ON");
		}else {
				System.out.println("OFF");
			}
		
			
		
		
		
	}

}
