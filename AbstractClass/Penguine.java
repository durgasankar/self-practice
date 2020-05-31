package AbstractClass;

public class Penguine extends Bird implements Fly{

	public Penguine(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(getName()+" cant fly but can swim");
		
	}
	

}
