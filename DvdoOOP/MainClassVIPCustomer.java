package DvdoOOP;

public class MainClassVIPCustomer {

	public static void main(String[] args) {
		
		P3VIPCustomer raja = new P3VIPCustomer();
		System.out.println(raja.getName());
		P3VIPCustomer ambu = new P3VIPCustomer("ambu",5000);
		System.out.println(ambu.getName());
		P3VIPCustomer satya = new P3VIPCustomer("satya",15000,"satya@gmail.com");
		System.out.println(satya.getName());
	}

}
