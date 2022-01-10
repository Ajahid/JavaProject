package javaBasics;

import java.util.Iterator;

public class Practice6 {
	public static void main(String[] args) {
		
		// While Loop - Example
		
		
		int x= 10;
		int y = 5;
		
		while(x>0) {
		System.out.println("Outer Loop" + x);
			while(y > 0) {
				System.out.println(y);
				y--;
			}
			y = 5;
			x--;
			
		}
		
		
		int num1 = 1;
		int num2 = 1;
		
		while (num1 <= 10) {
			System.out.println(num1++);	
		}
		
		
		
		// Do While Loop
		// Do while loop will execute body loop and then check the condition, in while loop we check the condition and then execute body of the loop
		
		// Difference between While and Do-While Loop
		
		// While Loop
		
//		int x1 = 10; // This will not run because x1 is not more then 10
//		
//		while (x1 > 10 && x1 < 25) {
//			System.out.println(x1);
//		}
			
//		int x1 = 10; // This will also not run because the condition is false and there fore code will never be executed 
//		
//		while (x1 > 10 && x1 < 25) {
//			System.out.println(x1++); // in this code we only change x1++
//		}
		
		// Do-While Loop
		
		System.out.println("--------------------");
		
		int x2 = 10;
		
		do {
			System.out.println(x2);  // This will  body loop first and will print 10 and then check condition 
		} while (x2 > 10 && x2 < 25);
		
		
		
		int x3 = 10;
		
		do {
			System.out.println(x3++);  // this code will print value 10 and the increase it and the will run till 20  
		} while (x3 > 10 && x3 <=20);
		
		
		
		// For Loop
		
		// in for while loop we initialize, condition and update all inside the loop
		
		// (initialize ; condition ; update )
		
		// Loop will initialize the value - First
		// Will check the condition - 2nd
		// Will execute body of the loop - 3rd
		// will update - 4th
		
		System.out.println("------------------------");
		
		for (int i = 1; i < 10; i++) { //  WILL RUN FROM 1 TO 9
			System.out.println(i);
		}
			
		System.out.println("-----------------------");
		
		for (int i = 10; i > 0; i--){ // WILL RUN FROM 10 - 1
			System.out.println(i);
			
		}
		System.out.println("-----------------------");	
		
		for (int i = 0; i < 10 ; i +=2) {
			System.out.println(i);
		}
		
		
		// Class Assignment 
		
		System.out.println("-----------------------");	
		
		for (int i = 7; i <=18; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");	
		
		for (int i = 9; i <=15; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");	
		
		for (int i = 5; i >= -5; i--) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");	
		
		for (int i = -10; i <= 2; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");	
		
		for (char i = 'a'; i <= 'd'; i++) {
			System.out.println(i);
		}
		

		// Array is  collection of data
		// Single Dimension Array
		// Arrays are fixed in size
		// Array are save in contiguous section/block of memory - means save in same block all together
		// New to assign data type
		// need to mentioned dimension of the array
		// only add same data types. Can't add int to String in array
		
		
		
		int [] data = new int [5]; // Single dimension array of size 5 with no data assigned
		
		data [0] = 10; // Assign data to array
		data [1] = 20;
		data [2] = 30;
		data [3] = 40;
		data [4] = 50;
		
		// System.out.println(data); Will print reference of the data not the values 
		
		System.out.println(data[4]); // Will print the value saved in index 4
		
		data [3] = 1010; // We can change the value of the data saved inside the array at any time
		
	
		System.out.println(data[3]); // will print new value 1010
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]); // Will print all the values
		
		System.out.println("------------------------");
		
		System.out.println(data.length); // Provide the length / size of the array
		
		System.out.println("------------------------");
		
		// To print the value using for while loop
		
		for (int i = 0; i < 5; i++) { 
			System.out.println(data[i]); // Using i as index number (0)
		}
		
		
		System.out.println("------------------------");
		
		
		for (int i = 0; i < data.length; i++) { // Change 5 to data length because the length of data is 5
			System.out.println(data[i]);
		}
		
		System.out.println("------------------------");
		
		
		int[] data2 = {23,43,54,345,67,12,14,43,567,908,1235,1433}; // 2nd way of assigning data to single dimension array
		
		
		System.out.println(data2.length); // this will give us the length of the array
		
		System.out.println(data2[data2.length-1]); // This will give us the last assign value in the array
		System.out.println(data2[data2.length-2]); // This will give us the 2nd last assign value in the array
		System.out.println(data2[data2.length-5]); // This will give us the 5th last assign value in the array
		
		System.out.println("------------------------");
	
		for (int i = data2.length-1; i >=0; i--) {
			System.out.println(data2[i]);			
		}
	 
		System.out.println("------------------------");
		
		
		int [] num3 = new int [5]; //system will automatically assign 0 (zero) once we create an array in database
		
		for (int i = 0; i < num3.length; i++) { // This code will give us result on (0-0-0-0-0)
			System.out.println(num3[i]);
		}
		
		System.out.println("------------------------");
		
		String [] keyword = new String [2]; //system will automatically assign null once we create an array in database
		
		
		System.out.println(keyword[1]); // result will be null
		
		
		System.out.println("------------------------");
		
		double [] numbers = new double [5]; //system will automatically assign 0.0 once we create an array in database
		
		System.out.println("------------------------");
		
		for (int j = 0 ; j < numbers.length ; j++) { // Result will be 0.0
			System.out.println(numbers[j]);
		}
		
		System.out.println("------------------------");
		
		for (int i = 0 ; i < numbers.length ; i++) { 
			numbers[i] = (i + 1) *5; // (0+1) * 5 = 5 - Result will 5 / 2nd time i value will be increased from0 to 1 (1+1) * 5 = 10 and so on
			System.out.println(numbers[i]);
		}
		
		System.out.println("------------------------");
		
		
		// For Each Loop
		// In for each loop the code runs through the entire array or collection
		
		int [] arr = {12,21,5,89,74,96,79,15,19}; // This loop will run through the entire array
		
		for (int i: arr) { // i is a pointer in for each loop where as i is counter in for loop
			System.out.println(i); // i points to the array location in for each loop	
		}
		
		System.out.println("------------------------");
		
		
		String data1 [] = {"v1", "v2", "v3"};
		
		for (String str : data1) {
			System.out.println(str);
		}
		
		System.out.println("------------------------");
		
		String [] names = new String [5];
		
		
		names [0] = "Muzamil";
		names [1] = "Mujtaba";
		names [2] = "Murtaza";
		names [3] = "Mustafa";
		names [4] = "Majeed";
		
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		
		
		// In - Class Practice
		
		// Count - Sum - Avg - 
		
		
		// its going take an array of numbers
		// it will give us the following info
		// count
		// sum of all the numbers in the array
		// min
		// max
		// avg - Formula to get average is sum/count {1,2,3,4} sum of these will be 10 and should be divided with count which is {4}
		
		int [] numbers1 = {5,2,8,14,1,48,75,789,111,179,324,7945,16,3,95,657};
		
		int count = numbers1.length; // This will give us the count of the array
		int sum = 0;
		int min = numbers1[0];
		int max = numbers1[0];
		double avg = 0;
		
		
		for (int i = 0; i < numbers1.length; i++) {
		
			// to find sum
			
			sum = sum + numbers1[i];
			
			 // to find min
			
			if (numbers1[i] < min) {
				min = numbers1[i];
				
				// to find max
				
			}  if (numbers1[i]> max) {
				max = numbers1[i];
			}
		}
		
		// to find avg
		
		avg = sum/count;
		
		System.out.println("-------------------------");
		System.out.println("Count: "+ count);
		System.out.println("Sum: "+ sum);
		System.out.println("Min: "+ min);
		System.out.println("Max: "+ max);
		System.out.println("AVG: "+ avg);
		
		
		// 3D Array - 3 Dimensions Arrays
		
		
		System.out.println("-------------------------");
		
		int [][][] arr1 = new int[5][3][2];
		
		
		arr1 [0][0][0] = 10;
		arr1 [0][0][1] = 15;
		arr1 [0][1][0] = 20;
		arr1 [0][1][1] = 25;
		arr1 [0][2][0] = 30;
		arr1 [0][2][1] = 35;
		arr1 [1][0][0] = 40;
		arr1 [1][0][1] = 45;
		arr1 [1][1][0] = 50;
		arr1 [1][1][1] = 55;
		arr1 [1][2][0] = 60;
		arr1 [1][2][1] = 65;
		arr1 [2][0][0] = 70;
		arr1 [2][0][1] = 75;
		arr1 [2][1][0] = 80;
		arr1 [2][1][1] = 85;
		arr1 [2][2][0] = 90;
		arr1 [2][2][1] = 95;
		arr1 [3][0][0] = 100;
		arr1 [3][0][1] = 105;
		arr1 [3][1][0] = 110;
		arr1 [3][1][1] = 115;
		arr1 [3][2][0] = 120;
		arr1 [3][2][1] = 125;
		arr1 [4][0][0] = 130;
		arr1 [4][0][1] = 135;
		arr1 [4][1][0] = 140;
		arr1 [4][1][1] = 145;
		arr1 [4][2][0] = 150;
		arr1 [4][2][1] = 155;
		
		
		
		System.out.println(arr1[4][2][0]);
		System.out.println(arr1[3][2][0]);
		
					
		
			
			
		int nums [][][][]= new int [2][2][2][2];
		
		nums [0][0][0][0] = 2;
		nums [0][0][0][1] = 4;
		nums [0][0][1][0] = 6;
		nums [0][0][1][1] = 8;
		nums [0][1][0][0] = 10;
		nums [0][1][0][1] = 12;
		nums [0][1][1][0] = 14;
		nums [0][1][1][1] = 16;
		nums [1][0][0][0] = 18;
		nums [1][0][0][1] = 20;
		nums [1][0][1][0] = 22;
		nums [1][0][1][1] = 24;
		nums [1][1][0][0] = 26;
		nums [1][1][0][1] = 28;
		nums [1][1][1][0] = 30;
		nums [1][1][1][1] = 32;
		
		
		
		
		System.out.println("-------------------------");
		// User name and Password for 10 persons
		
		String userpass [][] = {{"User1", "Pass1"}, 
								{"User2", "Pass2"},
								{"User3", "Pass3"},
								{"User4", "Pass4"},
								{"User5", "Pass5"},
								{"User6", "Pass6"},
								{"User7", "Pass7"},
								{"User8", "Pass8"},
								{"User9", "Pass9"},
								{"User10","Pass10"}};
		
		for (int i = 0 ; i < userpass.length ; i++) { // This loop will go through the entire rows in the array
			
			for (int j = 0 ; j < userpass[i].length ; j++) { // This loop will go through the entire columns
				System.out.print(userpass[i][j] + " ");
				
			}
			System.out.println();
		}
	
		
		int [][] numbers5 = {{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16},
							{17,18,19,20},
							{21,22,23,24},
							{25,26,27,28}};
		System.out.println("----------------------");
		
		System.out.println(numbers5.length); // length of the array
		
		System.out.println("----------------------");
		
		for (int i = 0 ; i < numbers5.length ; i++) {  // this will rung through the number of rows
		for (int j = 0 ; j < numbers5[i].length ; j++) { // this will rung through the number of columns 
			System.out.print(numbers5[i][j] + " "); // This will print the results of both rows and the columns
		}
		System.out.println(); // This will go to the next line after going through each row
		}

		
		
	
		
	}

}