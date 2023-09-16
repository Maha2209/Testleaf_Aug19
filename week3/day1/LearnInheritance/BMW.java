/*
 * Multi level Inheritance
 */
package week3.day1.LearnInheritance;

public class BMW extends Car {

	public void airBag() {
		System.out.println("airBag from BMW");

	}

	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.airBag();
		bm.applyGear();
		bm.soundHorn();
		bm.applyBrake();
	}
}
