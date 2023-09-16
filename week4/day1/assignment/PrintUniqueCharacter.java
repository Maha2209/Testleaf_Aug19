package week4.day1.assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String str = "babu";
		char[] ch = str.toCharArray();
		char dup=' ';
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < ch.length; i++) {
			if (set.add(ch[i])== false) {
				System.out.println("Duplicate character is : "+ ch[i]);
				dup = ch[i];
			}
		}		
		set.remove(dup);
		System.out.println(set);	
	}
}