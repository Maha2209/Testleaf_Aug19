package week1.date2;

public class Calculator {

	private int addTwoNumbers(int num1, int num2) {
		return (num1 + num2);

	}

	public float mul(float num1, int num2) {
		return (num1 * num2);

	}
	public void sub() {
		System.out.println(9-8);
		
	}
public static void main(String[] args) {
	Calculator cl = new Calculator();
	System.out.println(cl.addTwoNumbers(5, 5));
}
}
