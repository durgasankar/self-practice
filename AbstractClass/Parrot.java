package AbstractClass;

public class Parrot extends Bird implements Fly {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName()+" is flying from branch to branch");
		
	}

	
	
	
}
