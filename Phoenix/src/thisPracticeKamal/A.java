package thisPracticeKamal;

public class A {

	int num1 = 200;
	int num2 = 400;
	
	
	
}

class B extends A{
	
	int num3 = 900;
	int num4 = 800;
	
	void add(){
		
		int num5 = 700;
		int num6 = 400;
		
		System.out.println(this.num3);
		System.out.println(this.num4);
		System.out.println(num5);
		System.out.println(num6);
	}
	
	
	void showMessage () {
		
		this.add();
		System.out.println(super.num1);
		System.out.println(super.num2);
		
	}
	
	
}
