package staticSpecifier;

public class StaticPractice {
	
	String name ;
	int rollNumber ;
	static String college = "IST" ;
	
	
	public StaticPractice (String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		
	}
	

	static void change () {
		
		college = "BBIT";
		
	}
	
	
	void display () {
		
		System.out.println(" Student RollNumber: " + rollNumber + " Student Name: "+ name + " College: " + college);
	}
	
}
