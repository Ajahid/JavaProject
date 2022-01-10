package exceptionHandlingPractice;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		// int num = 10 // This is check exception. The exception our compiler shows are called check exception
		
		
		// throws error we use for checked error
		// Uncheck error have no effect with throws
		
		// try & catch  works with both checked and unchecked exception
		// throws only work with with check exceptions. 
		// We can't use throws with unchecked exceptions
		
		
		
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				
					Thread.sleep(3000); // It will show exception and we need to add throws to the main method to run this code
				}
				
				Thread.sleep(3000);
				System.out.println("Program Finished");
				
				
				
			System.out.println(salary(50));	
			System.out.println(salary(-10));		
		*/
	}
	
	
	public static int salary (int salary) {
		if (salary < 0)
			throw new IllegalArgumentException("Salary Should be Greater then Zero");
		return salary;
	}
	
	
	void show () {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
