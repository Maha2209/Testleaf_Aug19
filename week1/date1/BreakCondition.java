package week1.date1;

public class BreakCondition {
	public static void main(String[] args) {
		String Browser = "chrome";

		switch (Browser) {
		case "chrome":
			System.out.println("open chrome browser");
			break;
		case "edge":
			System.out.println("open edge browser");
			break;
		case "firefox":
			System.out.println("open firefox browser");
			break;
		default:
			System.out.println("open IE browser");
			break;

		}
	}
}
