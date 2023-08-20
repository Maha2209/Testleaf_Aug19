package week1.date2;

public class LearnContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				System.out.println("three");
			continue;
			}
			System.out.println(i);
		}
		System.out.println("out of for loop");
	}
}
