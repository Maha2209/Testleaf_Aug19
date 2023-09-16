/*
 * Multi level Inheritance
 */
package week3.day1.LearnInheritance;

public class Audi extends Car {

	public void sunRoof() {
		System.out.println("sunRoof from Audi");

	}

	public static void main(String[] args) {
		Audi au = new Audi();
		au.sunRoof();
		au.applyGear();
		au.soundHorn();
		au.applyBrake();
	}
}
