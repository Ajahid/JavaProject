package javaBasics;

public class MultipleDimensionArray {
public static void main(String[] args) {
	
	
	int [][] count = new int[7][4];
	
	count[0][0] = 1;
	count[0][1] = 2;
	count[0][2] = 3;
	count[0][3] = 4;
	count[1][0] = 5;
	count[1][1] = 6;
	count[1][2] = 7;
	count[1][3] = 8;
	count[2][0] = 9;
	count[2][1] = 10;
	count[2][2] = 11;
	count[2][3] = 12;
	count[3][0] = 13;
	count[3][1] = 14;
	count[3][2] = 15;
	count[3][3] = 16;
	count[4][0] = 17;
	count[4][1] = 18;
	count[4][2] = 19;
	count[4][3] = 20;
	count[5][0] = 21;
	count[5][1] = 22;
	count[5][2] = 23;
	count[5][3] = 24;
	count[6][0] = 25;
	count[6][1] = 26;
	count[6][2] = 27;
	count[6][3] = 28;
	
	
	for (int i = 0; i < count.length ; i++) {
		
		for (int j = 0; j < count[i].length ; j++) {
			
			System.out.print(count[i][j] + " ");
		}
			System.out.println();
	}
		
	
	
	
	
	
	
	
}
}
