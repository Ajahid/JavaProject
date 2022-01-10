package javaBasics;

public class SelectionPractice {

	public static void main(String[] args) {
		
		// total < 100, 5% shipping and no discount
		// total >= 100, free shipping and 2% discount
		// total >= 300, free shipping and 5% discount
		// total >= 500, free expedited shipping and 7% discount
		// total > 1000, free expedited shipping and 10% discount
		
		double amount = 399;
		
		double shipping = 0;
		double discountAmount = 0;
		boolean expedited = false;
		
		
		if(amount < 100) {
			// add 5% for shipping and 0 for discount
			shipping = amount * 0.05;
			discountAmount = 0;
			expedited = false;
		} else if (amount >= 100 && amount < 300) {
			// free shipping and 2% discount
			shipping = 0;
			discountAmount = amount * 0.02;
			expedited = false;
		} else if(amount >= 300 && amount < 500) {
			// free shipping and 5% discount
			shipping = 0;
			discountAmount = amount * 0.05;
			expedited = false;
		} else if(amount >= 500 && amount < 1000) {
			// free expedited shipping and 7% discount
			shipping = 0;
			discountAmount = amount * 0.07;
			expedited = true;
		} else {
			// free expedited shipping and 10% discount
			shipping = 0;
			discountAmount = amount * 0.1;
			expedited = true;
		}
		
		
		System.out.println("--------------------------");
		System.out.println("Amount:\t\t$" + amount);
		System.out.println("shipping:\t + $" + shipping);
		if(expedited == true) {
			System.out.println("Expedited Shipping!");
		} else {
			System.out.println("Standard Shipping!");
		}
		System.out.println("Discount:\t - $" + discountAmount);
		System.out.println("Total:\t\t$" + (amount + shipping - discountAmount));
		System.out.println("--------------------------");

	}

}
