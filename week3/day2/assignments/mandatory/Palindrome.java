package week3.day2.assignments.mandatory;

public class Palindrome {
	// Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam"
	 * 
	 * b) Declare another String rev value as ""
	 * 
	 * c) Iterate over the String in reverse order
	 * 
	 * d) Add the char into rev
	 * 
	 * e) Compare the original String with the reversed String, if it is same then
	 * print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */

	public static void main(String[] args) {
		String str = "MADAM", rev = "";
		char ch;

		System.out.println("Original word: " + str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			rev = ch + rev; // adds each character in front of the existing string
		}
		rev = rev.toLowerCase();
		System.out.println("Reversed word: " + rev);
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("The given word is a palindrome.");

		} else {
			System.out.println("The given word is a palindrome.");
		}
		String str1 = "GEEKS", rev1 = "";
		char ch1;
		System.out.println("Original word: " + str1);
		for (int j = 0; j < str1.length(); j++) {
			ch1 = str1.charAt(j); // extracts each character
			rev1 = ch1 + rev1; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + rev1);
		if (str1.equalsIgnoreCase(rev1)) {
			System.out.println("The given word is a palindrome.");

		} else {
			System.out.println("The given word is not a palindrome.");
		}
	}
}