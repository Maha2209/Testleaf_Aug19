package week1.assign;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println("Fibbinocci Series");
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < 11; i++) {
			sum = firstNum + secNum;

			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);

		}
	}

}
