package javaBasics;

public class Practice5 {


	public static void main(String[] args) {
		
		// Total amount  < 100, 5 % shipping and no discount
		// Total amount  > 100, Free shipping and 2% discount 
		// Total amount  > 300, Free shipping and 5% discount 
		// Total amount  > 500, Free shipping and 7% discount 
		// Total amount  > 1000, Free shipping and 10% discount 
		
//		double amount = 200;
//		double discount = 0;
//		double shipping = 0;
//		boolean expedited = false;
//	
//		
//		if (amount < 100) {
//			
//			shipping = amount * 0.05;
//			discount = 0;
//			expedited = true;
//			
//			System.out.println("--------------------------");
//			System.out.println("Amount:\t\t $"+amount);
//			System.out.println("shipping\t $" + shipping);
//			System.out.println("Standard Shipping");
//			System.out.println("discount: \t -$" + 0);
//			System.out.println("Total: \t\t $" + (amount + shipping + discount));
//			System.out.println("--------------------------");
//				
//		} else if (amount > 100 && amount < 300){
//			System.out.println("--------------------------");
//			System.out.println("Amount:\t\t $"+amount);
//			System.out.println("shipping\t $" + " Free" );
//			System.out.println("Standard Shipping");
//			System.out.println("discount: \t -$" + amount * 0.02);
//			System.out.println("Total: \t\t $" + (amount + shipping + discount));
//			System.out.println("--------------------------");
//			
//		} else if (amount > 300 && amount < 500){
//			System.out.println("--------------------------");
//			System.out.println("Amount:\t\t $"+amount);
//			System.out.println("shipping\t $" + " Free" );
//			System.out.println("Standard Shipping");
//			System.out.println("discount: \t -$" + amount * 0.05);
//			System.out.println("Total: \t\t $" + (amount + shipping + discount));
//			System.out.println("--------------------------");
//			
//		} else if (amount > 500 && amount <1000){
//			System.out.println("--------------------------");
//			System.out.println("Amount:\t\t $"+amount);
//			System.out.println("shipping $" + "  Free" );
//			System.out.println("Expedited Shipping");
//			System.out.println("discount: \t -$" + amount * 0.07);
//			System.out.println("Total: \t\t $" + (amount + shipping + discount));
//			System.out.println("--------------------------");
//			
//		}else if (amount >= 1000){
//			System.out.println("--------------------------");
//			System.out.println("Amount:\t\t $"+amount);
//			System.out.println("shipping $" + "	 Free" );
//			System.out.println("Expedited Shipping");
//			System.out.println("discount: \t -$" + amount * 0.10);
//			System.out.println("Total: \t\t $" + (amount + shipping + discount));
//			System.out.println("--------------------------");
//		}
//		
//		System.out.println("--Thank You For Your Shopping--");
//		System.out.println("  Madina Halal Market	");

//		
//		double amount = 870;
//		double discountamount = 0;
//		double shipping = 0;
//		boolean expedited = false;
//	
//		
//		if (amount < 100) {
//			
//			shipping = amount * 0.05;
//			discountamount = 0;
//			expedited = false;
//			
//		} else if (amount >= 100 && amount < 300) {
//			shipping = 0;
//			discountamount = amount *0.02;
//			expedited = false;
//			
//		} else if (amount >= 300 && amount < 500) {
//			shipping = 0;
//			discountamount = amount *0.05;
//			expedited = false;
//			
//		} else if (amount >= 500 && amount < 100) {
//			shipping = 0;
//			discountamount = amount *0.07;
//			expedited = true;
//			
//		} else{
//			shipping = 0;
//			discountamount = amount *0.1;
//			expedited = true;
//		}
//		
//
//		System.out.println("---------------------");
//		System.out.println("Amount:\t\t $" + amount);
//		System.out.println("Shipping:\t $" + shipping);
//		if (expedited == true) {
//			System.out.println("Free Expedited Shipping");
//		}
//		System.out.println("DiscountAmount:\t $" + discountamount);	
//		System.out.println("Total:\t\t $" + (amount + shipping - discountamount));	
//		
//		System.out.println("------------------------");
//		
//		System.out.println("--Thank You For Your Shopping--");
//		System.out.println("  Madina Halal Market	");
//
//		
//		int average = 92;
//		
//		if (average >= 900) {
//			System.out.print(" Your Grade is A");
//		} if (average >= 97) {
//			System.out.print("+");	
//		} else if (average >= 90 && average <=92) {
//			System.out.print("-");
//		}

		
		// Alternative Selection Forms
		
		// Unary Operators 
		
		int x = 10;
		int y = 15;
		
		System.out.println(x>y? "X is bigger" : "Y is bigger"); // Unary Operator
		
		// Using if condition to write same code 		
		
		if (x > y) {
			System.out.println("X is BIG");
		}else {
			System.out.println("Y is BIG");
		}
		
		
		String z = x > y ? "True" : "False";
		
		System.out.println(z); // Result for String
		
		boolean a = x > y ? true : false; // remove "" with boolean 
		
		System.out.println(a); // Result for boolean 
	
		
		
		// Switched Cases
		
		String day = "Sat";
		
		switch (day) {
		case"Sat":
			System.out.println("Start of the weekend");	// Will start from here and run all the code until sees break or curly braces 
		case"Sun":
			System.out.println("Last day of weekend");	
		case"Mon":
			System.out.println("First day of the Week");
		}
		
		
		String day1 = "Friday";
		
		switch (day1) {
		case"Tuesday":
			System.out.println("2nd Day"); 
			break;
		case"Wednesday":
			System.out.println("3rd Day");
			break;
		case"Thursday":
			System.out.println("4th Day");	
			break;
			default: // use default when all other option do not work 
				System.out.println("Some other day");
		}
		
		System.out.println("----------------------------------");
		
		String task = "task1";
	
		System.out.println(" Task Left to do");
		
		switch (task) {
		case "task1":
			System.out.println(" Task 1");
			break;
		case "task2":
			System.out.println(" Task 2");	
			break;	
		case "task3":
			System.out.println(" Task 3");
			break;
		
		}
		
		int numberOfdayOfTheWeek = 1;
		
		
		switch (numberOfdayOfTheWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;	
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;		
		}
		
		
		String type = "saving";
		double amount = 480;
		
		// Use switch and if statement 
		// we have 3 types of account, checking, Saving and Credit 
		// if checking and amount is not more then 500, print "Transaction OK"
		// if saving with any amount, print "You Can not directly withdraw from saving"
		// if credit, and amount is less than 1000, print "Transaction OK"
		// Also if amount > 500 print "Confirmation message Sent"
		
		// First Example 
		
//		if (type == "checking" && amount > 500) {
//			System.out.println("Transaction OK!");
//		}else if (type == "saving" ) {
//			System.out.println("You Can not directly withdraw from saving");
//		}else if (type == "credit" && amount < 1000 ) {
//			System.out.println("Transaction OK!");
//		}
//		if (type == "credit" && amount > 500) {
//			System.out.println("Confirmation message Sent");
//		}
		

		// 2nd Example
		
		switch (type) {
		case"checking":
			System.out.println(amount > 500 ? "Transaction Ok!" : "");
			break;
		case"saving":
			System.out.println("You Can not directly withdraw from saving");
			break;
		case"credit":
			if(amount < 1000 ) {
				System.out.println("Transaction OK!");
			}
			if(amount > 500) {
				System.out.println("Confirmation message Sent");
			}	
		}
	
		
		// Interview Question 
		
		// 1 = Odd Number
		// 2 = Even number
		// 3 = Odd number
		// 4 = Odd number
		
		// 1st method - If statement
		
		int x1 = 145870;
		
		if (x1 % 2 == 0) {
			System.out.println("This is Even number");
		}else {
			System.out.println("This is odd number");
		}
		
		
		// 2nd Method - conditional statement
		
		System.out.println(x1 % 2 == 0 ? "This is Even Number" : "This is Odd Number");
		
		
		// Interview Question - (Fizz Buzz) 
		
		// I will give a number that equals to some int value
		// Print "Tek" if the number is divisible by 3
		// Print "School" if the number is divisible 5
		// Print "Tek School" if the number is divisible by 3 & 5
		
		
		int x2 = 35;
		
		System.out.println("------------------");
		
		if (x2 % 3 == 0 && x2 % 5 == 00) {
		System.out.println("Tek School");	
		} else if (x2 % 3 == 0) {
			System.out.println("Tek");
		} else if (x2 % 5 == 00){
			System.out.println("School");
		} else {
			System.out.println(x2);
		}

		System.out.println("-------------------");
		
		
		
		
		
		// Assignment - Weekend
		
//		Create a small Java application for a vending machine.
//		Your application should be able to print item name with item price and total price (item price + tax rate) in separate lines when I select an item (you can create an empty String where I can enter item name) and run the application.
//
//		1.	Items we can buy from the vending machine and prices for each item:
//
//		1.	Coke 		Price = $2
//		2.	Diet Coke	 	Price = $2
//		3.	Redbull Regular 	Price = $3
//		4.	Redbull SugerFree	Price = $3
//		5.	Coffee Regular 	Price = $2.50
//		6.	Coffee DeCafe 	Price = $2.50
//		7.	Water		Price = $1
//
//		2.	Tax rate = 0.05 percent for any item
		
		
		System.out.println("----------------------");
		
		String Item = "REDbull Regular";
		double Price = 0;
		double Taxes = 0.05;
		
		switch (Item) {
		case"Coke":
			
			Price = 2;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"Diet Coke":
			Price = 2;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"REDbull Regular":
			Price = 3;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"REDbull SugerFree":
			Price = 3;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"Coffee Regular":
			Price = 2.5;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"Coffee DeCafe":
			Price = 2.5;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		case"Water":
			Price = 1;
			System.out.println("Item:\t\t " + Item);
			System.out.println("Price:\t\t $" + Price);
			System.out.println("Taxes:\t\t $" + Price * Taxes);
			System.out.println("Total Price:\t $" + (Price + (Price * Taxes)));	
			break;
		}
		
		String status = "passed";
		double grade = 95;
		
		System.out.println("---------------");
		
		switch(status) {
		case "passed":
			System.out.println("You Passed");
			if (grade >= 95 ) {
				System.out.println(" You achived with A grade");
			}
			break;
			
		case "Failed":
			System.out.println("You have failed");
			if (grade >= 75) {
				System.out.println("You have achived F grade");		
			}
			break;
		default:
			System.out.println("You are not graded");
		}
		
		
		
		// Iteration (Loop) or (Looping)
		
				// While Loop
				
				
				// Print 1 to 10
				
				int num1 = 1;
				
				System.out.println(num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				System.out.println(++num1);
				
				System.out.println("------------------");
				
				// or
				
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);
				System.out.println(6);
				System.out.println(7);
				System.out.println(8);
				System.out.println(9);
				System.out.println(10);
				
				
				// First Example - Using While Loop
				
				int x3 = 1;
				
				while (x3 <= 10) {
					System.out.println(x3); // Will run from 1 to 10
					++x3;
				}
				System.out.println("End of the Program");
				
				// 2nd Example - Using While Loop
				
				int x4 = 1;
				
				while (x4 <= 10) {
					System.out.println(x4++); // Will Run from 1 to 10 
				}
				System.out.println("End of the Program");
				
				int x5 = 5;
				
				while (x5 <= 10) {
					System.out.println(x5++); // Will run from 5 to 10
				}
				System.out.println("End of the Program");
				
//				int x6 = 5;
//				
//				while (x6 <= 10) {
//					System.out.println(x5); // It will run infinite (Forever) if we do not increase value of x it  
//				}
//				System.out.println("End of the Program");
				
				
//                int x7 = 1;
//				
//				while (x7 > 0) {
//				System.out.println(x7++); // It will run infinite (Forever) because x7 is not greater then 0
//				}
				
				
				// Event Controlled - Looping 
				
				// Class Examples 01
				// print 10-9-8-7-6
				
				int num3 = 10;
				
				while (num3 > 5) {
					System.out.println(num3--);	
				}
				System.out.println("End of the Program");
				
				
				// Class Examples 02
				// Print even Number 3-5-7-9-11 
				
				
				int num4 = 1;
				
				while (num4 < 11) {
					System.out.println(num4 +=2);
					
					System.out.println("---------------------");
				}
				
				// 2nd way to write the code
				
				int num5 = 3;
					
				while (num5 < 13) {
				System.out.println(num5++);
				num5++;
				
				}
				
				System.out.println("=====================");
				
				// 3rd way to write the same code
				
				int num6 = 3;
					
				while (num6 < 13) {
				System.out.println(num6);
				num6+=2;
				
				}
				System.out.println("--------------------");
				
				// 4th way to write the same code
				
				int num7 = 3;
				
				while (num7 < 13) {
				System.out.println(num7);
				num7++;
				num7++;
				
				}
				// Nested While Loop (Loop in side another loop - Inner loop and outer loop
				
				System.out.println("-------------------");
				
				int num8 = 1;
				int num9 = 1;
				
				while (num8 <= 5) {
				while (num9 <= 5) {
				System.out.print(num9);
				num9++;
					}
				
				System.out.println(); // Will print 12345
				num9 = 1;  // 12345 -12345- 12345- 12345 - 12345 - Will print this 5 times.
				num8++; // After this the while looping process will start again 
				}
		
				// Draw Triangle with nested while loop
				
				System.out.println("-------------------");
				
				int num10 = 5;
				int num11 = 5;
				
				while (num10 > 0) {
				while(num11 >= num10) {
				System.out.print(num11 + " ");
				num11--;
				}
				System.out.println();
				num11 = 5;
				num10--;
				}
						
				
				System.out.println("---------------------");
				
				// Print A to Z (Capital Letters)
				
				char c = 'A';
				
				
				while (c <= 'Z') {
					System.out.print(c++ + " ");
				}
				
				System.out.println();
				System.out.println("-----------------");
				
				// Print a to z (Small Letters)
				
				char A = 'a';
				while (A <= 'z') {
				System.out.print(A++ + ",");
				}
				
				System.out.println();
				
				System.out.println("----------------------");
				
				char b = 'a';
				while (b <= 'z') {
				System.out.print((int) b + "-" + b + ","); // Printing with Assci table value
				b++;
				}
				
				
				// Print Triangle - 10 - 0
				
				int a1 = 10;
				int b1 = 10;
				
				while (a1 >= 0) {
				while (b1 >= a1) {
				System.out.print(b1 + " ");
				b1--;}		
				System.out.println();
				b1 = 10;
				a1--;}
				
				
				System.out.println("---------------------------");
				
				int num25 = 15;
				int num26 = 15;
				
				while (num25 >= 0) {
				while (num26 >= num25) {
				System.out.print(num26 + " ");
				num26--;	
				}
				System.out.println();
				num26 = 15;
				num25--;
				}
				
				
	}

}

