/*
 * vehicle -car 					simple inheritance
 * vehicle -car /vehicle -car		hierarchical inheritance
 *  * vehicle -car-BMW 				multilevel inheritance
 *  Multiple /multipath inheritance is not allowed in Java but allowed in interface
 */

package week3.day1.LearnInheritance;

public class Vehicle {
	public void applyBrake() {
		System.out.println("applyBrake from vehicle");
	}

	public void soundHorn() {
		System.out.println("soundHornfrom vehicle");
	}
}
