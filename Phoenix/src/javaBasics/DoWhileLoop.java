package javaBasics;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		// In-class assignment 
		
		
		for (int a = 7; a <= 18 ; a++) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------");
		
		for (int a = 9; a <= 15 ; a++) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------");
		
		for (int a = -5; a <= 5 ; a++) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------");
		
		for (int a = -10; a <= 0 ; a++) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------");
		
		for (char a = 'a'; a <= 'd' ; a++) {
			System.out.println(a);
		}
		
		
		
		String Status = "Pending";
		int Grade = 95;
		
		 // We can use Switch, If statement, Do while and for while in same code 
		
		
		switch (Status) {
		case "Passed":
			System.out.println("You Passed");
			if (Grade >= 95) {
				System.out.println("You Passed With A Grade");
			}
			break;
		case "Failed":
			System.out.println("You Failed The Test");
			break;
		case "Pending":
			for (int i = 1; i <= 10; i++) {
				System.out.println(Status + " " + i);}
			break;
			default:
		}	
		
		System.out.println("------------------------------");
		// Do While Loop
//		
//		int x = 10;
//		
//		
//		do {
//			System.out.println(x);
//			x++;
//		}while (x > 0);
		
		
		for (char A = 'A'; A <='Z'; A++) {
			System.out.print(A + " ");
			
		}
			System.out.println();
			System.out.println("------------------------");
			
		for (char a = 'a'; a <='z'; a++) {
			System.out.print(a + " ");	
		}
		
		System.out.println();
		System.out.println("------------------------");
			
		for (int a = 1; a <= 50; a++) {
			System.out.print(a + "-");
		}
		
		System.out.println();
		System.out.println("------------------------");
			
		for (int a = -50; a <= 1; a++) {
			System.out.print(a + ",");
			
		}
					
		System.out.println();
		System.out.println("------------------------");
			
		for (int a = -10; a <= 10; a++) {
			System.out.print(a + ",");
			
		}
		System.out.println();
		System.out.println("------------------------");
			
		for (int a = 25; a <= 55; a++) {
			System.out.print(a + ",");
			
		}	
		System.out.println();
		System.out.println("------------------------");
			
		for (int a = 2; a <= 55; a++ ) {
			System.out.print(a + ",");
			
		}

		System.out.println();
		System.out.println("------------------------");
			
		
		int x1 = 10;
		
		
		System.out.println("Result of While Loop"); // Will check condition and then print 
		while (x1 >= 5 && x1 <=10) {
			System.out.println(x1--);
		}
		
		System.out.println("Result of Do-While Loop");
		
		int y1 = 10;
		
		do {
			System.out.println(y1--); // Will print body code and then check the condition
		}while (y1 >= 5 && y1 >=10);
		
		System.out.println("-------------------------");
	
		int [] data = {1,2,3,4,5};
		
		System.out.println(data[2]);
		
		System.out.println("-------------------------");
		
		for (int i = 1 ; i <= data.length ; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		int [] xz = new int [5];
		
		xz[0] = 20;
		xz[1] = 40;
		xz[2] = 60;
		xz[3] = 80;
		xz[4] = 100;
		
		System.out.println(xz[3]);	
		
		
		int [] ab = new int [4];
		
		ab[0] = 2;
		ab[1] = 4;
		ab[2] = 6;
		ab[3] = 8;
		
		
		int [] x4 = {1,2,3,4,5,6,7};
		
		System.out.println(x4[3]);
		
		int [][] count = new int[7][4];
		
		count[0][0] = 1;
		count[0][1] = 2;
		count[0][2] = 3;
		count[0][3] = 4;
		count[1][0] = 5;
		count[1][1] = 6;
		count[1][2] = 7;
		count[1][3] = 8;
		count[2][0] = 9;
		count[2][1] = 10;
		count[2][2] = 11;
		count[2][3] = 12;
		count[3][0] = 13;
		count[3][1] = 14;
		count[3][2] = 15;
		count[3][3] = 16;
		count[4][0] = 17;
		count[4][1] = 18;
		count[4][2] = 19;
		count[4][3] = 20;
		count[5][0] = 21;
		count[5][1] = 22;
		count[5][2] = 23;
		count[5][3] = 24;
		count[6][0] = 25;
		count[6][1] = 26;
		count[6][2] = 27;
		count[6][3] = 28;
		
		
		for (int i = 0; i < count.length ; i++) {
			
			for (int j = 0; j < count.length ; j++) {
				
				System.out.println(count[i][j]);
			}
				
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
