package week3.day2.learnpolymorphism;

public class AxisBankNanganallur extends AxisBank{
	public void knowYourCustomer() {
		// TODO Auto-generated method stub
		System.out.println("PANCARD");	
	}
 public static void main(String[] args) {
	AxisBankNanganallur ab =new AxisBankNanganallur();
	ab.knowYourCustomer();
	AxisBank ab1 =new AxisBank();
	ab1.knowYourCustomer();
}
}
