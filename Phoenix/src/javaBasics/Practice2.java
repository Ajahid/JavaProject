package javaBasics;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Water";
		String y = "Kool Aid";	
		String temp;
		
		temp =x ;
		x=y; 
		y=temp;
			
				System.out.println("x: "+x);
				System.out.println("y: "+y);

				
		double amount = 1180;
		double shipping = 0;
		double discountamount = 0;
		boolean expedited = false;
		
		if (amount < 100) {
			shipping = amount * 0.05;
			discountamount = 0;
			expedited = false;
			
		} else if (amount >= 100 && amount < 300) {
			shipping = 0;
			discountamount = amount * 0.02;
			expedited = false;
		} else if (amount >= 300 && amount < 500) {
			shipping = 0;
			discountamount = amount * 0.05;
			expedited = false;
		} else if (amount >= 500 && amount < 1000) {
			shipping = 0;
			discountamount = amount * 0.07;
			expedited = true;
		} else  {
			shipping = 0;
			discountamount = amount * 0.10;
			expedited = true;
		}
			System.out.println("----------------------");	
			System.out.println("Amount:\t\t $" + amount);	
			System.out.println("Shipping:\t $" + shipping);	
			if (expedited == true) {
				System.out.println("Free Expedited Shipping");
			}
			System.out.println("Discount Amount: -$" + discountamount);
			System.out.println("Total:\t\t $" + (amount + shipping - discountamount));
			System.out.println("-----------------------");
			System.out.println("Thank You for Your Shopping ");
			System.out.println("--Prime Time Halal Store--");
			
			
			
	}

}
