package EDX;

import java.util.Calendar;

public class CarParking {
	
	//instance variables
	String make;
	String model;
	int year;
	boolean isNew=true;
	double miles;
	String owner;
	
	//2nd hand car
	public void sell(String newOwner) {
		
		owner = newOwner;
		if (isNew) {
			isNew = false;
		}
	}
	
	//we want to know whether the car is older than 10 year or not 
	public boolean isOld() {
		int thisYear= Calendar.getInstance().get(Calendar.YEAR);
		if (thisYear-year>10) {
			return true;
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		CarParking myCar = new CarParking();
		myCar.make = "Audi";
		myCar.model = "A4";
		myCar.year = 2010;
		myCar.isNew = true;
		myCar.miles = 15000.2;
		myCar.owner = "Durgasankar";
		
		boolean old = myCar.isOld();
		myCar.sell("r20jc134");
		
		System.out.println("My Car is owned by : "+myCar.owner);
		System.out.println("Is y car is older than 10 year : "+myCar.isOld());
	}


}
