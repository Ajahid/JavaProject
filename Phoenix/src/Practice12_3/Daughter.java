package Practice12_3;

public class Daughter extends Parent{
	
	private String daughterName = "" ;
	private String  daughterAge = "";
	
	
	public Daughter (String daughterName, String daughterAge) {
		
		this.daughterName = daughterName ;
		this.daughterAge = daughterAge ;
		
	}


	public String getDaughterName() {
		return daughterName;
	}


	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}


	public String getDaughterAge() {
		return daughterAge;
	}


	public void setDaughterAge(String daughterAge) {
		this.daughterAge = daughterAge;
	}
	
	
	public String toString () {
		
		return super.toString();
	}

}
