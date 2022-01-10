package mixPractice;

public class Practice1 {
	
	
	public static void startEndPoint (int startPoint, int endPoint) {
		
		for (int i = startPoint ; i < endPoint ; i++) {
			System.out.println(i);
			
			
		}
	}
		
		void printTwice (String text) {
			
			System.out.println(text);
			newLine();
			System.out.println(text);
		}
		
		// Add a line method - No Passing arguments
		
		void newLine () {
			System.out.println();
			
		}

		// Add value with no passing arguments
		
		void addValues () {
			
			int a = 25;
			int b = 30;
			
			int result = a + b ;
			
			System.out.println(result);
			
		}
		
		
		// Add value with passing arguments
		
		
		static void addValues1 (int num1, int num2) {
			
			int total = num1 + num2 ;
			
			System.out.println(total);
		}
		
		
		// time method with passing argument
		
		
		static void printTime (int hour , int min) {
			
			System.out.print(hour);
			System.out.print(":");
			System.out.print(min);
			System.out.println(" AM/PM");
			
			
		}
		
		// Methods with return types and no passing arguments 
		
		static int addTwoValues () {
			
			int a = 30;
			int b = 40;
			
			int total = a+b;
			
			return total; 
			
		}
		
		// boolean method
		
		static boolean purchase (int age) {
			
			boolean eligible;
			if (age >= 18)
				eligible = true;
			else
				eligible = false;
				return eligible;
		}
		
		
		
		
		
	}


