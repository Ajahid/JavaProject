package Exceptions;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int [] num1 = {1,2,3};
		
		
		
		System.out.println("Enter a number");
		
		try {
		double num = sc.nextDouble();
		System.out.println(num);
		System.out.println(num1[5]);
		}catch (Exception e) {
			System.out.println("You enter Invalid number");
		}
			
		
		

		

	}

}
