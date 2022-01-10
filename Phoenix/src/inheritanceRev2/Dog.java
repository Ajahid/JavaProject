package inheritanceRev2;

public class Dog extends Animal{
	
	private String dogNoise ;
	
	
	public Dog () {
		
		super();
		this.dogNoise = "";
	}
	
	
	public Dog (int legs, int eyes, String eat, String sleep, String dogNoise) {
		
		super(legs, eyes, eat,sleep);
		this.dogNoise = dogNoise ;
		
		
	}
	
	public String getDogNoise () {
		return dogNoise ;
	}
	
	public void setDogNoise (String dogNoise) {
		this.dogNoise = dogNoise ;
	}
	
	
	@Override
	public String toString () {
		return super.toString() + "\nDogNoise: " + dogNoise ;
	}
	
	

}
