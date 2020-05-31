package DvdoOOP2.ChallengeTheRoom;

public class Bed {
	private String style;
	private int pillow;
	private int height;
	private String bedSheet;
	
	public Bed(String style, int pillow, int height, String bedSheet) {
		
		this.style = style;
		this.pillow = pillow;
		this.height = height;
		this.bedSheet = bedSheet;
	}
	public void make() {
		System.out.println("Bed -> making");
	}

	public String getStyle() {
		return style;
	}

	public int getPillow() {
		return pillow;
	}

	public int getHeight() {
		return height;
	}

	public String getBedSheet() {
		return bedSheet;
	}
	
	

}
