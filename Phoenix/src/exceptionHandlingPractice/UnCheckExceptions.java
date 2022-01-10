package exceptionHandlingPractice;

public class UnCheckExceptions {

	public static void main(String[] args) {


		
		// UN-Check
		
		
		
		// Using multiple try and multiple catches
		
		try {		
		String [] str = new String [5];
		System.out.println(str[10]); // This is UN-check error. We will see the error in the console
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.err.println(e.getMessage());
			System.err.println(" You are reading array index out of bound");
		}
		
		try {	
		System.out.println("Tek School".charAt(15)); // This is also UN-check error	
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println(" Trying out of Bound String");
		}
		
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e ) {
			
			System.err.println(" Can't divide by zero");
		}
		
		
		// Using 1 try and multiple catches
		
		
		try {
		String [] str1 = new String [3];
		System.out.println(str1[10]);
		String name = "Abdul Majeed";
		System.out.println(100/0);
		} catch (ArrayIndexOutOfBoundsException e) { // if we use (Exception e) all below codes will not run
			System.out.println("You are reading array index out of bound");
			// System.out.println(e.getMessage()); // This will print system exception message
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Trying out of Bound String");
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		

	}

}
