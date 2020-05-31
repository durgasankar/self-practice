package DvdoOOP2.AutoboxingAndUnboxing;

public class BankApplicationMainClass {
	public static void main(String[] args) {
		// You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
		
		Bank bank = new Bank("SBI");
		bank.addBranch("Bls");
		bank.addCustomer("Bls", "Raja", 0.0);
		bank.addCustomer("Bls", "Hari", 0.0);
		bank.addCustomer("Bls", "Kajal", 0.0);
		bank.addCustomerTransaction("Bls", "Raja", 10.20);
		bank.addCustomerTransaction("Bls", "Raja", 1250.20);
		bank.listCustomers("Bls", false);
		
		bank.addBranch("BBSR");
		bank.addCustomer("BBSR", "Shyam", 0.0);
		bank.addCustomer("BBSR", "Dhoni", 0.0);
		bank.addCustomerTransaction("BBSR", "Dhoni", 110.80);
		bank.listCustomers("BBSR", true);
		
		bank.addBranch("SORO");
		bank.addCustomerTransaction("Bls", "Raja", 10.20);
		
		if(!bank.addCustomer("BBSR", "Dhoni", 110.80)) {
			System.out.println("Dhoni already exist");
		}
		
		if(!bank.addBranch("SORO")) {
			System.out.println("Soro branch already exist");
		}else
			System.out.println("Soro branch doesnot exist");
	}
}
