package DvdoOOP;

public class P2BankAccount {
	
	private long accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long mobileNumber;
	
	P2BankAccount(long accountNumber,double balance,String customerName,String email,long mobileNumber){
		System.out.println("Account Created Successfully");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public void moneyDeposit(double depositAmount) {
		this.balance += depositAmount; 
		System.out.println("Your deposit amount is : "+depositAmount+" Current baalnce is : "+this.balance);
	}
	
	public void moneyWithdraw(double withdrawAmount) {
		if(withdrawAmount > this.balance) {
			System.out.println("Insufficient balance. Current balance is : "+this.balance);		
		}
		else {
			this.balance -= withdrawAmount;
			System.out.println("Your withdrawl amount is : "+withdrawAmount+" Current balance is :"+this.balance);	
		}
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
