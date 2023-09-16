package week3.day2.learnpolymorphism;

public class LearnString {
	public static void main(String[] args) {
		// literal declaration
		String name = "TestLeaf123$";
		String name1 = "TestLeaf123$";
		String name2 = "TESTLEAF123$";

		// String name= 'TestLeaf123$';-> wrong one with single quotes

		// instantaniation
		String str = new String("Test Leaf");

		// To compare new String values:.equals[]
		// Difference between == & .equals()
		// == it will check only for the references and not the content inside of the
		// string
		// .equals will compare the content of 2 strings.
		System.out.println("String Name: " + name);
		System.out.println("String Name1: " + name1);
		System.out.println("String Name2: " + name2);
		System.out.println("String Str: " + str);
		// check the memory id's, so result will be false
		System.out.println("check whether Name and Str are same using == ? " + (name == str));
		// check the content of the string.
		System.out.println("check whether Name and Str are same using .equals? " + name.equals(str));
		System.out.println("check whether Name and Name1 are same using .equals? " + name.equals(name1));
		System.out.println("check whether Name and Name1 are same using == ? " + (name == str));

		// To find the length of a string
		// int len=name.length();
		System.out.println("Length of the Name string: " + name.length());

		// To compare thwo strings ignore casesensitiviy
		System.out.println("To compare two Name1 and Name 2 strings without casesensitiviy using equalsIgnoreCase: "
				+ name1.equalsIgnoreCase(name2));

		// To check whetehr the char are available in the string
		System.out.println("To check whether the given char(Test) are available in the Name1(string) using contains: "
				+ name.contains("Test"));
		// To Convert Lower case
		System.out.println("To Convert Lower case in the Name2(string) using lowercase: " + name1.toLowerCase());

		// To Convert upper case
		System.out.println("To Convert Lower case in the Str(string) using uppercse: " + str.toUpperCase());

		// toCharArry-> each of the char in the string will store in array
		//char[] charArray = name.toCharArray();

		str.substring(2);

		str.substring(2, 5);

		String replace = "Chennai 600058$";
		String replaceAll = replace.replaceAll("[^0-9]", ""); // we are trying to replace the numerics what ever present
																// in string
		System.out.println(replaceAll);

		String replaceAll2 = replace.replaceAll("[^a-zA-Z]", "").replaceAll("$", "%");
		System.out.println(replaceAll2);
		System.out.println(Integer.parseInt(replaceAll));

	}
}
