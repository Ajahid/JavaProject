package classObject;

public class Student {
	
	String name;
	int age;
	
	// Default constructor - No parameters
	public Student () {
		name = "";
		age = 0;
		
	}
	
	// Below is parameterized constructor with arguments
	// constructor is a method that we will run when creating an object of a class
	// Here "Public is called Access , "Student" is class name and inside parameters are "Arguments"
	// Below Whole line is called "Definition"
	// Name of the class and arguments are called "Signature"
	
	public Student (String newName, int newAge) {
		
		// Below is the body or called as "Implementation" in the class
		
		name = newName;
		age = newAge;
		
		
	}
	
	public void print() {
		System.out.println("Student Name: "+ name + ", Age: "+ age);
		
	}

}
