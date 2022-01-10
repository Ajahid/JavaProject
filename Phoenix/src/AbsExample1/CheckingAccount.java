package AbsExample1;

public class CheckingAccount extends AccountGeneralMethods{

	
	double balance;
	
	@Override
	public boolean deposit(double amount) {
		if (amount > 0 && amount < 10000) {
			balance += amount;
			return true;
		}
		return false;
		
	}
	
}
