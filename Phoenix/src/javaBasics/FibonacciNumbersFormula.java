package javaBasics;

public class FibonacciNumbersFormula {

	public static void main(String[] args) {
		
		
		// Most popular interview question
		// Fibonacci numbers starts will with 0 & 1 (First number should be 0 and 2nd should be 1)
		// The this Fib formula code will sum previous 2 numbers to get us result of the next number
		
		int range = 30; // We can change the range any time we want
		
		int [] fibnumbers = new int [30];
		
		fibnumbers[0] = 0;
		fibnumbers[1] = 1;
		
		
		
		for (int i = 2 ; i < fibnumbers.length ; i++) { 
			// we know index 0 and index 1 value which is 0 and 1 
			// We will start from index 2 and calculate
			
			fibnumbers[i] = fibnumbers[i-1] + fibnumbers [i-2];
			
			System.out.println(fibnumbers[i]);
			
			}
		
		
		
		// Every number is the sum of all previous numbers (Interview Question)
		// Its not Finonacci
		
		System.out.println("---------------------------");
		
		int sum = 0;
		
		int numbers6 [] = new int [10];
		
		numbers6 [0] = 1;
		
		
		
		for (int i = 0 ; i < numbers6.length-1 ; i++) {
			sum += numbers6[i];
			numbers6[i+1] = sum;
			
			System.out.println(numbers6[i]);
		}
		
		System.out.println("--------------------------");
		
		
		

		int nums2 [][] = new int [7][4];
		int x = 1;
		
		for(int i = 0; i < nums2.length ; i++ ) {
			for (int j = 0 ; j < nums2[i].length ; j++) {
				nums2[i][j] = x++;
				
				for (int [] rows : nums2) {
					for (int cells : rows) {
						System.out.print(cells + "\t");
					}
					System.out.println();
				}
			}
		}
		
		int maj [][] = new int [10][10];
		
		int x1 = 1;
		
		
		for (int i = 0 ; i < maj.length ; i++) {
			for (int j = 0 ; j < maj[i].length ; j++)
				
				maj[i][j] = x1++;
			
			for (int [] rows : maj) {
				for (int cells : rows) {
					System.out.print(cells + "\t");
				
				}
				System.out.println();
			}
			
		}
		
		System.out.println("----------------------------");
		
		int house [][][] = new int [2][3][3];
		
		int x2 = 1;
		
		
		for (int i = 0 ; i < house.length ; i++) {
			for (int j = 0 ; j < house[i].length ; j++) {
				for (int k = 0 ; k < house[i][j].length ; k++) {
					
					house[i][j][k] = x2++;
					
					for (int [][] rows : house) {
						for (int [] rows1 : rows) {
							for (int cells : rows1) {
								System.out.print(cells + "\t");
							}
							System.out.println();
						}
					}
					
				}
				
			}
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
