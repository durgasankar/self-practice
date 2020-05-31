package InnerClass;

public class MainClassGearBox {
	public static void main(String[] args) {
		GearBox audi = new GearBox(6);
		audi.clutchOperation(true);
		System.out.println(audi.wheelSpeed(1000));
		audi.clutchOperation(false);
		System.out.println(audi.wheelSpeed(2000));
		audi.changeGear(2);
		System.out.println(audi.wheelSpeed(2000));
	}

}
