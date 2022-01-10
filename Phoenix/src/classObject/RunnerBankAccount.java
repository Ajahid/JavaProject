package classObject;

public class RunnerBankAccount {

	public static void main(String[] args) {
		
		
		BankAccount Customer1 = new BankAccount (147921, "Abdul", "Jahid", "03/18/1986", 0);
		
		// System.out.println(Customer1.lastName); // This will not run until we put our getters and setters

		Customer1.setFirstName("AbdulMajeed");
		
		System.out.println(Customer1.getFirstName());
		
		Customer1.setAccoutNumber(1234567);
		
		System.out.println(Customer1.getAccountNumber());
		
		System.out.println(Customer1); // Print with toString method
		
		System.out.println(Customer1.getBalance());
		
		Customer1.deposit(500); // To add amount to account
		
		System.out.println(Customer1.getBalance()); // to check the amount in the account
		
		Customer1.deposit(210); // again add balance to account
		
		System.out.println(Customer1.getBalance());
		
		Customer1.withdraw(150); // This will withdraw amount from account
		
		System.out.println(Customer1.getBalance()); // Total after withdraw
		
		Customer1.withdraw(900); // Withdrawing more then the available balance
		
		System.out.println(Customer1.getBalance());
		
	}

}
