package InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		
		
//		What is palindrome ?
		
//		Words we can read same from both sides
		
//		We should enter string and get result in boolean
		System.out.println(isPalindrome("dad"));
		System.out.println(ispalindrome1("mom"));
		System.out.println(ispalindrome3("word"));
		System.out.println(isPalindrome4("level"));
		
		 
	}
	
	// 1st Method - 1st attempt
	
	public static boolean isPalindrome(String Str) {
		String rev = "";
		for (int i = Str.length()-1 ; i >= 0; i--) {
			
		rev += Str.charAt(i);
			
			
		}
//		System.out.println(Str);
//		System.out.println(rev);
		
		return Str.equals(rev);
		 
	 }
	
	// 1st Method - 2nd attempt
	
	public static boolean ispalindrome1 (String str) {
		String rev = "";
		for (int j = str.length()-1 ; j >= 0 ; j--) {
			rev += str.charAt(j);
			
		}
		System.out.println(str);
		System.out.println(rev);
		return true;
		
	}
	
	// 2nd Method - 1st attempt
	
	public static boolean ispalindrome3 (String str) {
		// String Builder and String Buffer
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return String.valueOf(sb).equals(str);
		
	}

	// 2nd Method - 2nd Attempt
	
	public static boolean isPalindrome4(String str1) {
	
	StringBuffer sb1 = new StringBuffer(str1);
	
	sb1.reverse();
	
	return String.valueOf(sb1).equals(str1);
	}

}
