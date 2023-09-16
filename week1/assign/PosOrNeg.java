package week1.assign;

public class PosOrNeg {
	public static void main(String[] args) {
		int Number = 0;
		if (Number > 0) {
			System.out.println("The Number:" + Number + " is Postive.");
		} else if (Number < 0) {
			System.out.println("The Number:" + Number + " is Negative.");

		}else {
			System.out.println("The Number:" + Number + " is neither Postive nor Negative.");
		}
	}
}

/*
 * 2 Problem statement: Check if the number is positive or negative
---------------------------------------------------------------
Pseudocode:
----------
 1. Initialize a number, say, int number= 35;
 2. If a number is positive, print "The number is positive"
    If a number is negative, print "The number is negative"
    If it nether negative nor positive, print as "The number is neither positive nor negative"
 * 
 * 
 */
