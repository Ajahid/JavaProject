package classObject;

public class Chevrolet {
	
	
	public String companyName = "Chevrolet";
	public String model = "Camaro";
	public String color = "White" ;
	public int year = 2019;
	public double price = 35_999; 
	
	
	public String CheveCamaroHorsePower () {
		return " 275 to 560 HP"; 
	}
	
	public String CheveCamaroWeight () {
		return "3,350 to 5600 lbs";
		
	}
	
	public String CheveCameroMpg () {
		return " upto 22 mpg city | 30 mpg highway";
		
	}
	
	public String CheveCamaroEngine () {
		return "2.0 L 4 Cylinder";
		
	}
	
	public static void main(String[] args) {
		
		Chevrolet cheveCamaro = new Chevrolet ();
		
		System.out.println("\n **** 2019 Chevrolet Camaro Details ****");
		
		System.out.println("\n--------------------------------------");
		
		System.out.println("\nCompany: " + cheveCamaro.companyName + "\nModel: " + cheveCamaro.model);
		System.out.println("Model: " + cheveCamaro.year + "\nColor: " + cheveCamaro.color);
		System.out.println("Price : " + cheveCamaro.price);
	
		
		System.out.println("Specification 2019 Chevrolet Camaro");
		System.out.println("----------------------------------");
		
		System.out.println("\n Horse Power: " + cheveCamaro.CheveCamaroHorsePower());
		System.out.println("\n MPG: " + cheveCamaro.CheveCameroMpg());
		System.out.println("\n Weight: " + cheveCamaro.CheveCamaroWeight());
		System.out.println("\n Engine: " + cheveCamaro.CheveCamaroEngine());
		
		
	}

}
