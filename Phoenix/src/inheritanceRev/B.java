package inheritanceRev;

public class B extends A{
	
	private int numB ;
	
	
	public B () {
		
		super();
		this.numB = 0 ;
	}
	
	public B (int num, int numB) {
		
		super(num);
		this.numB = numB ;
		
	}
	
	
	public String toString () {
		return super.toString() + " , numB = " + numB;		
	}

}
