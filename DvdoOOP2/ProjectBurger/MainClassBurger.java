package DvdoOOP2.ProjectBurger;

public class MainClassBurger {
	
	public static void main(String[] args) {
		
		Burger burger = new Burger("American", "Lamb", 100, "Wheat");
		//burger.totalPriceWithAdditionBurger();
		burger.addBurgerAddition1("Tomato",30);
		burger.addBurgerAddition2("Onion",50);
		burger.addBurgerAddition3("Chicken", 70);
		burger.addBurgerAddition4("Sause", 60);
		System.out.println("Total Amount to be paid : "+burger.totalPriceWithAdditionBurger());
		System.out.println();
		
		CultFitBurger cb = new CultFitBurger("Afgani",160);
		//cb.totalPriceWithAdditionBurger();
		cb.addHealthCultFitAddition1("Chicken", 60);
		cb.addHealthCultFitAddition2("Onion", 20);
		System.out.println("Total Amount to be paid : "+cb.totalPriceWithAdditionBurger());
		System.out.println();
		
		ComboBurger combo = new ComboBurger("Pakistani");
		//combo.totalPriceWithAdditionBurger();
		//combo.addBurgerAddition1("Return Money", 20);
		System.out.println("Total Amount to be paid : "+combo.totalPriceWithAdditionBurger());		
		
	}

}
