/*
Reverse the String
==================
String  input=“TestLeaf";
Goal: To understand the String,loop
a)Convert the String to character array (use toCharArray)
b)Use for loop to iterate through each character (from end to go to the first)
c)Print the Characters continuously
*Hint  Use  system.out.print() 
*/

package week3.day2.learnpolymorphism;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String  input="TestLeaf";
		System.out.println("Before Reversal: " + input);
		System.out.print("After Reversal: ");
		char[] charArray = input.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
			
		}
		
	}

}
