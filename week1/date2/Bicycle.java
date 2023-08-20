package week1.date2;

public class Bicycle {
//accessmodifier returntype methodname inputargument
	public int getCycleCount() {
		return 2;
	}

	public String getCycleColor(String brandName, String color) {
		return brandName + " " + color;

	}

	public int addTwoNumbers(int num1, int num2) {
		return num1 + num2;

	}

	public void getOtp() {
		System.out.println("No");

	}

	private void getPrivete() {

		System.out.println("prvate access");
	}
	

	public static void main(String[] args) {
		Bicycle bc = new Bicycle();
		// Classname objectname= new Classname;

		System.out.println(bc.getCycleCount());
		System.out.println(bc.getCycleColor("Honda", "Red"));
		System.out.println(bc.getCycleColor("", "Red"));
		System.out.println(bc.getCycleColor("Honda", ""));
		System.out.println(bc.getCycleColor("Honda", "Red"));
		bc.getOtp();
		bc.getPrivete();
		System.out.println(bc.addTwoNumbers(9, 9));

	}
}
