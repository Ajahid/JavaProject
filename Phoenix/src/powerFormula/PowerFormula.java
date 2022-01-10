package powerFormula;

public class PowerFormula {
	
	public static void main(String[] args) {
		
		System.out.println(numPower(5,3));
		
		
		// or we can use Java Math Class
		
		System.out.println(Math.pow(10, 5)); // Power value
		System.out.println(Math.max(10, 9)); // Max value
		System.out.println(Math.min(29, 20)); // Min value
		
	}
	
	public static int numPower (int num, int pow) {
		int result = num;
		for (int i = 1; i < pow ; i++) {
			result *= num;
						
		}
		
		return result;
	}

}
