package classObject;

public class Items {

	String name;
	double price;
	int searialNumber;
	

	public Items() {

		this.name  = "";
		this.price = 0;
		this.searialNumber = 0;
	}
	
	public Items (String name, double price, int serialNumber) {
		
		this.name = name;
		this.price = price;
		this.searialNumber = serialNumber;	
	}
	
	// 2nd Constructor
	
	public Items (String name, int serialNnumber) {  // We have data for 2 variables
		
		// we have to initialize all variables	
		
		this.name = name;
		this.searialNumber = serialNnumber;	
		this.price = 0; // This should be initialize to default value
		
	}
	
	// In order to print the whole records / memory of the object we will need to develop tostring method
	
	
	@Override
	public String toString() {
		return "Items [Name = " + name + ", Price = " + price + ", SearialNumber = " + searialNumber + "]";
	}

	
	
	
	public static void main(String[] args) {
		
		Items x = new Items ("RedBull", 2.10, 1457913);
		Items x1 = new Items ("Chocolate", 5.99, 5948137);
		
		x.price = 10.99;
		
		System.out.println(x.name +" , "+ x.price + " , "+ x.searialNumber);
		System.out.println(x1.name +" , "+ x1.price + " , "+ x1.searialNumber);
		System.out.println(x1.price);
		System.out.println(x1.searialNumber);
	
		System.out.println(x); // without to string it will print the location 
		
		// with toString we can print the whole details in the object
		
		Items x2 = new Items("Ice Cream", 15874821);
		
		x2.name = "Ice-Cream1";
		
		
		System.out.println(x2.name +" , "+ x2.price + " , "+ x2.searialNumber);
		
		System.out.println(x2.name);
				
		
		
		
		
	}

	
}

