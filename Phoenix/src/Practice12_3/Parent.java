package Practice12_3;

public class Parent {
	
	private String fatherName ;
	private String motherName ;
	private String fatherAge ;
	private String motherAge ;
	
	public Parent () {
		
		fatherName = "";
		motherName = "";
		fatherAge = "";
		motherAge = "";
		
	}
	
	public Parent (String fatherName, String motherName, String fatherAge, String motherAge) {
		
		this.fatherName = fatherName ;
		this.motherName = motherName ;
		this.fatherAge = fatherAge ;
		this.motherAge = motherAge ;
		
	}
	
	public String fatherMethod () {
		
		return "father is the backbone of the family";
	}
	
	public void motherMethod () {
		
		System.out.println("Janna is under the mothers foot");
		
	}
	
	
	public String getFatherName () {
		
		return fatherName ;
	}
	
	public void setFatherName (String fatherName) {
		
		this.fatherName = fatherName;
		
	}
	
	public String getMotherName () {
		
		return motherName ;
		
	}
	
	public void setMotherName (String motherName) {
		
		this.motherName = motherName ;
	}
	
	
	public String getFatherAge () {
		
		return fatherAge ;
	}
	
	public void setFatherAge (String fatherAge) {
		
		this.fatherAge = fatherAge ;
	}
	
	public String getMotherAge () {
		
		return motherAge ;
	}
	
	public void setMotherAge (String motherAge) {
		
		this.motherAge = motherAge ;
	}
	
	
	@Override
	public String toString () {
		
		return "Father Name: " + this.fatherName + "  Father Age: " + this.fatherAge +
		"\nMother Name: " + this.motherName + "  Mother Age: " + this.motherAge ; 
	}
	

}
