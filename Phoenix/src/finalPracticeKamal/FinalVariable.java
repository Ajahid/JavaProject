package finalPracticeKamal;

public class FinalVariable {

	
		
		
		static String name = "Abdul"; 
		final String passwod = "Abdul123"; // if select final - we can not change the value of the variable 
		
		public static void main(String[] args) {
			
			
			System.out.println(name); // We can call static variable directly 
			
			FinalVariable obj = new FinalVariable ();
			
			System.out.println("Old Passwrod: " + obj.passwod);
			
			String str = obj.passwod = "Jahid123"; // We can change the password
			
			
			System.out.println("New Password: " + str); // Printing new password 
			
		}


}
