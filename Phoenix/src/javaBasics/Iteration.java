package javaBasics;

public class Iteration {

	public static void main(String[] args) {
		
		int x = 1;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		
		System.out.println("-------------------------");
		
		// While Loop
		
		
		int num = 1;
		
		while (num <= 10) {
			System.out.println(num++);
		}
		
		System.out.println("End of the program");
		
		// Question
		
		
		
		
		
		int num1 = 7;
		
		while (num1 > 3 ) {
			System.out.print(--num1 + " ");
		}
		
		
		System.out.println("----------------------");
		
		
		// 10-6 - Print these 
		
		int y = 10;
		
		while (y > 5) { // (y >= 6)
			System.out.println(y--);
			
		}
		
		System.out.println("---------------");
		
		// 3-11 - Print this number - Increase by 2 number
		
		int num2 = 3;
		
		while (num2 <= 11) {
			System.out.println(num2);
			num2+=2;
		}
		
		
		int num3 = 1;
		int num4 = 1;
		
		while (num3 <=5) {
		while (num4 <=5) {
			System.out.print(num4); // print 12345 line 5 times
			num4++;
		}
		System.out.println(num4); // this will take to new line
		num4 = 1;
		num3++;
			
		}
		
		
		
		// Event Controlled Loop
		
		
		int num10 = 1;
		
		while (num10 < 11) {
			
			System.out.println(num10);
			num10++;
		}
		System.out.println(" Record Ends here");
		
		
		
		int num12 = 2;
		
		if (num12 % 3 == 0 && num12 % 5 == 0) {
			System.out.println("Fizz Buzz");	
		} else if (num12 % 3 == 0 ){
			System.out.println("Fizz");	
		}else if (num12 % 5 == 0 ){
			System.out.println("buzz");	
		}else {
			System.out.println("This is not a Fizz Buzz number");
		}
			
		
		
		
		
		
		
		
		
		
	}

}
