package DvdoOOP2.ChallengeTheRoom;

public class MainClassRoom {
	public static void main(String[] args) {
		
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");
		
		Celling celling = new Celling(10,"White");
		
		Bed bed = new Bed("Indian",2,3,"Designer");
		
		Lamp lamp = new Lamp("Classic",false,75);
		
		BedRoom room = new BedRoom("Raja",wall1,wall2,wall3,wall4,celling,bed,lamp);
		room.makeBed();
		room.getLamp().turnOn();
	}

}
