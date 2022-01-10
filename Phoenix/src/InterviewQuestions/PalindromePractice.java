package InterviewQuestions;

public class PalindromePractice {

	public static void main(String[] args) {
		
		System.out.println("The Palindrome Value 1 is : "+ isPalindrome("12345"));
//		isPalindrome("12345");
		System.out.println("The Palindrome Value 2 is: "+ isPalindrome2("mom"));

	}
	
	public static boolean isPalindrome (String str) {
		String rev = "";
		for (int i = str.length()-1 ; i >=0 ; i --) {
			rev += str.charAt(i);
			
		}
		System.out.println(str);
		System.out.println(rev);
		return str.equals(rev);
	}
	
	public static boolean isPalindrome2(String str) {
		
		StringBuffer sb = new StringBuffer (str);
		sb.reverse();
		
		
	
		return String.valueOf(sb).equals(str);
	}

}
