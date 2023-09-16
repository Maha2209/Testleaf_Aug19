package week1.assign;

public class NegativetoPostive {

	public static void main(String[] args) {
		int number = 0;
		if (number < 0) {
			System.out.println(number + " it is a Negative Number.");
			number = number * -1;
			System.out.println("We converted Negative number into Postive number " + number);

		} else if (number > 0) {
			System.out.println("it is already a postive number " + number);

		}
		else {
			System.out.println("it is ZERO");
		}

	}

}

/*
 *
 * Assignments( Java Basics)
Week1 Day1
=======================
1 Problem statement: Convert a negative number to positive number
---------------------------------------------------------------
Pseudocode:
-----------
1. Initialize an integer with a negative number
   like, int number = -40;
2. Check if the number is a negative number 
   Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive numer

4. Print as below
        "The number -40 is converted to 40"


 * */

