package week3.day1.LearnInheritance;

public class Bajaj extends Auto {
	public void selfStart() {
		System.out.println("selfStart from Bajaj");
	}

	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		bj.selfStart();
		bj.applyMeter();
		bj.applyBrake();
		bj.soundHorn();

	}
}