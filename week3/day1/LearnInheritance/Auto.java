/*
 * Single Level Inheritance
 */
package week3.day1.LearnInheritance;

public class Auto extends Vehicle {
	public void applyMeter() {
		System.out.println("Meter appliedfrom auto");
	}

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.applyBrake();
		auto.soundHorn();
		auto.applyMeter();
	}

}
