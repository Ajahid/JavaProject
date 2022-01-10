package AbsExample2;

public interface AccountGeneralMethods {
	
	public boolean deposit (double amount);
	public boolean withdraw (double amount);
	
	
//	public void depositAmount (double amount) { // We can't have method body in interface
//		
//	}
	
	public static void someMethod () { // We can have body of the method (Implementation ) with using static keyword 
	// Static method belong to the interface 
		
		System.out.println("SomeMethod");
		
		
		
	}
	
	public void doSomething(); // This will not import to implemented class
	
	public default void doSomethingElse () { // Using default keyword is will automatically inherit to all class implementing the interface.
		System.out.println("Print the Implementation of DoSomethingElse");
		
	}

	
	
	

}
