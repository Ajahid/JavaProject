package classObject;

public class VolkswagonRunner {

	public static void main(String[] args) {
		
		
		Volkswagon car = new Volkswagon ("VolksWagon", "Routan", 2014, 9000, "Black");
		
		System.out.println(car.companyName);
		
		System.out.println(car);
		
		System.out.println("------------------");
		
		System.out.println("*** Car Specification ***");
		System.out.println("------------------");
		
		
		System.out.println("Engine: " + car.Engine());
		
		
		
		System.out.println("Weight: " + car.Weight());
		
		
		
		System.out.println("Horse Power: " + car.HorsePower());

	}

}
