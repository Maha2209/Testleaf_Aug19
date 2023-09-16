package week4.day1.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1";
		 *
		 * Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then
		 * iterate the Array c) Create a empty Set d) Iterate the String array d.1) add
		 * each word into Set e) Print the Set values which is having unique words
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println(text);
		String[] text1 = text.split(" ");

		Set<String> set = new LinkedHashSet<>();

		for (int i = 0; i < text1.length; i++) {

			set.add(text1[i]);

		}

		System.out.println(set);
		List<String> list = new ArrayList<>(set);

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");

		}

	}

}
