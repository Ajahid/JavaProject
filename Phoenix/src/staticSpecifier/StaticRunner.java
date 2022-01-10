package staticSpecifier;

public class StaticRunner {

	public static void main(String[] args) {
		
		
		// Static Rules
		
		// Static variables are store in different past of memory outside the heap 
		
		// We can make static variables and Static methods
		
		// We can not make a static class
		
		// 
		
		
		
		Student obj = new Student ();
		obj.name = "Jack";  // Name is a dynamic variable and we can call it using object
		
		Student obj1 = new Student ();
		obj1.name = "David";
		
		System.out.println(Student.count); // Result will be 2
		
//		Student.count = 10;
//		System.out.println(Student.count); // Result will be 10 
//		System.out.println(obj1.count); // Result will be 10 
//		System.out.println(obj.count); // Result will be 10 
//		
//		Student.count = 15; // This will change the value to all of these object. Because we can only share count from class 
//	
//		System.out.println(obj1.count); // Result will be 15
//		System.out.println(obj.count); // Result will be 15
	
		
		Student obj2 = new Student ();
		obj2.name = "David";
		
		
		Student obj3 = new Student ();
		obj3.name = "David";
		
		Student obj4 = new Student ();
		obj4.name = "David";
		
		Student obj5 = new Student ();
		obj5.name = "David";
		
		
		System.out.println(Student.count); // This will count the objects of the class. Result will be 5
		
		
		
	}

}
