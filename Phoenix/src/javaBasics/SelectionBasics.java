package javaBasics;

public class SelectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// >=95 - A+
				// 90-94 - A-
				
				// 80-89 - B
				// 70-79 - C
				// 60- 69 - D
				// <60 - F
				double grade = 91;
				System.out.println(grade);
				
				if (grade >= 95-100) {
					System.out.println("A+");
				} else if (grade >= 90-94) {
					System.out.println("A-");
				} else if (grade >= 80-89 ) {
					System.out.println("B");
				} else if (grade >= 70-79) {
					System.out.println("C");
				} else if (grade >= 60-69) { 
					System.out.println("D");
				}
				
				
				int age = 51;
				double income = 28000;
				
				if (age > 50) { 
					System.out.println("5 % discount");
				} else if (income < 20000) {
					System.out.println("3% discount");
				}
							
	}

}
