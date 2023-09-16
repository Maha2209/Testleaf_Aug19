package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesGoogle {
	public static void main(String[] args) {
		String Companyname = "Google";
		Companyname = Companyname.toLowerCase();

		char[] Companychar = Companyname.toCharArray();

		System.out.println(Companychar);

		Set<Character> unique = new LinkedHashSet<>();
		Set<Character> unique1 = new TreeSet<>();

		// to add items to a set

		for (int i = 0; i < Companychar.length; i++) {

			unique.add(Companychar[i]);

		}
		System.out.println("LinkedHashSet: Remove Duplicates " + unique);
		for (int i = 0; i < Companychar.length; i++) {
			unique1.add(Companychar[i]);

		}
		System.out.println("TreeSet : Remove Duplicates  " + unique1);
	}

}
