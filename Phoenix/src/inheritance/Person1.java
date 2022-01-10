package inheritance;

public class Person1 {
	
	
	private String firstName ;
	private String lastName ;
	private String dob ;
	private String phone ;
	
	
	public Person1 () {
		
		this.firstName = "";
		this.lastName = "";
		this.dob = "" ;
		this.phone = "";
		
	}
	
	public Person1 (String firstname, String lastName, String dob, String phone) {
		
		this.firstName = firstname ;
		this.lastName = lastName ;
		this.dob = dob ;
		this.phone = phone ;	
	}
	
	public String getFirstName () {
		return firstName ;
	}
	public void setFirstName (String firstName) {
		this.firstName = firstName ;
	}
	public String getLastName () {
		return lastName ;
	}
	public void setlastName (String lastName) {
		this.lastName = lastName ;
	}
	public String getDob () {
		return dob ;
	}
	public void setDob (String dob) {
		this.dob = dob ;
	}
	public String getPhone () {
		return phone ;
	}
	public void setPhone (String phone) {
		this.phone = phone ;
	}
	
	@Override
	public String toString () {
		return "FirtsName: " + firstName +
				"\nLastName: " + lastName +
				"\nDOB: " + dob +
				"\nPhone: " +phone ;
		
	}

}
