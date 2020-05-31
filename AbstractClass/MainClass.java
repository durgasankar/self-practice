package AbstractClass;

public class MainClass {
	public static void main(String[] args) {
		Dog dog = new Dog("Ambu");
		dog.eat();
		dog.breathe();
		
		Parrot parrot = new Parrot("Pada");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguine penguine = new Penguine("Muduli");
		penguine.fly();
		penguine.breathe();
		penguine.eat();
	}

}
