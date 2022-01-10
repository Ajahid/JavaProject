package mixPractice;

import java.util.Scanner;

public class Practice1Runner {

	public static void main(String[] args) {
		
		
		Practice1 obj = new Practice1 () ;
		
		
		
		obj.startEndPoint(5, 21);
		
		System.out.println("===========================");
		
		obj.printTwice("Abdul Majeed");
		
		System.out.println("===========================");
		
		obj.printTwice("Aziza Jahid");
		
		System.out.println("===========================");
		
		obj.addValues();
		
		obj.addValues1(25, 60);
		
		obj.printTime(7, 35);
		
		Practice1.printTime(8, 59);
		
		System.out.println(obj.addTwoValues()); // We can call this method in sys-out.
		
		int a = obj.addTwoValues();
		
		int z = 40;
		
		int Total = a + z;
		
		System.out.println(Total);
		
		int f = 90;
		
		int finalresult = Total + f;
		
		System.out.println(finalresult);
		
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Enter a Number");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Practice1.addValues1(x, y);
		
		
		
		System.out.println(Practice1.purchase(21));
		
		
		int newAge = 25;
		
		if (Practice1.purchase(newAge))
			System.out.println("You are Eligible");
		else 
			System.out.println("You are not Eligiable");
							

	}

	
		
	
	

}
