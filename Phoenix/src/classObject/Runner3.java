package classObject;

public class Runner3 {

	public static void main(String[] args) {
		
		
		BankAccount1 cust1 = new BankAccount1 (152215122, "Checking", "Mohammad", "Jahid", "517-598-2177", 0);
		
		System.out.println(cust1.getBalance());
		
		cust1.Deposit(1000);
		
		System.out.println(cust1.getBalance());
		
		cust1.Deposit(200);
		
		System.out.println(cust1.getBalance());
		
		cust1.Withdraw(600);
		
		System.out.println(cust1.getBalance());
		
		cust1.Withdraw(700);
		
		System.out.println(cust1.getBalance());
		
		System.out.println("-----------------------------");
		
		System.out.println(cust1);
	
		

	}

}
