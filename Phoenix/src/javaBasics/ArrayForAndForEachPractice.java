package javaBasics;

import java.util.Arrays;

public class ArrayForAndForEachPractice {

	public static void main(String[] args) {

		// assign value like below table, write code and print in the console

		// 1 0 0
		// 0 2 0
		// 0 0 3
		// 0 4 0
		// 5 0 0

		int[][] nums = new int[5][3];

		nums[0][0] = 1;
		nums[1][1] = 2;
		nums[2][2] = 3;
		nums[3][1] = 4;
		nums[4][0] = 5;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {

				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}

		// draw 4 dimension array
		// assign value from 1, 2, 3.....150 using for each loop

		System.out.println("================================");

		int number[][][][] = new int[2][3][5][5];

		int x = 1;

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++)
				for (int k = 0; k < number[i][j].length; k++) {
					for (int m = 0; m < number[i][j][k].length; m++) {
						number[i][j][k][m] = x++;
						System.out.print(number[i][j][k][m] + "\t");
					}
					System.out.println();
				}
		}

		int numbers[] = { 23, 2, 897, 36, 47, 100, 84, 1000, 14, 13 };

		int count = numbers.length;
		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];
		int avg = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];

			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}
			avg = sum / count;
		}

		System.out.println("COUNT: " + count);
		System.out.println("SUM: " + sum);
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
		System.out.println("AVG: " + avg);

		System.out.println("-------------------");

		// Fibonacci

		int fibnumbers[] = new int[10];

		fibnumbers[0] = 0;
		fibnumbers[1] = 1;

		for (int i = 2; i < fibnumbers.length; i++) {
			fibnumbers[i] = fibnumbers[i - 1] + fibnumbers[i - 2];

			System.out.println(fibnumbers[i]);
		}

		System.out.println("-------------------");

		int nums2[] = { 18, 63, 79, 54, 31, 67, 148, 10 };

		System.out.println(nums2.length);

		System.out.println("-------------------");

		int sum4 = 0;

		for (int i = 0; i < nums2.length - 1; i++) {

			sum4 += sum4 + nums2[i];

			nums2[i + 1] = sum4;

			System.out.println(nums2[i]);

		}

		System.out.println("*****************************");

		// .equal formula with Array

		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4 };

		boolean status = Arrays.equals(a1, a2);

		if (status == true) {
			System.out.println("a1 & a2 Arrays are equal");

		} else {
			System.out.println("a1 & a2 Arrays are not equal ");

		}

	}

}
