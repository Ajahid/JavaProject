package finalPracticeKamal;

 class A { // final class { Final class can't be extended

	 final void show () { // Can't override final method
		 
		 System.out.println("This is Class A method");
		 
		 
		 
	 }
	 
	 
}

class B extends A{ // Final class is un-expendable 
	
	void show () { // Can not override final method 
		 System.out.println("This is Class A method");
		
	} 
	
	
	
	
	
	
	
	
	// We can create object of class A
}


