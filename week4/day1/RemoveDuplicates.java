package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 3, 2, 4, 7, 6, 5 };
		// Outpu= {2.3.4.5.6.7}
		System.out.print("Test Data: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		Set<Integer> unique = new LinkedHashSet<>();
		Set<Integer> unique1 = new TreeSet<>();
		// to add items to a set
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);

		}
		System.out.println("LinkedHashSet: Remove Duplicates + sort " + unique);
		for (int i = 0; i < nums.length; i++) {
			unique1.add(nums[i]);

		}
		System.out.println("TreeSet : Remove Duplicates + wo sort: " + unique1);
	}
}
