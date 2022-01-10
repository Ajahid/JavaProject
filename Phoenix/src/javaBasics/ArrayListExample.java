package javaBasics;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);

		System.out.println(test.get(0));

		System.out.println("------------------------");

		System.out.println(test.size());

		// for Loop to print

		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}

		System.out.println("------------------------");

		// for each loop to print

		for (Integer i : test) {
			System.out.println(i);
		}

		System.out.println("------------------------");

//		// create an ArrayList that takes String values
//				// add these values "DC", "VA", "CA", "TX"
//				// create a loop that goes through from first to last
//				// create a loop that goes through from last to first
//				// go through the list with foreach loop
//				// print the list without a loop by print the name of the list
//				ArrayList<String> states = new ArrayList<String>();
//				states.add("DC");
//				states.add("VA");
//				states.add("CA");
//				states.add("TX");
//				for (int i = 0; i < states.size(); i++) {
//					System.out.println(states.get(i));
//				}
//				System.out.println("--------------");
//				for (int i = states.size() - 1; i >= 0; i--) {
//					System.out.println(states.get(i));
//				}
//				System.out.println("---------------");
//				for (String i : states) {
//					System.out.println(i);
//				}
//				System.out.println("---------------");
//				System.out.println(states);
//		

		System.out.println("=============================");

		ArrayList<String> Fruits = new ArrayList<String>();

		Fruits.add("Apple");
		Fruits.add("Peach");
		Fruits.add("Orange");
		Fruits.add("Mango");
		Fruits.add("Melon");

		for (int i = 0; i < Fruits.size(); i++) {
			System.out.println(Fruits.get(i));
		}
		System.out.println("-----------------");

		for (int i = Fruits.size() - 1; i >= 0; i--) {
			System.out.println(Fruits.get(i));
		}

		System.out.println("-----------------");

		for (String str : Fruits) {
			System.out.println(str);

		}

		System.out.println(Fruits + " ");

		System.out.println("-----------------------");

		int[][] nums2 = new int[5][3];

		nums2[0][0] = 1;
		nums2[1][1] = 2;
		nums2[2][2] = 3;
		nums2[3][1] = 4;
		nums2[4][0] = 5;

		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) {
				System.out.print(nums2[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("======================");
		int[][] num3 = new int[5][3];

		num3[0][0] = 5;
		num3[1][1] = 4;
		num3[2][2] = 3;
		num3[3][1] = 2;
		num3[4][0] = 1;

		for (int i = 0; i < num3.length; i++) {
			for (int j = 0; j < num3[i].length; j++) {
				System.out.print(num3[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		// 4 Dimension Array
		
		int nums [][][][] = new int [2][3][5][5];
		
		int x = 1;
		
		for (int i = 0 ; i < nums.length ; i++ ) {
			for (int j = 0 ; j < nums[i].length ; j++) {
				for (int k = 0 ; k < nums[i][j].length ; k++) {
					for (int l = 0 ; l < nums[i][j][k].length ; l++) {
						nums [i][j][k][l] = x++;
						System.out.print(nums[i][j][k][l] + "\t");
					}
					System.out.println();
				}
			}
		}
		
		System.out.println("===========================");
		
		// 5 Dimension Array
		
		
		int [][][][][] number1 = new int [3][4][4][5][5];
	
		int x1 = 1;
		
		for (int a = 0 ; a < number1.length ; a++) {
			for (int b = 0 ; b < number1[a].length ; b++) {
				for (int c = 0 ; c < number1[a][b].length ; c++) {
					for (int d = 0 ; d < number1[a][b][c].length ; d++) {
						for (int e = 0 ; e < number1[a][b][c][d].length ; e++) {
							number1[a][b][c][d][e] = x1++ ;
							
							System.out.print(number1[a][b][c][d][e] + "\t");
						}
						System.out.println();
					}
				}
			}
		}
		
		System.out.println("---------------");
		
		// Array List 
		// We have to use Wrapper classes to get data from Primitive data type
		
		
		Integer x2 = 10 ; // This is Integer class. We can call methods when we use Integer 
		int y = 10; // This is only variable and we can't call methods
		
		String z = "5";
		
		
		System.out.println(x2+y); // answer will be 20
		System.out.println(x2 + y +z); // answer will be 205 (first x2+y will will be added and then 5 will be printed
		System.out.println(z+x2+y); // it will print z value (5) then print (10) & (10)
		System.out.println(z + (x2+y)); // result will be 5 (10+10) = 520
		System.out.println(x2 + y + Integer.valueOf(z)); // it will change the String value z to Integer. result will be 25
		
		
		
		
		
		// Will write primitive data as below to obtain classes of these primitive data types when using ArrayList
		
		// byte - Byte
		// short - Short
		// Int - Integer
		// long - Long
		// float - Float
		// double - Double
		// char - Character
		// boolean - Boolean
		
		System.out.println("========================");
		
		
		ArrayList <Integer> nums11 = new ArrayList <Integer>();
		
		
		nums11.add(5); // This will add value  to index of ArrayList 
		nums11.add(10);
		nums11.add(15);
		nums11.add(20);
		nums11.add(25);
		nums11.add(30);
		
		System.out.println(nums11.size()); // Will print the size of the array
		System.out.println(nums11.get(4)); // Will print the value save in index 4
		
		System.out.println("-------------------------");
		
		for (int i = 0 ; i < nums11.size() ; i++) {
			System.out.println(nums11.get(i));
		}
		
		System.out.println("==================");
		
		for (Integer a : nums11) {
			System.out.print(a + " ");
		}
		
		
		// create an ArrayList that takes String values
		// add these values "DC", "VA", "CA", "TX"
		// Create a loop that goes from A-Z
		// Create a loop that goes from Z-A
		// Go through the list with foreach loop
		// Print the list without a loop by print the name in the list
		
		System.out.println();
		System.out.println("***********************");
		
		ArrayList <String> states = new ArrayList <String>();
		
		states.add("DC");
		states.add("VA");
		states.add("CA");
		states.add("TX");
		
		for (int i = 0 ; i < states.size(); i++) {
			System.out.println(states.get(i));	
		}
		
		System.out.println("--------------------");
		
		for (int i = states.size() -1; i >= 0; i--) {
			System.out.println(states.get(i));
		}
		
		System.out.println("--------------------");
		
		for (String i : states) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		
		System.out.println(states);
		
		
		System.out.println("---------------------");
		
		ArrayList <String> data = new ArrayList <String>();
		
		data.add("one");
		data.add("two");
		data.add("three");
		data.add("four");
		
		System.out.println(data.get(2));
		System.out.println(data.size());
		
		System.out.println(data.add("five"));  // It will print boolen true and also add five
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
