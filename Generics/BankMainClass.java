package Generics;

public class BankMainClass {
	public static void main(String[] args) {
		Bank raja = new Bank("Raja");
		raja.CalculateBalance();
		raja.depositAmount(5000);
		raja.depositAmount(1200);
		raja.CalculateBalance();
		raja.withdrawAmount(2500);
		raja.depositAmount(0);
		raja.depositAmount(-1000);
		raja.withdrawAmount(-1500);
		raja.CalculateBalance();
	}

}
