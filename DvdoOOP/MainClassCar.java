package DvdoOOP;

public class MainClassCar {

	public static void main(String[] args) {
		
		P1Car car = new P1Car();
		System.out.println(car.getModel());//o/p=null
		car.setModel("ford");
		System.out.println(car.getModel());//o/p= model name
		car.setModel("Raja");
		System.out.println(car.getModel());

	}

}
