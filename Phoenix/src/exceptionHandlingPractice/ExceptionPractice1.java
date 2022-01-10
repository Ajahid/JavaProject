package exceptionHandlingPractice;

import java.util.Scanner;

public class ExceptionPractice1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter two numbers");
		
		
		try {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a / b;
		
		System.out.println(res);
		} catch (Exception e) {
			System.err.println("Dividing by Zero is not allowed"); // To print customize message 
			// System.out.println(e); - This will provide the exception details and proceed with details
		}
		
		System.out.println("End of Coding!");
		
		

	}

}
