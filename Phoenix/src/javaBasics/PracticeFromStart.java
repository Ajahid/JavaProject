package javaBasics;

public class PracticeFromStart {

	public static void main(String[] args) {
		
		// Drawing Shapes
		
		System.out.println("      /|");
		System.out.println("     / |");
		System.out.println("    /  |");
		System.out.println("   /   |");
		System.out.println("  /    |");
		System.out.println(" /_____|");
		
		
		System.out.println("-----------------------");
		
		// Variables 
		
		
		
		String characterName = "Dave";
		int charaterAge = 20;
		
		
		System.out.println("There was once a man named " + characterName);
		System.out.println("He was " + charaterAge +" years old.He really likes");
		System.out.println("the name George, but didn't like being " + charaterAge);
		System.out.println("Most of this friends are also " + charaterAge +", and one");
		System.out.println("of them was also named " + characterName);
		
		// Data types
		
		// 2 data types in Java
		
		// a- Primitive data 
		// b- Reference data
		
		
		// Primitive Data types
		// 1- Byte
		// 2- short
		// 3- int
		// 4- long
		// 5- float
		// 6- double
		// 7- char
		// 8- boolean
		
		
		// int age ; // This is declaration 
		int age = 20; // This is called initialization
		age = 30; // This is assignment. 
		
		System.out.println("----------------------");
		
		int myage = 35; 
		String myname = "Abdul Majeed Jahid";
		char mycharater = 'A'; // can take only one character like a, A, c, C, 1, 16 etc.
		double myscore = 8.9; // Double take value with decimal point
		boolean isMale = true; // Can take only true or false value
		
		System.out.println(myage);
		System.out.println(myname);
		System.out.println(mycharater);
		System.out.println(myscore);
		System.out.println(isMale);
		
		System.out.println("Abdul Majeed");	// Will print Abdul Majeed
		System.out.println("Abdul \nMajeed"); // Abdul (First line) Majeed (Second Line). \n is used to move to new line
		System.out.println("Abdul \"Majeed\""); // Majeed will be printed like "Majeed" in the quotation.
		System.out.println("Abdul \b Majeed"); // to print question mark
		System.out.println(" Abdul \t Majeed "); // to print space (tab)
		System.out.println("Abdul Majeed".toUpperCase()); // Will print upper case letter
		System.out.println(myname.toUpperCase());
		System.out.println("Abdul Majeed".toLowerCase()); // This will print lower case letter
		System.out.println(myname.toLowerCase());
		System.out.println(myname.length()); // This will provide the length of the indexes foe the variable 
		System.out.println(myname.contains("Majeed")); // If the string contains the text it will print true otherwise it will print false in the console
		System.out.println(myname.charAt(3)); // This will print the character save at position 3 in the index. First character will be save at 0 index
		System.out.println(myname.indexOf("A")); // This will print the index number where the A is saved
		System.out.println(myname.lastIndexOf("a")); // This will print the index where the last "a" is saved - Index "14"		
		System.out.println(myname.substring(6)); // This will print the string from index 6 - Majeed Jahid
		System.out.println(myname.substring(6,12)); // This will print starting from index 6 to index 12 - Majeed
		System.out.println(myname.substring(0, myname.indexOf(" "))); // This will print from index 0 to first space - Abdul 
		
		
		System.out.println("--------------------");
		
		// Numbers
		
		System.out.println(5); // print number
		System.out.println(3+4); // Will add both number
		System.out.println(4-3); // will subtract number
		System.out.println(3/4); // will return result in zero
		System.out.println(3.0/4.0); // will return result will be accurate 0.75
		System.out.println(10%3); // This will print the reminder after the division.
		
		
		int myInt = 3;
		double myDouble = 5.5;
		
		System.out.println(5 + myInt); // 5 will be added to int value - 8
		System.out.println(myDouble + myInt ); // will add int and double value - result will be in double 
		
		System.out.println(Math.min(myInt, myDouble)); // Will print minimum value of both int and double
		System.out.println(Math.max(myInt, myDouble)); // Will print maximum value of both int and double
		System.out.println(Math.pow(myInt, 3)); // 3 cube value of myint and 3 
		System.out.println(Math.abs(myDouble)); // absolute value of double
		System.out.println(Math.sqrt(myDouble)); // square root of double value
		System.out.println(Math.round(myDouble)); // will print round number of the double
		
		
		
	}
	

}
