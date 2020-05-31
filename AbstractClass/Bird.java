package AbstractClass;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		
	}
	
	@Override
	public void eat() {
		System.out.println(getName()+" is eating vegitables");
	}

	@Override
	public void breathe() {
		System.out.println("different type of breathe in breathe out");
	}



}
