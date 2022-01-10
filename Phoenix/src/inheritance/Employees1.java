package inheritance;

public class Employees1 extends Person1 {

	private int employeeId ;
	private String position ;
	private double salary ;
	
	public Employees1 () {
		super();
		this.employeeId = 0 ;
		this.position = "" ;
		this.salary = 0 ;
		
	}
	
	public Employees1 (String firtsName, String lastName, String dob, String phone, int employeeId, String position, double salary) {
		super(firtsName, lastName, dob, phone) ;
		this.employeeId = employeeId ;
		this.position = position ;
		this.salary = salary ;	
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	
	@Override
	public String toString () {
		return "FirtsName: " + super.getFirstName() +
				"\nLastName: " + super.getLastName() +
				"\nDOB: " + super.getDob() +
				"\nPhone: " + super.getPhone() +
				"\nEmployee ID: " + employeeId +
				"\nPosition: " + position +
				"\nSalary: " + salary ;
	}
	
	
}
