package week1.assign;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = -32768;
	long chassisNumber = 922374807;
	boolean isPunctured = false;
	String bikeName = "Vespa";
	double runningKM = 12.56874;

	public static void main(String[] args) {
		TwoWheeler TW = new TwoWheeler();

		System.out.println("noOfWheels " + TW.noOfWheels);
		System.out.println("noOfMirrors " + TW.noOfMirrors);
		System.out.println("chassisNumber " + TW.chassisNumber);
		System.out.println("isPunctured " + TW.isPunctured);
		System.out.println("bikeName " + TW.bikeName);
		System.out.println("runningKM " + TW.runningKM);

	}
}
/*
Assignment 3
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.
*/