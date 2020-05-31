package DvdoOOP2.Composition;

public class MainClass {
	
	public static void main(String[] args) {
		
		Dimension dimensions = new Dimension(20,20,5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Moniter moniter = new Moniter("750DS1", "Lenovo" ,20 ,new Resolution(1080,1080));
		
		MotherBoard motherBoard = new MotherBoard("RJ-r20jc134", "HP", 8, 6, "450-TV");
		
		PC pc = new PC(theCase,moniter,motherBoard);
		
		pc.getMoniter().drawPixelAt(20, 50, "Red");
		pc.getMotherboard().loadProgramme("Windows 10.0");
		pc.getTheCase().pressPowerBotton();
		
		//pc.powerUp();
	}

}
