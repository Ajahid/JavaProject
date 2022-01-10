package classObject;

public class Employee {
	
	
	// to encapsulate the class we make varibales private so they are no longer accessable
	
	private int idNumber;
	private String firstName ;
	private String lastName ;
	
	
	public Employee () {
		
		this.idNumber = 0;
		this.firstName  = "" ;
		this.lastName = "";
		
	}
	
	public Employee (int idNumber, String firstName, String lastName) {
		
		this.idNumber = idNumber;
		this.firstName  = firstName;
		this.lastName = lastName;
		
	}
	
	@Override
	public String toString () {
		return "ID Number:" + idNumber + " ( Last Name: "+ lastName + ", First Name: "+ firstName + ")";
	}
	
	
	// Access Modifier
	
	// Private
	// Public
	// Protected
	// Default 
	
	
	// to get the value of the object we use getters
	// it's also called accessor 
	
	public int getIdNumber (int pin) { // To make this protected we will use the pin.
		
		if (pin == 1234) { // We will need to enter 1234 in our object class to obtain this value
			return idNumber;
		}else {
			return 0; // Entering wring pin we will get o in the console
		}
	}
				
	
	
	// sitters method is use to assign value or change value
	// also called as mutators 
	
	public void setIdNumber (int idNumber) {
		
		this.idNumber = idNumber;
		
	}
	

}
