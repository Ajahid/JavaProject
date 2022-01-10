package javaBasics;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		
		// Alternate to if Statement - (uniary Statement )
		
		int x = 20;
		int y = 15;
		
		System.out.println(x > y ? "X is bigger" : "Y is Bigger");
		
		// or we can write this with if normal if statement 
		
		if (x > y ) {
			System.out.println("X is bigger");
		} else {
			System.out.println("Y is bigger");
		}

		
		boolean z =  x > y ? true : false; // True /False example 
		
		System.out.println(z);
		
		
		
		
		// Switch Cases 
		// Can't use relational operators with switch cases 
		// will stop running the code when see a break or end of the break
		// We can use byte, short, int & Char
		
		
		
		String day = "mon";
		
		switch(day) {
		
		case "sat":
			System.out.println("Start of the weekend");
			break;
		case "sun":
			System.out.println("last day of the weekend");
			break;
		case "mon":
			System.out.println("Start of the week");
			break;
		}
		
		
		String task = "task1";
		
		switch (task) {
		
		case "task1":
		System.out.println(" Task 1");
		break;
		case "task2":
		System.out.println("Task 2");
		break;
		case "task3":
		System.out.println("Task 3");	
		}
		
		
	
		
		
		
	}

}
