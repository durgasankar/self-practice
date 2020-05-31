package others;

public class Inheritance_Bicycle {
	
	public static void main(String[] args) {
		
		MountainBike bugati = new MountainBike(4,120,20);
		System.out.println(bugati.toString());
		System.out.println("\n\n");
		Bicycle hero = new Bicycle(3,100);
		System.out.println(hero.toString());
	}

}

class Bicycle
{
	
	protected int gear ;
	protected int speed;
	
	Bicycle(int gear , int speed)
	{
		this.gear=gear;
		this.speed= speed;
	}
	
	public void applyBreak(int decrement)
	{
		speed -= decrement;
	}
	
	public void speedUp(int increment)
	{
		speed +=increment;
	}
	
	public String toString()
	{
		return ("No of gears are : "+gear+"\n"+"Speed of the Bicycle is : "+speed);
	}
}

class MountainBike extends Bicycle
{
	protected int seatheight;
	
	MountainBike(int gear , int speed , int seatheight)
	{
		super(gear,speed);
		this.seatheight=seatheight;
	}
	public void setHeight(int newheight)
	{
		seatheight=newheight;
	}
	public String toString()
	{
		return(super.toString()+"\nSeat height of the bike : "+seatheight);
	}
	
	
}