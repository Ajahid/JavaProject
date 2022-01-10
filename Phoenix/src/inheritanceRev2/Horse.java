package inheritanceRev2;

public class Horse extends Lion{
	
	private String horseNoise ;

	
	public Horse () {
		
		super();
		this.horseNoise = "";
		
	}
	
	public Horse (String horseNoise) {
		
		super();
		this.horseNoise = horseNoise ;
	}
	
	public Horse (int legs, int eyes, String sleep, String horseNoise) {
		
		super();	
		this.horseNoise = horseNoise;
		
		
	}

	public String getHorseNoise() {
		return horseNoise;
	}

	public void setHorseNoise(String horseNoise) {
		this.horseNoise = horseNoise;
	}
	
	
	@Override
	public String toString () {
		return super.toString() + 
				"\nHorse Noise: " + horseNoise ;
		
	}
	
	
}
