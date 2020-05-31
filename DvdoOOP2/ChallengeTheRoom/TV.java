package DvdoOOP2.ChallengeTheRoom;

public class TV {
	
	private boolean remote;
	private boolean powerSupply;
	private int chennalNumber;
	private boolean cable;
	
	public TV(boolean remote, boolean powerSupply, boolean cable, int chennalNumber) {
		this.remote = remote;
		this.powerSupply = powerSupply;
		this.chennalNumber = chennalNumber;
		this.cable = cable;
	}
	
	public TV(int chennalNumber) {
		this(true,true,true, chennalNumber);
		this.chennalNumber = chennalNumber;
	}

	private void changeChennal(boolean cable, int chennalNumber) {
		this.chennalNumber = chennalNumber;
		this.cable = cable;
		this.powerSupply = powerSupply;
		
		if(this.cable = true && this.powerSupply == true) {
				if(chennalNumber == 0) {
					System.out.println("DD National");
				}else if(chennalNumber >  0 && chennalNumber <= 20) {
					System.out.println("Hollywood Chennal");
				}else if(chennalNumber > 20 && chennalNumber <= 40) {
					System.out.println("Hindi Chennals");
				}else if(chennalNumber > 40 && chennalNumber <= 60) {
					System.out.println("Astha chennals");
				}else if(chennalNumber > 60 && chennalNumber <= 80) {
					System.out.println("Odia Chennals");
				}else if(chennalNumber > 80 && chennalNumber <= 100) {
					System.out.println("Music Chennals");
				}else {
					System.out.println("Invalid Chennals");
				}
			
		}else {
			System.out.println("Check cables or power supply");
		}
	}
	
	private void powerOn(boolean powerSupply) {
		this.powerSupply = powerSupply;
		if(powerSupply == true) {
			System.out.println("Switch on the tv");
		}else {
			System.out.println("Check the power Supply Connection");
		}
	}

	public  void watchtv() {
		powerOn(powerSupply);
		changeChennal(cable,chennalNumber);
		
	}
}

