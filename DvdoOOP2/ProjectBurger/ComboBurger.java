package DvdoOOP2.ProjectBurger;

public class ComboBurger extends Burger {

	public ComboBurger(String name) {
		super(name, "Perk", 250, "White Maida");
		super.addBurgerAddition1("Chips", 30);
		super.addBurgerAddition2("Aska 40", 20);
		
	}

	@Override
	public void addBurgerAddition1(String name, double price) {
		System.out.println("Add On is not allowed");
	}

	@Override
	public void addBurgerAddition2(String name, double price) {
		System.out.println("Add On is not allowed");	}

	@Override
	public void addBurgerAddition3(String name, double price) {
		System.out.println("Add On is not allowed");	}

	@Override
	public void addBurgerAddition4(String name, double price) {
		System.out.println("Add On is not allowed");	}
	
	

}
