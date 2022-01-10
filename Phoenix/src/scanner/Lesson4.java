package scanner;

import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What is Your Name: ");
		String name = sc.next();
		
		System.out.println("What is Your Age: ");
		int age = sc.nextInt();
		
		System.out.println("What is your senior Quote");
		String quote = sc.next();
		quote += sc.nextLine();
		
		
		System.out.println("\nHey " + name + " you are " + age + " years old\n");
		System.out.println("Your Senior Quote is " + quote);

	}

}
