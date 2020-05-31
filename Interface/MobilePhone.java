package Interface;

public class MobilePhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	private boolean isOn;
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone power On");
		
	}
	@Override
	public void dial(int number) {
		if(isOn) {
		System.out.println("Now ringing "+number+" on Mobile Phone");
		}else {
			System.out.println("Mobile Phone is Switch Off");
		}
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answer the Mobile phone");
			isRinging = false;
		}
		
	}
	@Override
	public void callPhone(int number) {
		if(number == myNumber && isOn) {
			isRinging = true;
			System.out.println("Ring - Ring");
		}
		
	}
	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	
	

}
