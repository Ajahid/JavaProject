package inheritanceRev2;

public class Cat extends Dog {
	
	private String catNoise;
	private String childs ;
	
	public Cat () {
		
		super();
		this.catNoise = "";
		this.childs = "";
		
	}
	
	
	public Cat (String catNoise, String childs) {
		
		super();
		this.catNoise = catNoise ;
		this.childs = childs ;	
	}
	
	
	public Cat (int legs, int eyes, String eat, String sleep, String dogNoise, String catNoise, String childs) {
		
		super(legs, eyes, eat, sleep, dogNoise);
		this.catNoise = catNoise ;
		this.childs = childs ;
	}
	
	public String getCatNoise () {
		return catNoise ;
	}
	
	public void setCatNoise (String catNoise) {
		this.catNoise = catNoise ;
	}
	
	public String getChilds () {
		return childs ;
	}
	
	public void setChilds (String childs) {
		this.childs = childs ;
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() +
				"\nCatNoise: " + catNoise +
				"\nChilds: " + childs ;
	}
	
	
	

}
