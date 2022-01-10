package finalKeyword;

public class Final {

	public static void main(String[] args) {
	
		int x = 10;
		
		x = 5 ;
		
		// Constant Variable / Unchangeable
		
		final int y = 10; // Using final keyword we can't change the value of variables
		
		// y = 5 ; // Here we can't change the the value of y because it's described as final 
		
		// y++; // We also can't increment and decrement the y value if it's final 

		
		// (3) Use chases for final
		
		// 1 - Final Variables: You can not assign a new value to the final variable after the first time
		
		// 2 - Final Methods: Final methods can not be overridden but we can inherit 
		
		// 3 - Final Class: Final classes can not be inherited. Final class can not be parent class as no one can inherit from final class
		
		
		
	}

}
