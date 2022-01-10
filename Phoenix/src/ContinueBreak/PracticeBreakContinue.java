package ContinueBreak;

public class PracticeBreakContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 25; i++) {
			if (i %2 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		for (int j = 0; j <= 25; j++) {
			if (j %2 != 0) {
				continue;
			
			}
			System.out.println(j);	
		}
		
		for (int i = 0; i < 10; i++) {
			if ( i == 7) {
				continue;
			}
			System.out.println(i); // This will skip 7 
		}
		
		System.out.println("==============================");
		
		for (int i = 0; i < 15; i++) {
			if (i > 4 && i < 8) { // This will skip 5,6,7 in the iteration. 
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------------------------");
		
		for (int i = 0; i < 13; i++) {
			if (i == 10) {
				break; // This will break iteration at 9 and will not print 10,11,12,13
			
			}
			System.out.println(i);
		}
		

	}

}
