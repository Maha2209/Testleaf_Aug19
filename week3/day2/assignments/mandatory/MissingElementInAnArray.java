package week3.day2.assignments.mandatory;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		System.out.println("To print all the items of the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]= " + arr[i] + ", ");

		}
		System.out.println();
		System.out.println();

		// TO SORT AN ARRAY
		Arrays.sort(arr);
		System.out.println("To print all the items of the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]= " + arr[i] + ", ");

		}

		System.out.println();
		System.out.println();

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			// check if the iterator variable is not equal to the array values respectively
			if (i != arr[i]) {

				// print the number
				System.out.println("The iterator variable " + i);
				System.out.println("The array value is " + arr[i]);

				// once printed break the iteration
				break;

			}

		}

	}
}
