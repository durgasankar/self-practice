package DvdoOOP;

public class Human extends Animal{
	
	private int legs;
	private boolean brain;

	public Human(String name, int age, int weight, int legs, boolean brain) {
		super(name, age, "Homo Sapience", weight);
		this.legs = legs;
		this.brain = brain;
	}
	
	private void chew() {
		System.out.println("Human eat food by chewing");
	}
	
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("Human eat food to get strength");
		chew();
		
	}
	
	
	public int getLegs(int legs) {// use of this and super keyword in one method 
		this.legs = legs;
		super.eat();//why getting different o/p while using super.eat and only eat ?
		eat();
		return legs;
	}
	
	
	
	public boolean getBrain() {
		return brain;
	}
	
}
