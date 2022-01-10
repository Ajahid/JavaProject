package javaBasics;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		// Sum the Array - 1st Example
		
		int [] a = {5, 2, 7, 9, 6};
		
		int sum = 0;
		
		for (int i = 0 ; i <= a.length-1 ; i++)
			
			sum = sum + a[i];
		
		System.out.println(sum);
		
		System.out.println("************************************");
		
		// Sum the Array - 2nd Example
		
		int [] x = {10,192,317,15,5,34,1,11};
		
		int sum1 = 0;
		
		
		for (int i = 0; i <= x.length-1 ; i++) {
			
		sum1 += x[i];	
			
		System.out.println(sum1);
		
		}
		
		
		
		

	}

}
