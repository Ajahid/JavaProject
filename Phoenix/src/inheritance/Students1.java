package inheritance;

public class Students1 extends Person1{
	
	private int idNumber ;
	private String grade ;
	private String email ;
	
	
	public Students1 () {
		
		super();
		this.idNumber = 0 ;
		this.grade = "" ;
		this.email = "" ;
		
	}
	
	public Students1 (String firtsName, String lastName, String dob, String phone, int idNumber, String grade, String email) {
	
		super(firtsName, lastName, dob, phone);
		this.idNumber = idNumber ;
		this.grade = grade ;
		this.email = email ;
		
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public String toString () {
		return "FirtsName: " + super.getFirstName()  +
				"\nLastName: " + super.getLastName() +
				"\nDOB: " + super.getDob() +
				"\nPhone: " + super.getPhone() +
				"\nIDNumber: " + idNumber +
				"\nGrade: " + grade +
				"\nEmail: " + email ;
	}

}
