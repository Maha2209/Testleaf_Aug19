package week4.day1;


import java.util.ArrayList;

public class LearnList {
	public static void main(String[] args) {
		// Declare the List
		// List name<genreic{Type}> list name = new implementationclass<>();

		ArrayList<String> mentors = new ArrayList<String>();
		// add mentors name in the list
		mentors.add("Subraja");
		mentors.add("Kathir");
		mentors.add("Vidhya");
		mentors.add("Ragu");

		mentors.add(2, "Jagadeesh");
		mentors.add("Aravind");

		System.out.println(mentors);

		// size of the list
		int size = mentors.size();
		System.out.println(size);
		// to remove the item from a list
		mentors.remove(3);
		System.out.println(mentors);

		// to retrieve a particular item from the list.
		String retrieve = mentors.get(4);
		System.out.println(retrieve);

		// To clear the list
		mentors.clear();
		System.out.println(mentors);
		// To Check whether list is empty
		System.out.println(mentors.isEmpty());

	}
}
