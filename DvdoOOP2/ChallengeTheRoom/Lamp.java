package DvdoOOP2.ChallengeTheRoom;

public class Lamp {
	private String Style;
	private boolean battery;
	private int rating;
	
	public Lamp(String style, boolean battery, int rating) {
		
		Style = style;
		this.battery = battery;
		this.rating = rating;
	}
	public void turnOn() {
		System.out.println("Lamp -> turning On");
	}
	public String getStyle() {
		return Style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getRating() {
		return rating;
	}
	
	

}
