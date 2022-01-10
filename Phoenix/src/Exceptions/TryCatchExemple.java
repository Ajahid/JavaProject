package Exceptions;

public class TryCatchExemple {

	public static void main(String[] args) {
		
		int x= 10;
		int y = 10;
		
		int [] nums = {1,2,3};
		
		// As soon as system catch an exception, it will stop running the next catches
		
		try {
			
		System.out.println(x/y);
		
		System.out.println(nums[4]);
		
		} catch (ArithmeticException e) {
			
			System.out.println("Can not Divide by Zero");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("You are pointing to an Index that doesn't Exist");
			
			e.printStackTrace(); // This will print the error where the issue is 
			
			System.out.println("The Message is: " + e.getMessage()); // This will print the error message
		
		} catch (Exception e ) {
			
			System.out.println("Something Went Wrong");
			
			// throw e ; // We use the throw/throws to stop the execution and give us details of the exception 
		} finally {
			System.out.println("Finallay the block will be execuated ");
		// Finally block will be executed any way
		}
		
		
//		Tr-catch
//		Its structured like if statements, but it’s going to sand box the code and try to catch the exceptions that may occur during the runtime.
//		Try{
//		}
//		catch (declare the exception ){
//		This is basically the code that you are going to run if that exception occur
//		}
//		catch (declare the exception ){
//		This is basically the code that you are going to run if that exception occur
//		}
//		Finally{
//		This block is going to get executed regardless other things
//		}
//		Keyword throw vs throws
//		throw: will be like asking gave to run that exception
//		Note: As soon as an exception occurs, the execution of your application will stop.
//		Throws: is like passing the responsibility of handing the exception to the person who call our method.
		
		
		
		System.out.println("End of Program");
	}

}
