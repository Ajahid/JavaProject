package AbsExample2;

public class CheckingAccount extends ExampleClass implements AccountGeneralMethods, Interface2 {

	
	// It will force us to implement all the methods we have in interface and override these methods
	// Inheritance will not force us to import all the methods and override it.
	// We can not create an object of the interface 
	// We can declare interface and initialize a class when creating object
	// we can implement different interfaces to a single class
	// we can implement an interface and also extends a parent class together
	// We can only extends 1 Abstract class at a time 
	
	
	 
	// Interview Question 
	
//	1st Question : Different between Interface and Abstraction Class
//	
//	Interface
	
//	With interface we have to abstract 100% of the code we have in Interface class
	
//	Abstract Class
	
//	With abstract class we have 0% or as many as abstraction we want
//	we can have all abstract classes or zero in our abstract classes
	
	
//	2nd Question: Is there any possible way to have methods with implementation in interface
	
//	yes, we can have implementation of method using static and default 
	
	
	
//	3rd Question: Can we create an object of Abstract class of Interface
	
//	there is no possible way to create object of abstract class and interface
	
	
//	4th Question: an we extend one interface to another interface
	
//	yes, an interface can extend another interface
	
//	5th Question: Can Interface implement another interface
//	
//	No, interface can not implement another interface. 
	

	
	
	
	@Override
	public boolean deposit(double amount) {
		
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		
		return false;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
