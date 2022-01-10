package inheritance;

public class Student extends Person{ // extends Person is used to call parent class which is person in this case

	private double gpa ;
	private String major ;
	
	
	public Student () {
		
		// 1st method to call variables from parent (person) class
//		super.setFirstName(""); // super keyword is use to refer to parent class
//		super.setLastName("");
//		super.setAge(0);
		
		// 2nd method to call the parent (person) class
		// Super must be called first in the constructor (1st line)
		
		super();
		this.gpa = 0;
		this.major = "";
		
	}
		public Student (String firstName, String lastName, int age, double gpa, String major) {
			
			super(firstName, lastName, age);
			this.gpa = gpa ;
			this.major = major ;
			
		}
		
	
	
	public double getGpa () {
		return gpa ;
		
	}
	
	public void setGpa (double gpa) {
		
		this.gpa = gpa ;
	}
	
	public  String getMajor () {
		return major ;
	}
	
	public void setMajor (String major) {
		this.major = major ;
	}
	
}
