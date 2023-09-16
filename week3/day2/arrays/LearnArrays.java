package week3.day2.arrays;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {
		// type[] variable ={value};
		int[] scores = { 98, 78, 75, 52, 90 };

		// for length->always counts start from 1
		// for Index->always counts start from 0
		// to find the total Length of this array
		int len = scores.length;
		System.out.println("To find the total Length of this array: " + len);
		System.out.println();

		// to print all the items of the array
		System.out.println("To print all the items of the array: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("scores[" + i + "]= ");
			System.out.print(scores[i] + ", ");

		}

		System.out.println();

		// to retriec the single item of the array
		System.out.println();
		System.out.println("Second Data before sort: " + scores[2]);

		// TO SORT AN ARRAY
		Arrays.sort(scores);

		// to retriec the single item of the array
		System.out.println();
		System.out.println("Second Data after sort: " + scores[2]);

		// to print all the items of the array
		System.out.println();
		System.out.println("To print all the items of the array after sorting:");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("scores[" + i + "]= ");
			System.out.print(scores[i] + ", ");

		}

		System.out.println();

		System.out.println();
		System.out.println("To print all the items of the array in reversal order:");
		for (int i = scores.length - 1; i >= 0; i--) {
			System.out.print("scores[" + i + "]= ");
			System.out.print(scores[i] + ", ");

		}

		System.out.println();

		// To find the largest number of the array
		System.out.println();
		System.out.println("largest number of the array: " + scores[scores.length - 1]);
		System.out.println();
		// To find the least number of the array
		System.out.println("first number of the array: " + scores[0]);
		System.out.println();
		// to print all the items of the array in reversal order

		/*
		 * Error : It has only 0-4 l index If we say <= then it will search for 5 then
		 * it will throw error.
		 * 
		 * for (int i = 0; i <= scores.length; i++) { System.out.println(scores[i]);
		 * 
		 * 
		 * }
		 */
		// another way of creating array
		int[] marks = new int[6];
		marks[0] = 45;
		marks[1] = 55;
		marks[2] = 65;
		marks[3] = 45;
		marks[4] = 35;
		marks[5] = 35;

		// to print all the items of the array
		System.out.println("To print another set of array: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print("marks[" + i + "]= ");
			System.out.print(marks[i] + ", ");

		}

		System.out.println();
		// iterate through an outer for loop
		for (int i = 0; i < marks.length; i++) {
			// iterate through an inner for loop
			for (int j = i + 1; j < marks.length; j++) {
				// compare the varibales
				if (marks[i] == marks[j]) {
					// if it is equal
					System.out.println("Duplicate number is: " + marks[i]);

				}

			}
		}

	}
}
