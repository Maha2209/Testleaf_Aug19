package week3.day1.LearnAbstraction;

public abstract class Reporter implements Browser {
	// abstract method of abstract class
	public abstract void takeSnap();

	// own implement method of abstract class
	public void startReporter() {
		System.out.println("Report Started");

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}
}
