package DvdoOOP2.ProjectBurger;

public class CultFitBurger extends Burger{
	
	private String cultFitAddition1Name;
	private double cultFitAddition1Price;
	
	private String cultFitAddition2Name;
	private double cultFitAddition2Price;

	public CultFitBurger(String name, double price) {
		super(name, "Chicken", price, "Wheat Low Calories");
		
	}
	public void addHealthCultFitAddition1(String name, double price) {
		this.cultFitAddition1Name = name;
		this.cultFitAddition1Price = price;
	}
	public void addHealthCultFitAddition2(String name, double price) {
		this.cultFitAddition2Name = name;
		this.cultFitAddition2Price = price;
	}
	@Override
	public double totalPriceWithAdditionBurger() {
		
		double burgerPrice = super.totalPriceWithAdditionBurger();
		if(this.cultFitAddition1Name != null) {
			burgerPrice += this.cultFitAddition1Price;
			System.out.println("You added : "+this.cultFitAddition1Name+" AdditionalCharges : "
								+this.cultFitAddition1Price);
		}
		if(this.cultFitAddition2Name != null) {
			burgerPrice += this.cultFitAddition2Price;
			System.out.println("You added : "+this.cultFitAddition2Name+" AdditionalCharges : "
								+this.cultFitAddition2Price);
		}
		return burgerPrice;
	}
	

}
