package classObject;

public class Toyota {

	private String manuf;
	private String make;
	private String engine;
	private int model;
	private double price ;
	
	
	public Toyota () {
		
		
		String manuf = "NA";
		String make = "NA";
		String engine = "NA";
		int model = 0;
		double price = 0.0;
		
	}
	
	public Toyota (String manuf, String make, String engine, int model, double price) {
		
		this.manuf = manuf;
		this.make = make;
		this.engine = engine;
		this.model = model;
		this.price = price;
		
		
		
		
	}
	
	public void printInfo () {
		
		String line1 = "Manufacturer: " + manuf + "\t" + "Make: "+ make + "\t"+ "Engine: " + engine ;
	
		String line2 = "Model: " + model + "\t" + "Price: " + price ;
		
		System.out.println(line1 + "\n" + line2);
	
		
		
					
		
		
		
	}
	
	@Override
	public String toString () {
		
		return "Vehicle Specification: " + "[Manufacturer: " + manuf + "\t" + "Make: " + make + "\t"+ "Engine: " + engine +"\t"+ "Model: " + model +"\t" + "Price: " + price + "]";
		
	}
	
	
	public String getmanuf() {
		return manuf;
	}
	
	public void setmanuf(String manuf) {
		this.manuf = manuf;
		
	}
	
	public static void main(String[] args) {
		
		Toyota vehicle1 = new Toyota ("VolksWagon", "Routan", "3.6L", 2014, 9000);
		Toyota vehicle2 = new Toyota ("Toyota", "Camry", "2.5L", 2021, 27000);
		Toyota vehicle3 = new Toyota ("Honda", "Accord", "2.2L", 2019, 19000);
		
		vehicle1.printInfo();
		
		System.out.println("********************************************");
		
		vehicle2.printInfo();
		
		System.out.println("********************************************");
		
		vehicle3.printInfo();
		
		System.out.println("******************************************************");
		
		// Printing with toString method
		
		System.out.println(vehicle2);
		
		System.out.println("******************************************************");
		
		System.out.println(vehicle1);
		
		System.out.println("******************************************************");
		
		System.out.println(vehicle2.getmanuf());
	}
	
	
}

8