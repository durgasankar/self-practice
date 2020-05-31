package DvdoOOP2.ChallengeTheRoom;

public class MainClass {
	public static void main(String[] args) {
		
		TV tv = new TV(51);
		GuestRoom guestroom = new GuestRoom(false);
		guestroom.isChildAllowed();
		tv.watchtv();
	}

}
