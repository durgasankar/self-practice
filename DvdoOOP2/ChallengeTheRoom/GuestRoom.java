package DvdoOOP2.ChallengeTheRoom;

public class GuestRoom {
	private int table;
	private int windows;
	private int doors;
	private boolean guest;
	
	public GuestRoom(int table, int windows, int doors, boolean guest) {
		this.table = table;
		this.windows = windows;
		this.doors = doors;
		this.guest = guest;
	}
	public GuestRoom(boolean isChildAllowed) {
		this(1,2,1,isChildAllowed);
		this.guest = guest;
	}
	public void isChildAllowed() {
		//this.guest = guest;
		if(guest == true) {
			System.out.println("Children Not Allowed....");
		}else {
			System.out.println("Children are allowed");
		}
	}
	public void guestCame() {
		System.out.println(guest+"Guest presnt ");
	}
	

}
