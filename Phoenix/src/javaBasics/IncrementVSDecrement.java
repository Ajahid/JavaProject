package javaBasics;

public class IncrementVSDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		
		// Increment (Increase by 1 )
		System.out.println(x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		
		// Decrement (Decrease by 1)
		
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		
		
		// Pre Vs Post (Pre ++x), (Post X++)
		// Pre = Increase first then use the variable 
		// Post = Use the variable then increase it 

int num = 1;
		++num; // pre increment (increase first - then use in)
		num++; // post increment (use the current value in this line and then increase it)
		--num; // pre decrement (decrease first and then use it here)
		num--; // post decrement (use the current value in this line and then decrease it)
		
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x);
		
		int y = 10;
		++y;
		--y;
		System.out.println(++y);
				
		int num2 = 10;
		num2++;
		num2 = num2++ - --num2;
		System.out.println(num2 - 5);
		
		
	}

}
