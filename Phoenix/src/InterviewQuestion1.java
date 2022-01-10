
public class InterviewQuestion1 {

	public static void main(String[] args) {
		
		
		// Check Odd or Even number
		
		
		
		isNumberEvenOrOdd(19);
		isNumberEvenOrOdd(30);
		
		for (int i = 0; i < 1000 ; i++) {
			
			isNumberEvenOrOdd(i);
			
		}

	}
	
	public static void isNumberEvenOrOdd (int num) {
		
		
		if (num % 2 == 0) {
			
			System.out.println(num + " Number is Even");
		}else {
			System.out.println(num + " Number is Odd");
		}
		
	}
	

}
