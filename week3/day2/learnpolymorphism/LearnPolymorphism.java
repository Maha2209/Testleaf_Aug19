package week3.day2.learnpolymorphism;

public class LearnPolymorphism {
	public void add() {
		int a = 90;
		int b = 50;
		System.out.println("Polymorphism: method name is same with out args " +(a + b));

	}

	public void add(int a, int b, int c) {
		System.out.println("Polymorphism: method name is same with 3 args " +(a + b + c));
	}

	public void add(float a, int b, int c) {
		System.out.println("Polymorphism: method name is same with out args "+(a + b + c));
	}

	public void add(float a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		LearnPolymorphism lp = new LearnPolymorphism();
		lp.add();
		lp.add(2, 5, 9);
		lp.add(5.5f, 8, 9);
		lp.add(7.5f, 6, 7, 6);

	}
}
