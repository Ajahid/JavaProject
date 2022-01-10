package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int goal = 10;
		int numEntered ;
		
		System.out.println("Please Enter Your Number");
		
		numEntered = sc.nextInt();
		
		if (numEntered == goal) {
			System.out.println("You Have Entered Correct Number!");
		} else {
			while (numEntered != goal ) {
			System.out.println("You have Entered Wrong Number Try Again");
			numEntered = sc.nextInt();
			if (numEntered == goal){
				System.out.println("You Have Entered Correct Number");
				break;
		} 
		if (numEntered > goal) {
			System.out.println("Please go down");
		} else {
			System.out.println("Please go up");
		}
		}
	}

		
		
		
		
	}
}
		