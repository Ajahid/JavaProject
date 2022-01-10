package thisPracticeKamal;

public class This {
	
	
	String name ;
	int age ;
	
	
	This (){
		
		System.out.println("This Reference: " + this); // This will print the reference of the object in the memory 
	}
	
	This (String name, int age){
		
		this.name = name; // We also use this to differentiate/assign our variables in the constructors or methods.
		this.age = age;
		
	}

	public static void main(String[] args) {
		
		This obj = new This ();
		
		System.out.println("Obj Reference: " + obj); //This will print the reference of the object in the memory 

	}

}
