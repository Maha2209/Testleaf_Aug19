package week3.day2.assign;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit() AxisBank");
	}
	public static void main(String[] args) {
		System.out.println("calling method using AxisBank Object ");
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
		System.out.println("calling method using BankInfo Object ");
		BankInfo bi=new BankInfo();
		bi.saving();
		bi.deposit();
		bi.fixed();
		
	}
	
}
