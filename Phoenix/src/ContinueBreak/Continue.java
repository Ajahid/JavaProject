package ContinueBreak;

import java.util.Iterator;

import javaBasics.ForAndForEachLoop;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0 ; i < 10 ; i++) {
			if (i == 5) {
				continue; // continue will stop the iteration at 5 and will move to next iteration
			}
			
			System.out.println(i);
			
		}
		
		
		for (int j = 0 ; j < 10 ; j++) {
			if (j > 5 && j < 8) {
				continue; // 6 and 7 will be skipped using continue. 
			}
			System.out.println(j);
			
		}
		
		for (int a = 0 ; a < 10 ; a++) {
			if (a %2 == 0) {
				continue; // This will skip odd number and print even numbers
			}
			System.out.println(a);
		}
		
		for (int b = 0 ; b < 10 ; b++) {
			if (b %2 != 0) {
				continue; // This will skip even number and print off numbers
			}
			System.out.println(b);
		}
		
		// Using break with outter and inner loop
		
		outter: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				System.out.print(i*j + "\t");
				if (i*j > 20) {
					break outter;
				}
			}
			System.out.println();
			
		}
		
	}

}
