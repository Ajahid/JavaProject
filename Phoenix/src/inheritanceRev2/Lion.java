package inheritanceRev2;

public class Lion extends Cat {
	
	private String lionNoise ;
	
	public Lion () {
		
		super();
		this.lionNoise = "";
		
	}
	
	
	public Lion (String lionNoise) {
		super();
		this.lionNoise = lionNoise ;
	}


	public String getLionNoise() {
		return lionNoise;
	}


	public void setLionNoise(String lionNoise) {
		this.lionNoise = lionNoise;
	}
	
	@Override
	public String toString () {
		return super.toString() +
				"\nLion Noise: " + lionNoise ;
	}
	
	

}
