package week3.day2.assign;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student details using without args");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student details using with 1 arg(INT)");
		System.out.println("Student id " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student details using with 2 arg(INT,STRING)");
		System.out.println("Student id " + id);
		System.out.println("Student name " + name);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student details using with 2 arg(STRING,STRING)");
		System.out.println("Student email " + email);
		System.out.println("Student phoneNumber " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Students stu =new Students();
		stu.getStudentInfo();
		stu.getStudentInfo(123456);
		stu.getStudentInfo(123456,"Maha");
		stu.getStudentInfo("abc@gmail.com", "1234567890");
	}
}
