package inheritance;

public class Employee extends Person{
	
	private int idNumber ;
	private String position ;
	private double salary ;
	

	public Employee () {
		super();
		this.idNumber = 0;
		this.position = "";
		this.salary = 0;
		
	}
	
	public Employee (String firstName, String lastName, int age, int idNumber, String position, double salary) {
		
		super(firstName, lastName, age);
		this.idNumber = 0;
		this.position = "";
		this.salary = 0 ;
		
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
