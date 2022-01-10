package inheritanceRev;

public class A {

	 private int num ;
	 
	 public A () {
		 
		 this.num = 0 ;
	 }
	 
	 public A (int num) {
		 this.num = num ;
		 
	 }
	 
	 public int getNum () {
		 return num ;
	 }
	 public void setNum (int num) {
		 this.num = num ;
	 }

	@Override
	public String toString() {
		return "num = " + num ;
	}
	 
	 
	 
	
}
