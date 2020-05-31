package Interface;

public class Telephone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	public Telephone(int myNumber) {
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		System.out.println("dont have a power option");
		
	}
	@Override
	public void dial(int number) {
		System.out.println("Now ringing "+number);
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answer the phone");
			isRinging = false;
		}
		
	}
	@Override
	public void callPhone(int number) {
		if(number == myNumber) {
			isRinging = true;
			System.out.println("Ring - Ring");
		}
		
	}
	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	
	

}
