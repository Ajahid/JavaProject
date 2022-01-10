package javaBasics;

public class SelectionBasic2 {

	public static void main(String[] args) {
		
		int age = 45;
		

		if (age >=50) {
		
		System.out.println(" You are Hired");
		}
		else if (age <=50) {
			System.out.println("You are not hired");
		}
			
		
		int grade = 70;
		
		if (grade >= 90) {
			System.out.println(" Your Grade For First Semister is" + "A");
		} else if (grade >= 85) {
			System.out.println("Your Grade For First Semister is" + " B");
		} else {
			System.out.println("You have failed");
		}
		
		System.out.println(10*10/5+3-1*4/2); /// 
		
		boolean a = true; // yes
		boolean b = false; // no
		
		System.out.println(a && b);// With && both side need to be True -- Result will be False
		System.out.println(a || b);// Either one need to be true -- result will be True
		System.out.println( !(a && b)); // result will be true 
		
				
		int c = 10;
		int d = 30;
		int e = 50;
		
		System.out.println(c < d && c <e); // True
		
		System.out.println(c < d && c++ <d); // True
		
		int num1 = 200;
		int num2 = 50;
		int num3 = 100;
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("Hello");
		}
		
		
	}

}
