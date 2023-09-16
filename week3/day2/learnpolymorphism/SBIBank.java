package week3.day2.learnpolymorphism;

public class SBIBank implements RBI {

	// SBI Bank own method
	public void goldLoan() {
		System.out.println("5% interest rate ");
	}

	@Override
	public void knowYourCustomer() {
		// TODO Auto-generated method stub
		System.out.println("AADHAR");

	}

	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		System.out.println("50000");
	}

}
