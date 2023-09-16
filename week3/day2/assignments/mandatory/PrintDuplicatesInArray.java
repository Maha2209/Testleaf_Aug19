package week3.day2.assignments.mandatory;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// get the length of the array
		// declare an int variable named count

		// iterate from 0 to the array length-1 (outer loop starts here)

		// assign 0 to count

		// iterate from i to the length of the array by adding 1 to it (inner loop
		// starts here)

		// compare both the loop variables & check they're equal

		// print the matching value
		// to print all the items of the array
		System.out.println("To print set of array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]= ");
			System.out.print(arr[i] + ", ");

		}

		System.out.println();
		// iterate through an outer for loop
		for (int i = 0; i < arr.length; i++) {
			// iterate through an inner for loop
			for (int j = i + 1; j < arr.length; j++) {
				// compare the varibales
				if (arr[i] == arr[j]) {
					// if it is equal
					System.out.println("Duplicate number is: " + arr[i]);

				}

			}
		}

	}
}
