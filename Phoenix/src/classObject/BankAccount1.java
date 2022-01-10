package classObject;

public class BankAccount1 {
	
	private long accountNumber ;
	private String accountType ;
	private String firstName ;
	private String lastName ;
	private String phone ;
	private double balance ;
	
	
	public BankAccount1 () {
	
	this.accountNumber = 0;
	this.accountType = "";
	this.firstName = "";
	this.lastName = "";
	this.phone = "";
	this.balance = 0;
	
	
	}
	
	public BankAccount1 (long accountNumber, String accoutType, String firstName, String lastName, String phone, double balance) {
		
		this.accountNumber = accountNumber ;
		this.accountType = accoutType ;
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.phone = phone ;
		this.balance = balance ;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public double Deposit(double amount) {
		balance = balance + amount;
		return balance ;
	}

	public double Withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("You have insufficient balance");
			System.out.println("Transaction Failed");
			return balance ;
		} else {
			balance = balance - amount ;
			System.out.println("Amount of $" + amount + "is sucessfull");
			System.out.println("Thank you for your business");
			return balance ;
		}
		
		}
	
	public String toString () {
		return "Acount Number: " + accountNumber +
				"\nAccount Type: " + accountType +
				"\nFirst Name: " + firstName +
				"\nLast Name: "+ lastName +
				"\nPhone: " + phone +
				"\nBalance in US $: " + balance ;
		
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
