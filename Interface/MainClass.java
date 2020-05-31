package Interface;

public class MainClass {
	public static void main(String[] args) {
		ITelephone phone = new Telephone(15410);
		phone.powerOn();
		phone.dial(15410);
		phone.answer();
		phone.callPhone(15410);
		System.out.println(phone.isRinging());
		
		System.out.println("======================");
		
		phone = new MobilePhone(750414);
		phone.powerOn();
		phone.dial(750414);
		phone.answer();
		phone.callPhone(750414);
		System.out.println(phone.isRinging());
	}

}
