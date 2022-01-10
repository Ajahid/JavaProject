package classObject;

public class Ford150Example {

	
	String companyName = "FordUSA";
	String make = "F150 Truck";
	int model = 2022;
	double price = 65000;
	String color = "White";
	

	
	
	public String FordEngine() {
		
		return "3.6L";	
	}
	public String FordHP() {
		
		return "480 HP";	
	}
	public String FordWeight() {
		
		return "6850 lbs";
	}
	
	
	public static void main(String[] args) {
		
		
		Ford150Example f150 = new Ford150Example ();
		
		
		System.out.println("**** Ford F150 Details ****");
		
		System.out.println("-----------------------------");
		
		System.out.println("\nCompany Name: " + f150.companyName +"\n" + "Make: " + f150.make);
		System.out.println("Model: "+ f150.model + "\n" + "Price: "+ f150.price + "\n" + "Color: " + f150.color);
		
		System.out.println("------------------------------");
		System.out.println("*** Ford 150 Truck Specification ***");
		
		
		System.out.println("\nEngine: " + f150.FordEngine());
		System.out.println("Horse Power: " + f150.FordHP());
		System.out.println("Weight: " + f150.FordWeight());
		
	}
	
}
