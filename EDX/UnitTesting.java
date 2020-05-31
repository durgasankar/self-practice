package EDX;

public class UnitTesting {
	
	int max(int a , int b ) {
		
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	void testMax() {
		int x = max(3 , 7);
		if(x!=7) {
			System.out.println("max of 3 and 7 is :"+x);
		}
		
	}
	public static void main(String[] args) {
		
		UnitTesting test = new UnitTesting();
		test.max(3, 7);
		test.testMax();
		
		
		
	}

}
