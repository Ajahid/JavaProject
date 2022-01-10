package classObject;

public class Volkswagon {
	
	public String companyName ;
	public String make ;
	public int model ;
	public double price ;
	public String color ;
	
	
	public Volkswagon () {
		
		this.companyName = "";
		this.make = "";
		this.model = 0 ;
		this.price = 0 ;
		this.color = "";
		
		
	}
	
	
	public Volkswagon (String companyName, String make, int model, double price, String color) {
		
	
		this.companyName = companyName ;
		this.make = make ;
		this.model = model ;
		this.price = price ;
		this.color = color ;
		
		
	}
	
	
	public String Engine () {
		return "3.6 L" ; 
	}
	public String Weight () {
		return "7800 lbs " ;
	}
	public String HorsePower () {
		return "380 HP" ;
	}
	
	public String toString () {
		
		return "Company Name: " + companyName +
		"\nMake: " + make +
		"\nModel: " + model +
		"\nPrice: " + price +
		"\nColor: " + color ;
		
	}
		
	}


