package scanner;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int intNum = 0;
		double dobNum = 0;
		
		System.out.println("Please Enter Int Number: ");
		
		if (sc.hasNextInt() == true) intNum = sc.nextInt();
		
		System.out.println("\nYou Have Entered : " + intNum);
		
		System.out.println("\nPlease Enter Double Number: ");
		
		if (sc.hasNextDouble() == true) dobNum = sc.nextDouble();
		
		System.out.println("You Have Entered : " + dobNum);
	}

}
