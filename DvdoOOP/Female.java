package DvdoOOP;

public class Female extends Human {
	
	private char gender;
	private boolean shopping;

	public Female(String name, int age, int weight, int legs, boolean brain, char gender, boolean shoping) {
		super(name, age, weight, legs, brain);
		this.gender = gender;
		this.shopping = shoping;
		
	}
	public char getGender() {
		return gender;
	}
	public boolean getShopping() {
		return shopping;
	}
	
	
	public void longChew() {
		System.out.println("Female takes long time to eat");
	}
	
	
	@Override
	public void eat() {
		super.eat();
		longChew();
		
	}
	

}
