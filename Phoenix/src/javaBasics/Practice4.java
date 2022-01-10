package javaBasics;

public class Practice4 {

	public static void main(String[] args) {
		
		String type = "checking";
		double amount = 400;
		
		switch (type) {
		case "checking":
			System.out.println(amount < 500 ? "Transaction OK!" : "");
			break;
		case "saving":
			System.out.println("You can not directly withdraw from saving");
			break;
		case "credit":
			if(amount < 1000) {
				System.out.println("Transaction OK!");
			}
			if(amount > 500) {
				System.out.println("Confirmation message sent!");
			}
			break;
		}
		
		
		int x = 7;
		
		if (x % 2 == 0) {
		
		System.out.println(" Number is Even");
		} else {
			System.out.println(" Number is Odd");
		}	
			
		
		
		// Fizz Buzz - Interview Question 
			
			int num = 15;
			
			
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(" TEK SCHOOL");
			}else if (num % 3 == 0) {
				System.out.println("SCHOOL");
			}else if (num % 5== 0) {
				System.out.println("TEK");
			}else {
				System.out.println(num);
			}
		
		
		
		
		

	}

}
