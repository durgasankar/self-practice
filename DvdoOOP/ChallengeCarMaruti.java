package DvdoOOP;

public class ChallengeCarMaruti extends ChallengeCar{
	
	private int roadService;

	public ChallengeCarMaruti( int roadService) {
		super("Maruti","4WD",4,4,5, false);
		
		this.roadService = roadService;
	}
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity() + rate;
		
		if(newVelocity == 0) {
			stop();
		}else if (newVelocity >  0 && newVelocity <=20) {
			changeGear(1);
		}else if (newVelocity > 20 && newVelocity <=40) {
			changeGear(2);
		}else if (newVelocity > 40 && newVelocity <=60) {
			changeGear(3);
		}else if (newVelocity > 60 && newVelocity <=80) {
			changeGear(4);
		}else { 
			changeGear(5);
		}
		
		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	

}
