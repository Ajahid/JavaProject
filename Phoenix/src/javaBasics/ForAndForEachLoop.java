package javaBasics;

public class ForAndForEachLoop {

	public static void main(String[] args) {
	
	
		int house [][][] = new int [7][5][5];
	
		int x2 = 1;
		
		
		for (int i = 0 ; i < house.length ; i++) {
			for (int j = 0 ; j < house[i].length ; j++) {
				for (int k = 0 ; k < house[i][j].length ; k++) {
					
					house[i][j][k] = x2++;
				}
			}
		}
				for (int [][] rows : house) {
					for (int [] rows1 : rows) {
						for (int cells : rows1) {
							System.out.print(cells + "\t");
						}
						System.out.println();
					}
				}
		
				System.out.println("-------------------------------");
		
		
		int table [][] = new int [7][4];
		
		int x = 1;
		
		
		for (int i = 0 ; i < table.length ; i++) {
			for (int j = 0 ; j < table[i].length ; j++) {
				 
				table[i][j] = x++;
				}
			
				}
		for (int[] row : table) {
			for (int cell : row) {
				
				System.out.print(cell + "\t");
				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");

		int office [][][][] = new int [6][5][4][4];
		
		
		int x3 = 1;
		
		for (int i = 0 ; i < office.length ; i++) {
			for(int j = 0 ; j < office[i].length ; j++){
				for (int k = 0 ; k < office[i][j].length ; k++) {
					for (int l = 0 ; l < office[i][j][k].length ; l++) {
						
						office[i][j][k][l] = x++;
						}
					}
				}
				}
					
		for (int [][][] rows : office) {
			for (int [][] rows1 : rows) {
				for (int [] rows2 : rows1) {
					for (int cell : rows2) {
						System.out.print(cell + "\t");
					}
					System.out.println();
				}
			}
		}
		
		
		System.out.println("------------------------");
		
		
		int jobs [][] = new int [8][6];
		
		
		int x4 = 1;
		
		for (int i = 0 ; i < jobs.length ; i++) {
			
			for (int j = 0 ; j < jobs[i].length ; j++) {
				
				jobs [i][j] = x4++;
				
			}
			
		}
		
		for (int [] rows : jobs) {
			for (int cells : rows) {
				System.out.print(cells + "\t");
			}
			System.out.println();
		}
		
		
		int nums [] = new int [10];
		int sum = 0;
		
		nums[0] = 1;
		nums[1] = 2;
		
		
		System.out.println("------------------------");
		
		for (int i = 1 ; i < nums.length-1 ; i++) {
							
			sum += nums[i];
			nums[i+1] = sum;
			System.out.println(nums[i]);
		}
		
		System.out.println("------------------------");
		
		int num1 [] = new int [10];
		
				
		num1 [0] = 0;
		num1 [1] = 1;

		for (int i = 2 ; i < num1.length ; i++) {
			num1[i] = num1[i-1] + num1[i-2];
			
			System.out.println(num1[i]);
		}
		
		
		System.out.println("--------------------");
		
		int temp [] = new int [15];
		
		int sumx = 0;
		
		temp[0] = 1;
		temp[1] = 2;
		
	
		
		for (int i = 0 ; i < temp.length-1 ; i++) {
			
			sumx += temp[i];
			temp[i+1] = sumx;
			
			System.out.println(temp[i]);
		}
		System.out.println("====================");
		
		int range = 22;
		int num2 [] = new int [range];
		
		num2 [0] = 0;
		num2 [1] = 1;
		
		
		for (int i = 2 ; i < num2.length ; i++) {
			
			num2[i] = num2[i - 1] + num2[i - 2];
			
			System.out.println(num2[i]);
		}
		
		System.out.println("=======================");
		
		int sum3 [] = new int [15];
		
		sum = 0;
		
		sum3 [0] = 1;
		sum3 [1] = 2;
		
		
		for (int i = 0 ; i < sum3.length-1 ; i++) {
			sum += sum3[i];
			sum3[i+1] = sum;
			
			System.out.println(sum3[i]);
			
		}
		
		
		int totalnumbers [] = {121,45,779,52,67,31,2,8,37,9724,66};
		
		
		// sum
		// count
		// min
		// max
		// avg
		
		int sumn = 0;
		int count = totalnumbers.length;
		int min = totalnumbers[0];
		int max = totalnumbers[0];
		int avg = 0;
		
		
		for (int i = 0 ; i < totalnumbers.length ; i ++) {
			
			// To find sum
			
			sumn = sumn + totalnumbers[i];
			
			if (totalnumbers[i] < min) {
				
			// To find min
				
				min = totalnumbers[i];
			} else if (totalnumbers[i] > max) {
					
			// To find max
					
					max = totalnumbers[i];
			
			}
			}
			avg = sum/count;
			
			System.out.println("===================================");
			
			System.out.println("Count: " +count);
			System.out.println("Sum: " +sumn);
			System.out.println("Min: " +min);
			System.out.println("Max: " +max);
			System.out.println("AVG: "+ avg);
			
			
		
			int [] data = {13,15,795,697,12};
			
			for (int arr: data) {
				System.out.println(arr);
			}
			
			System.out.println("--------------------------");
			
			int data1 [] = {15,664,48,93,711,258,96,47,213,74};
		
			for (int num: data1) {
				System.out.println(num);
			}
			
			System.out.println("--------------------------");
			
		String [] Persons= {"data1", "data2", "data3", "data4", "data5"};
		
		for (String STR: Persons) {
			System.out.println(STR);
			
			System.out.println("--------------------------");
			
			int data3 [] = {15,89,45,987,25};
			
			for (int i = 0 ; i < data3.length ; i++) {
				
				System.out.println(data3[i]);
			}
		}
		System.out.println("--------------------------");
		
		int num3 = 1;
		
		while (num3 <= 10) {
			System.out.println(num3++);
		}
		
		System.out.println("--------------------------");
		
		int x5 = 10;
		
		do {
			System.out.println(x5++);
		} while (x5 < 9 && x5 <= 25 );
		
		System.out.println("--------------------------");
		
		for (int i = 7; i < 18; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 9; i <=15 ; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 5; i >=-5 ; i-- ) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		for (char c = 'a'; c <= 'd' ; c++) {
			System.out.println(c);
		}
		
		int array1 [] = new int [5];
		
		array1 [0] = 5;
		array1 [1] = 10;
		
		System.out.println("--------------------------");
		
		System.out.println(array1[1]);
		
		
		System.out.println("--------------------------");
		
		System.out.println(array1[3]);
		
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(array1[i]);	
		}
		
		System.out.println("--------------------------");
		
		System.out.println(array1.length);
		
		
		System.out.println(array1.length-4);
		
		// In class Practice
		
		// its going take an array of numbers
				// it will give us the following info
				// count
				// sum of all the numbers in the array
				// min
				// max
				// avg 
		
		
		int numss [] = {123,2,96,774,1,6,792,4781,3,10};
		
		int count1 = numss.length;
		int sums = 0;
		int min1 = numss[0];
		int max1 = numss[0];
		int avg1 = 0;
		
		
		
		for (int i = 0 ; i < numss.length ; i++) {
		sums = sums + numss[i];
		
		if (numss[i] < min1) {
			min1 = numss[i];
		} else if (numss [i] > max1) {
			max1 = numss[i];
		}
		
		avg1 = sums/count1;
		
	
		}
		
		System.out.println("-------------------------");
		System.out.println("Count: "+ count1);
		System.out.println("Sum: "+ sums);
		System.out.println("Min: "+ min1);
		System.out.println("Max: "+ max1);
		System.out.println("AVG: "+ avg1);
		
		
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
		
		
		for (int i = 0 ; i < userpass.length ; i++) {
			for (int j = 0; j < userpass[i].length ; j++) {
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
		
		System.out.println(numbers5.length); 
		
		System.out.println("----------------------");
		
		for (int i = 0 ; i < numbers5.length ; i++) {  
		for (int j = 0 ; j < numbers5[i].length ; j++) { // this will rung through the number of columns 
			System.out.print(numbers5[i][j] + " "); // This will print the results of both rows and the columns
		}
		System.out.println(); // This will go to the next line after going through each row
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}

}
