package classObject;

public class Runner1 {

	public static void main(String[] args) {
		
		Student1 st1 = new Student1("Mohammad Mustafa", "Jahid", 15, "571-598-2177", "Mohammad.jahid@gmail.com", "179-25-6574" );
		Student1 st2 = new Student1("Murtaza", "Jahid", 1, "571-598-2188", "Mohammad.murtaza@gmail.com", "189-29-6579" );
		
		
		// First method to print the Student data
		
		System.out.println("Student First Name : " + st1.firstName);
		System.out.println("Student Last Name : " + st1.lastName);
		System.out.println("Student Age : " + st1.age);
		System.out.println("Student Phone : " +  st1.phone);
		System.out.println("Student Email : " +  st1.email);
		System.out.println("Student SSN : " +  st1.ssn);
		
		
		
		// 2nd method to print the Student data
		
		st2.printInfo();
		
		System.out.println("*************************************");
		
		Session1 phoenixClass = new Session1 ();
		phoenixClass.sessionName = "Phoenix";
		phoenixClass.Student1.add(st1);
		phoenixClass.Student1.add(st2);
		
		
		phoenixClass.printSessioninfo();
		
		
		
		
	}
	
}
