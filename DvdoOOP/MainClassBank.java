package DvdoOOP;

public class MainClassBank {
	public static void main(String[] args) {
		
		P2BankAccount acc = new P2BankAccount(1541018522,0.0,"Durgasankar Mishra"
							,"durgasankar.raja500@gmail.com",750414744);
		acc.moneyDeposit(1500);
		acc.moneyWithdraw(1600);
		//System.out.println(acc.getBalance());
			
		
	}

}
