package DvdoOOP2.Polymorphism;

class Car{
	private boolean engline;
	private int cylinders;
	private String name;
	private int wheel;
	
	public Car(int cylinders, String name) {
		this.engline = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheel = 4;
		
		
	}
	public String startEngine() {
		return "Car -> start engine";
	}
	public String brakeEngine() {
		return "Car -> brake engine";
	}
	public String accelarateEngine() {
		return "Car -> accelarate engine";
	}
	
}

class Lamborgini extends Car{

	public Lamborgini(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Lamborgini -> start engine";
	}

	@Override
	public String brakeEngine() {
		return "Lamborgini -> brake engine";
	}

	@Override
	public String accelarateEngine() {
		return "Lamborgini -> accelarate engine";	
	}
		
}
class Ford extends Car{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Ford -> start engine";
	}

	@Override
	public String brakeEngine() {
		return "Ford -> brake engine";
	}

	@Override
	public String accelarateEngine() {
		return "Ford -> accelarate engine";	
	}
		
}
public class CarMainClass {
	public static void main(String[] args) {
		
		Car car = new Car(4,"Raja");
		System.out.println(car.startEngine());
		System.out.println(car.accelarateEngine());
		System.out.println(car.brakeEngine());
		
		Lamborgini lambo = new Lamborgini(6,"Raja");
		System.out.println(lambo.startEngine());
		System.out.println(lambo.accelarateEngine());
		System.out.println(lambo.brakeEngine());
		
		Ford ford = new Ford(8,"Raja");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelarateEngine());
		System.out.println(ford.brakeEngine());
		

	}
	
}
