package javaBasics;

public class Practice123 {

	public static void main(String[] args) {

		System.out.println("Java is Fun");

		int x = 10;
		String y = "test";

		System.out.println(x); // Print x value

		System.out.println(x + 10); // Add x value to 10

		System.out.println(4 + 5); // addition of two numbers

		System.out.println(4 + "test"); // concatenation. Adding non numerics

		System.out.println(x + 5); // Add X value to 5

		System.out.println(x + 5 + " some text"); // concatenation. Adding Numeric to non numeric

		System.out.println("some text " + x + 5); // some text 10 will be processed from left to right and then print 5
													// next to 10

		System.out.println("some text " + (x + 5)); // First parenthesis will process and then non numeric value

		// Selection Method

		int Sally = 20;
		int BobAge = 17;

		if (BobAge > Sally) {
			System.out.println("Boob");
		} else {
			System.out.println("Sally");
		}

		// Selection Method

		int num4 = 25;
		int num5 = 15;

		if (num4 > num5) {
			System.out.println("Print First Line");
		} else {
			System.out.println("Print 2nd Line");
		}

		// Syntax -- The rule of the language is the syntax of the language

		// Semantics - The meaning of the line is called semantics

		int x1 = 10;
		int x2 = 2;
		int sum = x1 + x2;

		System.out.println(sum);

		int x3 = 10;
		int x4 = 2;

		System.out.println("sum: " + x3 + " + " + x4 + " = " + (x3 + x4));

		// Should use A-Z, a-z, $ _ when creating names
		// No space between names
		// int $num or int num_123 - We can use these creating names
		// int 123 - We can't start names with numbers
		// can contain unlimited numbers and numerics
		// can't be Java reserved words
		// int thiisalongname = 10; - Not a good way to write names
		// int this_is_a_long_name = 10; - Try to separate words with underscore
		// int ThisIsALongName= 10; - Camel Casing - Good Practice - Most office use
		// camel casing

		// We always start variables, methods, and package names with lower case
		// We always start class names with upper case letters

		// Creating Variables

		int x10; // Declaration Process
		int x5 = 10; // Initialization Process
		x5 = 15; // Assignment Process

		// Data Types

		// A. Primitives - 8 Data types
		
		// Can't store decimal point numbers
		// 1 - byte - -128 to 127 / 1 byte
		// 2 - Short - 12567; / 2 byte
		// 3 - Int - 1321244; // 4 byte space
		// 4 - Long - 513513131351335L; // 8 Byte space
		// Numbers with decimal points numbers
		// 5 - float - 1.15f; // 2 byte
		// 6 - double - 1.4949454464; // 4 byte
		// 7 - char - A character ('b' or '9') - Space not assigned
		// 8 - boolean - true or false ; // 1 bit

		// B. Reference (Objects)
		
		
		// find num3 value 
		
		int num1 = 5;
		int num2 = 8;
		int num3 = 13;
		
		num1 = num2;
		num2 = num3;
		num3 = num1;
		
		System.out.println(num3);
		
		// num3 value will be 8
		
		
		// Operators
		
		int x11 = 5; // Assignment operators
		x11 = 6+3; // Addition - x11 = 9
		x11 = 5-2; // Subtraction - x11 = 3
		x11 = 2*4; // Multiplication - x11 = 8
		x11 = 6/2; // Division - x11 = 3
		x11 = 5%3; // Modulus - x11 = 2
		
		
		System.out.println(5%3); // Modulus
		System.out.println(17%7); // Modulus 
		
		// Precedence means which task should be performed first
		
		// () Parenthesis - Will run first
		// * - Multiplication will be done and in the method
		// / - Division will be done 3rd in the method
		// - - Subtraction will be performed 4th in the method
		// + - Addition will be performed last in the mentioned 
		
		
		System.out.println(1+2*2); // in the code multiplication will be run first and then addition. Result will be 5
		
		// g = 14; // in this case 14 is a value.
		// g = 14+5; // in this case 14+5 is called expression.
		
		// 10/0 - We will get exception 
		// 0/0 -  We will get exception 
		// 10.0/0 - We will get infinity result
		// 0.0/0.0 - Nan result 
		
		System.out.println(0.0/0.0);
		
		int num321 = 5 + 7 / 3 - 6 % 4;
		
		System.out.println(num321);  // First system will perform division then modulus and then addition 
		
		// Mixed Type - Adding double variables to integer value 
		// Promotion will take place - Int will br promoted to double for correct answer
		
		int xy = 7;
		double zy = 9.5;
		
		double sum5 = xy + zy;
		
		System.out.println(sum5); // int will be promoted to double to provide more precise result - Result will be 16.5
		
		// double used with byte - float - result will be double 
		// float used with byte - long - result will be float 
		
		
		// Casting 
		// Implicit casting
		// Explicit casting
		
		
		int x9 = (int) 1.5; // convert double to int. this is explicit casting
		
		double b12 = 10.9;
		
		System.out.println(b12); // result will be 10.9
		
		
		System.out.println((int)b12); // result will be 10 - explicit casting 
		System.out.println(x9/b12); // result will be 0.91 - implicit casting 
		
		double x14 = 17.5/6; // joining double value to int is known is implicit 
		
		System.out.println(x14);
		
		// Round up = 10.2 = Result will be 11 - Any thing 10+ will be count as 11
		// Round off = 10.1 = Result will be 10 - 10.6 - result will be 11
		// Round down = 10.8 = Result will be 10 - 10.2 result will be 10
		
		
		
		// Shortcut Operators
		
		// x = 10; // x value is 10
		// x = 10+5; // x value is 15
		// x = x+x; // x value will be 30 (x = 15+15)
		
		// if x value is 10
		// x += 10; (This means x = x + 10)
		
		int num1234 = 10;
		
		num1234 += 10;
		
		System.out.println(num1234); // num1234 = num1234 + 10 - Result will be 20
		
		// if x value is 10
		// x *= 10; (This means x = x * 10)
		
		// if x value is 10
		// x /= 10; (This means x = x / 10)
		
		// if x value is 10
		// x -= 10; (This means x = x - 10)
		
		// if x value is 10
		// x %= 10; (This means x = x % 10)
		
		int num50 = 5;
		num50 *= 10; // num50 = 5*10
		
		System.out.println(num50);
		
		num50 %= 2;
		
		System.out.println(num50); // num50 = 50 % 2 (result will be 0)
		
		
		// Increment & Decrement
		
		// Increment - increase by one
		
		int x19= 10;
		x19 += 1; // x19 = x19 + 1
		++x19; // x19 (11 + 1 = 12)
		
		System.out.println(x19);
		
		System.out.println(++x19);
		System.out.println(++x19);
		System.out.println(++x19);
		System.out.println(++x19);
		System.out.println(++x19);
		
		
		// Decrement - Decrease by one
		
		
		
		int x21= 10;
		x21 += 1; // x19 = x19 + 1
		--x21; // x19 (11 - 1 = 10)
		
		System.out.println(x21);
		System.out.println(--x21);
		System.out.println(--x21);
		System.out.println(--x21);
		System.out.println(--x21);
		
		
		// Pre - Post 
		
		// Pre - Increase first then use the variable
		// Post - Use Variable then increase the value
		
		System.out.println(++x21); // Pre - Increment
		System.out.println(x21--); // Post - Increment
		
		System.out.println(--x21); // Pre - Decrement
		System.out.println(x21--); // Post - Decrement 
		
		int x22 = 10;
		
		x22++;
		++x22;
		
		System.out.println("What is the value =>" + x22); // Result will be 12
		
		int x23 = 10;
		--x23;
		x23++;
		
		System.out.println("What is the value =>" + ++x23); // Result will be 11
		
		
		int x24 = 0;
		--x24;
		--x24;
		--x24;
		x24++;
		x24++;
		
		System.out.println("What is the value =>" + ++x24); // Result will be 0
		
		
		int x25 = 7;
		++x25;
		x25 = ++x25 + ++x25; // x25 (8) = x25(9) + x25(10) - 9+10= 19  <== Result 
		
		System.out.println("What is the value =>" + ++x25); // Result will be 20
		
		
		int x26 = 7;
		x26++;
		x26++;
		++x26;
		x26--;
		int yx = x26 + 10;
		
		System.out.println("What is the value =>" + ++x26); // Result will be 10
		
		int x27 = 5;
		x27 = x27 +1; // 5+1 = 6
		x27++; // 6+1 = 7
		x27--; // 7-1 = 6
		x27 *=2; // x27 - 6*2 = 12
		int ya = x27 +10; // y = 12+10 = 22
		ya = x27++; // y (22) = x27 (12+1) - Result will be ==> 13
		
		System.out.println("What is the value => "+ ++x27); // Result will be 14
		
		// Difference between addition and increment/Decrement 
		
		// With addition we are only adding a value to variable
		// With increment/decrement will will assign a new value to variable 
		
		
		int temp1 = 10;
		System.out.println(temp1 + 1); // Only adding 1 to temp1 value
		System.out.println(temp1++); // This will change the value from 10 to 11
		
		
		
		// Pre - Increment : ++x - Increase Value + Use it
		// Post - Increment : x++ - Use X value and then Increase value
		
		// Pre - Decrement : --x - Decrease the Value and then Use it
		// Post - Decrement : x-- - Use X value and then Decrease the value
		
		int num6 = 10;
		num6++; // Value will be 10+1 = 11
		num6 = num6++ - --num6; // 12 -1  - 11 -- 11 -11 - Result will be ==> 0
		
		System.out.println(num6 -5); // num6 (0 - 5) - Result will be ===> -5
		
		
		int num7 = 19; 
		int num8 = num7 +58; // 77
		num7 = num8; // num7 = 77
		num8 = ++num7 + 10 - 5; // 78 + 10 = 88 -5 = 83
		num7 = num7 + 1; // 79
		
		System.out.println("What is the value => "+ num7); // ===> 79
		System.out.println("What is the value => "+ num8); // ===> 83
		
		int xc = 5;
		int xd = 6;
		
		int xe = ++xc - xd++ + xc++; // xe = 1+5 (6) - 6(6+1) + 6 (6+1) Result will be 6 -6 = 0 + 6 = 6
		
		System.out.println(xe);
		
		
		
		// Escape Sequences 
		// \" Quote \" - Will print text in double quote 
		// \t Quote \t - Put tab space in the line
		// \n Quote \n - This means go to next line
		
		
		System.out.println("this is the \"test\" string"); // this is the "test" string
		
		System.out.println("this is the \t test\t string"); // this is the 	 test	 string
		
		System.out.println("this is the \n test string"); // After putting \n text will moved to new line
		
				
		// Escape sequences is used in used in special cases 
		
		
		
		// If Selection or If Statement
		// If selection is used with only boolean (True/False)
		
		
		if (true) {
			System.out.println("we are running true block"); // 
		}
		
		int h = 25;
		int i = 15;
		
		if (h>i) {
			System.out.println("Is this correct ");
		} else {
			
		}
		
		
		int age = 16;
		
		if (age >= 17) {
		System.out.println("You can drive");	
		} else {

		}
		
		
		// If statement 
		// If/else Statement 
		// if / else if / if statement 
		
		
		// 90-100 - A
		// 80-89 - B
		// 70-79 - C
		// 60-69 - D
		// < 60 = F
		
		double grade = 69;
		
		if (grade >= 90) {
			System.out.println(" Your Grade is \"A\" "); // If grade is between 90 - 100, this line will be print
		} else if(grade >= 80) {
			System.out.println(" Your Grade is \"B\" "); // If grade is between 80 - 89, this line will be print
		} else if(grade >= 70) {
			System.out.println(" Your Grade is \"C\" "); // If grade is between 70 - 79, this line will be print
		} else if (grade >= 60) {
			System.out.println(" Your Grade is \"D\" "); // If grade is between 60 - 69, this line will be print
		}else {
			System.out.println(" Your Grade is \"F\" "); // // If grade is less then 60, this line will be print
		}
		
		
		
		
		// >95 - A+
		// 90-94 - A-
		// 85-89 - B+
		// 80-84 - B-
		// 75-79 - C+
		// 70-74 - C-
		// 65-69 - D+
		// 60-64 - D-
		// < 60 = F
		
		
		double grade1 = 58;
		
		
		if (grade1 >= 95) {
			System.out.println(" Your Grade is \"A+\" "); 
		} else if(grade1 >= 90) {
			System.out.println(" Your Grade is \"A-\" "); 
		} else if(grade1 >= 85) {
			System.out.println(" Your Grade is \"B+\" "); 
		} else if (grade1 >= 80) {
			System.out.println(" Your Grade is \"B-\" "); 
		} else if (grade1 >= 75) {
			System.out.println(" Your Grade is \"C+\" "); 
		} else if (grade1 >= 70) {
			System.out.println(" Your Grade is \"C-\" "); 
		} else if (grade1 >= 65) {
			System.out.println(" Your Grade is \"D+\" "); 
		} else if (grade1 >= 60) {
			System.out.println(" Your Grade is \"D-\" "); 
		}else {
			System.out.println(" Your Grade is \"F\" "); 
		}
		
		
		
		
		// Or we can also write nested method
		
		double grade4 = 77;
		
	
		if (grade4 >= 90) {
			if (grade4 >= 95) {
			System.out.println(" Your Grade is \"A+\" ");
			} else {
				System.out.println(" Your Grade is \"A-\" ");} 
		} else if (grade4 >= 80) {
			if (grade4 >= 85) {
			System.out.println(" Your Grade is \"B+\" ");
			} else {
				System.out.println(" Your Grade is \"B-\" ");} 
		} else if (grade4 >= 70) {
			if (grade4 >= 75) {
			System.out.println(" Your Grade is \"C+\" ");
			} else {
				System.out.println(" Your Grade is \"C-\" ");} 
		} else if (grade4 >= 60) {
			if (grade4 >= 65) {
			System.out.println(" Your Grade is \"D+\" ");
			} else {
				System.out.println(" Your Grade is \"D-\" ");} 
		} else {
			System.out.println(" Your Grade is \"F\" ");} 
		
		
		int age5 = 17;
		double  income = 83000;
		
		if (age5 > 50) {
			System.out.println("5% discount");
		}else if (income < 29000) {
			System.out.println("3% discount");
		}
		if (income > 80000) {
			System.out.println("You will get additional 2% discount");
		}
		
		
		// If Nested queries 
		
		int y10 = 49;
		
		if (y10 > 10) {
			if (y10 < 50) {
				System.out.println("Y must be between 11 - 49");
			}
		}
		
		
		// Equality operator (==)
		// Not equal operator (!=)
		
		// With equality operator we will check value of both number
		// Result will be in boolean
		
		
		int x30 = 10;
		int y11 = 10;
		
		System.out.println(x30 == y11); // Result will be "True"
				 
		System.out.println(++x30 == ++y11); // Result will be "True"
		
		System.out.println(x30 +1 == y11); // Result will be "False"
		
		System.out.println(++x30 != y11); // Result will be "False"
		
		
		
		// Relational Operators
		// >  - More than
		// <  - Less than 
		// >= - more than and equal to
		// <= - less then and equal to 
		
		
		// Result will be in boolean 
		
		
		int x31 = 10;
		int y12 = 10;
		
		System.out.println(x31 > y12); // Result will be False (10 is not more then 10)
		System.out.println(x31 < y12); // Result will be False (10 is not more then 10)
		System.out.println(x31 >= y12); // Result will be True (10 is equal to 10)
		System.out.println(x31 <= y12); // Result will be True (10 is equal to 10)

		
		
		// logical Operators 
		
		// AND - Sign we use for and is "&&"
		// OR - Sign we use for and is "||"
		// NOT - Sign we use for and is "!"
		// XOR = Sign we use for and is "^"
		
		
		int num55 = 10;
		int num56 = 20;
		int num57 = 30;
		
		if (num55 > num56 || num57 < 50) {
			System.out.println(" True Block"); // Result will be True
		}
		
		
		// && - Both sides must be true to get the True result
		// || - One must be true to get true result
		// ! - Will change result from true to false 
		// ^ - With Xor both side must be different in order to get True result
		
		// T || F = True
		// F && F = False
		// F || T = True
		// T && T = True
		// T && F = False
		
		// !(T || T) = False
		// !F || !T = True
		
		// !(!T && T) || T = True  ( With || One must be true)
		
		// !((T || F) && !(T && T)) = True
		
		// T ^ F = True
		// T ^ T = False
		// F ^ F = False
		//F ^ T - True
		
		// int x60 = 10;
		// int y60 = 15;
		
		 // System.out.println(!(!(x60 > y60) || (x60 +y60) > 50 && T ^ ! F));  // True
					//				! (T  || F && F)
		
		// e = (4<2) && (3>2) || (5>1) ===> Result will be true 
		
		
		// Important Rule for && and ||
		
		// True or anything is True
		// False && anything is False
		
		int temp10 = 10;
		System.out.println( true || ++temp10 > 50); // True || - Eclipse will run code till || - Temp value will not increa
		System.out.println( temp10 > 5  || ++temp10 > 50); // True || - Eclipse will run code till || - Temp value will not increase
		System.out.println( temp10 > 11  || ++temp10 > 50); // True || - Eclipse will run code till || Temp value will increase as the file code is False 
		
		System.out.println(temp10);
		
		
		
		// () - parenthesis 
		// ++, --  - Increment /Decrement operators
		// *, /, % - Multiplication - Division and modulus operators
		// +, -  - Addition / Subtraction operators
		// <,<=, >, >= - Relational Operators
		// == , != - Equality operators 
		// && - logical AND
		// || - Logical OR
		// ^ - Logical XOR
		// ! - Logical NOT
		// =, +=, -=, *=, /=, %= - Assignment operators 
		
		
		
		// single line IF statement - We do not need Blocks 
		// With single line only first line is considered as if statement or true statement
		
		
		if (true)
		System.out.println(" This is ingle line statment"); // Only this is part of selection
		System.out.println(" This is ingle line statment"); // These are not considered as if statement
		System.out.println(" This is ingle line statment");
		System.out.println(" This is ingle line statment");
		System.out.println(" This is ingle line statment");
		System.out.println(" This is ingle line statment");
		
		// Block line IF statement - This will written inside the block
		// The whole block is considered as true statement 
		
		
		if (true) {
			System.out.println(" This is block line statment"); // If true, all will run
			System.out.println(" This is block line statment"); // If false, non will run
			System.out.println(" This is block line statment"); 
			System.out.println(" This is block line statment"); 
		}

		
		// Scope 
		
		
		int ad = 10;
		
		if (ad > 5) {
			int cd = 15;
			System.out.println(ad+cd); // int cd can only be accessed from this block
		} else {
			System.out.println(ad+cd); // We can't access cd in this block as this is assigned in separate block
		} // We can only access cd from the block where it is written. 
		
		
		
	}

}
