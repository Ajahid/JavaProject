package inheritanceRev2;

public class Animal {
	
	private int legs ;
	private int eyes ;
	private String eat ;
	private String sleep ;
	
	public Animal () {
		
		this.legs = 0;
		this.eyes = 0;
		this.eat = "";
		this.sleep = "";
		
	}
	
	
	
	public Animal (int legs, int eyes, String eat, String sleep) {
		
		this.legs = legs ;
		this.eyes = eyes ;
		this.eat = eat ;
		this.sleep = sleep ;
		
	}
	
	
	public int getLegs () {
		return legs ;
		
	}
	
	public void setLegs (int legs) {
		this.legs = legs ;
	}
	
	public int getEyes () {
		return eyes ;
	}
	
	public void setEyes (int eyes) {
		this.eyes = eyes ;
	}
	
	public String getEat () {
		return eat ;
		
	}
	
	public void setEat (String eat) {
		this.eat = eat ;
	}
	
	public String getSleep () {
		return sleep ;
		
	}
	
	public void setSleep (String sleep) {
		this.sleep = sleep ;
	}
	
	@Override
	public String toString () {
		return "Legs: " + legs +
				"\nEyes: " + eyes +
				"\nEat: " + eat +
				"\nSleep: " + sleep ;
	}
	

}
