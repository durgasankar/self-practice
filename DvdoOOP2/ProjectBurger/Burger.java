package DvdoOOP2.ProjectBurger;

public class Burger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public Burger(String name, String meat, double price, String breadRollType) {
		
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	
	public void addBurgerAddition1(String name, double price) {
		this.addition1Price = price;
		this.addition1Name = name;
	}
	public void addBurgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}
	public void addBurgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}
	public void addBurgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}
	
	public double totalPriceWithAdditionBurger() {
		double burgerPrice = this.price;
		System.out.println("You choose : "+this.name+"\nMeat type : "+this.meat+"\nBrade of : "
							+this.breadRollType+ "\nBase Burger Price : "+this.price);
		if(this.addition1Name != null) {
			burgerPrice += this.addition1Price;
			System.out.println("You added : "+this.addition1Name+" AdditionalCharges : "+this.addition1Price);
		}
		if(this.addition2Name != null) {
			burgerPrice += this.addition2Price;
			System.out.println("You added : "+this.addition2Name+" AdditionalCharges : "+this.addition2Price);
		}
		if(this.addition3Name != null) {
			burgerPrice += this.addition3Price;
			System.out.println("You added : "+this.addition3Name+" AdditionalCharges : "+this.addition3Price);
		}
		if(this.addition4Name != null) {
			burgerPrice += this.addition4Price;
			System.out.println("You added : "+this.addition4Name+" AdditionalCharges : "+this.addition4Price);
		}
		
		return burgerPrice;
	}
	
	
	
	
	

}
