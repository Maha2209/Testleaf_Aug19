package week4.day1.assignment;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String cname = "PayPal India";
		char[] charcname = cname.toCharArray();

		Set<Character> charsetcname = new LinkedHashSet<>();
		for (int i = 0; i < charcname.length; i++) {

			charsetcname.add(charcname[i]);

		}
		System.out.println("Before removing space: " + cname);
		String output = "";
		for (Character each : charsetcname) {
			output = output.replaceAll(" ", "") + each;

		}
//Print the Set values which is having unique chars  without the comma	
		System.out.println("After removing space: " + output);

	}
}