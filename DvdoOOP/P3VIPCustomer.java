package DvdoOOP;

public class P3VIPCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	
	
	public P3VIPCustomer() {
		this("Default name",50000,"unkwnown@gamail.com");
	}
	public P3VIPCustomer(String name, double creditLimit) {
		this(name,creditLimit,"unkwnown@gamail.com");
	}
	public P3VIPCustomer(String name,double creditLimit,String email){
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
