package classObject;

public class Student1 {

	String firstName ;
	String lastName;
	int age ;
	String phone ;
	String email ;
	String ssn ;

	public Student1() {
		
		String firstName = "";
		String lastName = "";
		int age = 0;
		String phone = "" ;
		String email = "";
		String ssn = "";
		
	}	
	
	public Student1 (String fn, String ln, int newAge, String ph, String em, String newSSN) {
		
		firstName = fn;
		lastName = ln;
		age = newAge;
		phone = ph;
		email = em;
		ssn = newSSN;
		
	}
	
	public void printInfo () {
		
		// 571-598-2177
		
		String tempPhone = "(+" + phone.substring(0,3) + ")" + phone.substring(3,7) + "-" + phone.substring(8) ;
		String tempSSN = "***-**-" + ssn.substring(7);
		String line1 = lastName + ", " + firstName + " \tAge: " + age + " \tSSN: " + tempSSN;
		String line2 = "Contact Info: (Email: " + email + "," + "\tPhone: " + tempPhone + " )";
		
		
		System.out.println(line1 + "\n" + line2);
	}
	
	
}
