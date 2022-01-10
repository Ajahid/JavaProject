package classObject;

public class Runner2 {

	

	public static void main(String[] args) {
		
		Employee x = new Employee (12146, "Davy", "William");
		
		System.out.println(x.getIdNumber(12348)); // need to enter the pin we enter in the class to get correct id number
		
		
		Cricket cric = new Cricket("ICC WORLD T20", "AFGHANISTAN", 11, 5, 3.29);
		
		System.out.println(cric);
		
		System.out.println("---------------------------");
		
		System.out.println(cric.getPlayer());
		System.out.println(cric.getTournament());
		cric.setPoints(3.95);
		
		System.out.println(cric.getPoints());
	
	}

	
}
