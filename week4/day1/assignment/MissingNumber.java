package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	/*
	 * Problem
	 * 
	 * There will be running number between 1 to 10 One of the unique number will be
	 * missing Find the missing number
	 * 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
	 * order c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */

	public static void main(String[] args) {
		int[] runno = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };

		Set<Integer> unno = new TreeSet<>();

		for (Integer integer : runno) {
			unno.add(integer);

		}

		List<Integer> nextno = new ArrayList<>(unno);
		for (int i = 0; i < runno.length; i++) {

			if (nextno.get(i) != i + 1) {

				System.out.println("missing no is " + (i + 1));

				break;
			}

		}

	}

}