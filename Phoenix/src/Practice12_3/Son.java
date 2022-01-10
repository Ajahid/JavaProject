package Practice12_3;

public class Son extends Parent{

	
	private String sonName ;
	private String sonAge ;
	private double sonSalary ;
	
	
	public Son () {
		super();
		this.sonName = "";
		this.sonAge = "";
		this.sonSalary = 0;
	}
	
	public Son (String sonName, String sonAge, double sonSalary) {
		
		super();
		this.sonName = sonName;
		this.sonAge = sonAge ;
		this.sonSalary = sonSalary ;
		
	}

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	public String getSonAge() {
		return sonAge;
	}

	public void setSonAge(String sonAge) {
		this.sonAge = sonAge;
	}

	public double getSonSalary() {
		return sonSalary;
	}

	public void setSonSalary(double sonSalary) {
		this.sonSalary = sonSalary;
	}
	
	public String toString () {
		
		return super.toString() + "\nSon Name: " + sonName + "Son Age: " + sonAge +
				"Son Salary: " + sonSalary ;
		
	}
	

	}


