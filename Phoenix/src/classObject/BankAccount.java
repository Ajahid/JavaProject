package classObject;

public class BankAccount {
	
	private int accountNumber ;
	private String firstName ;
	private String lastName ;
	private String dob ;
	private double balance ;
	
	public BankAccount () {
		
		this.accountNumber = 0 ;
		this.firstName = "";
		this.lastName = "";
		this.dob = "";
		this.balance = 0 ;
		
	}
	
	public BankAccount (int accountNumber, String firstName, String lastName, String dob, double balance) {
		
		this.accountNumber = accountNumber ;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.balance = balance;
	}

	
	public int getAccountNumber() {
		return accountNumber ;
	}
	public void setAccoutNumber(int accountNumbner) {
		this.accountNumber = accountNumbner;
	}
	
	public String getFirstName () {
		return firstName ;
	}
	public void setFirstName (String firstName) {
		this.firstName = firstName ;
	}
	public String getLasttName () {
		return lastName ;
	}
	public void setLastName (String lastName) {
		this.lastName = lastName ;
	}
	public String getDOB () {
		return dob ;
	}
	public void setDOB (String dob) {
		this.dob = dob ;
	}
	public double getBalance () {
		return balance ;
	}
	
	// making deposit method - This will be design based on the requirements
	// This method is going to return new balance
	// This also add the balance to customer account
	
	public double deposit(double amount) {
		balance = balance + amount ;
		return balance ;
	}
	
	// this method will return balance after withdraw
	// this will deduct the withdraw from balance and return balance
	
	public double withdraw (double amount) {
		if (amount > balance) { // This method is for withdrawing more amount then available
			System.out.println("Insufficiant Amount");
			System.out.println("Withdraw failed");
			return balance ;
		}else {
			balance = balance - amount ;
			System.out.println("Withdraw of $" + amount + "is sucessfully completed");
			return balance ;
		}
	}


	public String toString () {
		
		return "AccountNumber: " + this.accountNumber +  ", " + "First Name: " + this.firstName ;
	}
	
	
}
