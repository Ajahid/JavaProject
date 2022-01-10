package TimeComplexity;

public class TimeComplexityExamples {

	public static void main(String[] args) {
		
		// Time Complexity
		
		// The data and time code will take is called time complexity or O(n) - Big O of notation
		// Each loop will called as big O of n
		// 2 loops will called as big O of n^2
		
		
		// This loop will take is big O of n number of time 
		for (int i = 0; i < 10; i++) {
			
		}
		
		// This is O(n^2)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
				
			}
			
		}
		
		
		// code in separate loops are know as O(n), O(2n), O(3n) 
		// Nested loops will be calculated as O(n), O(n^2), O(n^3)
		
		// This is big O of 2n time
		for (int i = 0; i < 15; i++) { // 15 will be number of time 
			
		}
		for (int i = 0; i < 15; i++) { // 15 will be number of time 
			
		}
		
		// O(n^3)
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
			for (int j2 = 0; j2 < args.length; j2++) {
				
			}	
			}
		}
		
		
		
		

	}

}
