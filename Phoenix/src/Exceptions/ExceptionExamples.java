package Exceptions;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		
//		Error VS Exceptions
		
		// Error
		
		// Any error we can't fix with our code
		// If we have something wrong with our PC, RAM, CUP, Hard Disk or cache has some issue
		// Any thing which prevent code to run due to problem  caused by environment is called an Error
		
		
		
		// Exceptions
		
//		2 Types of Exceptions 
		
//		1 - Pre-defined Exceptions
		
//		2 - User Defined Exceptions 
		
		// User Defined Exception
		// 2 types
		
		// 1 - Check Exceptions
		// 2 - Un-check Exceptions
		
		
		// Checked Exception
		
		// Compile Time Exceptions - Eclipse will tell us that the code has exception and need to be fixed
		
		
		//Un-Check Exception
		
		// Run Time Exception - Exceptions will occur during the run time and error message will appear in thr console
		
		
		// Example of Runtime Exception (Also called Un-Checked Exceptions)
		
		int x = 10; 
		int y = 0; // We can't divide 10/0. it will give us and error (exception)
		// This will give us Arithmetic Exception 
		
		// can create (if) statement to handle exception
		
		if (y == 0) {
			System.out.println("We can not divide by Zero");
		} else {
		System.out.println(x/y);
		}
		
		
		
		int [] nums = {1,2,3,4};
		
		System.out.println(nums[4]); // This will give us un-check error (Index out of bound Exception)
		// We have only 3 index at this array
		
		
		String str = null;
		
		System.out.println(str.charAt(0)); // This will give us un-checked error
		// We will get Null Pointer exceptions.
		
		// This is check exceptions or compile time exceptions
		// Eclipse will tell us that our code is not correct and will not run
		
//		for (int i = 0; i < ; i++) {
//			System.out.println(i);
//		}
		
		
		
		

	}

}
