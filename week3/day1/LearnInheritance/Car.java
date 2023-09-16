/*
 * Single Level Inheritance
 */

package week3.day1.LearnInheritance;

public class Car extends Vehicle {
	public void applyGear() {
		System.out.println("applyGearfrom car");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.applyBrake();
		car.soundHorn();
		car.applyGear();
	}

}

/*
 * error scenario public class Car { public void applyGear() {
 * System.out.println("applyGear"); } public static void main(String[] args) {
 * Car car = new Car(); car.applyBrake(); car.soundHorn();-> no relationship
 * Vehicle car.applyBrake();-> no relationship vehicle }
 * 
 */
