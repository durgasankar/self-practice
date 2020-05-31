package DvdoOOP2.Composition;

public class PC {
	
	private Case theCase;
	private Moniter moniter;
	private MotherBoard motherboard;
	
	public PC(Case theCase, Moniter moniter, MotherBoard motherboard) {

		this.theCase = theCase;
		this.moniter = moniter;
		this.motherboard = motherboard;
	}
	public void powerUp() {
		theCase.pressPowerBotton();
		drawLogo();
	}
	
	private void drawLogo() {
		//fancy graphics logo
		
		//we can access it directly or by using method name 
		moniter.drawPixelAt(20, 50, "Yellow");
	}

	public Case getTheCase() {
		return theCase;
	}

	 Moniter getMoniter() {
		return moniter;
	}

	public MotherBoard getMotherboard() {
		return motherboard;
	}
	

}
