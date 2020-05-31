package DvdoOOP2.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class Trial {
	private int myInt;
	
	public Trial(int myInt) {
		this.myInt = myInt;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	public int getMyInt() {
		return this.myInt;
	}
	public static void main(String[] args) {
		
		ArrayList<String> arrList = new ArrayList<String>(10);
		ArrayList<Trial> trial = new ArrayList<Trial>();
		trial.add(new Trial(50));
		trial.add(new Trial(40));
		trial.add(new Trial(30));
		trial.add(new Trial(10));
		trial.add(new Trial(20));
		for(int i=0; i< trial.size(); i++) {
			System.out.println(i+" --> "+trial.get(i).getMyInt());
		}
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			intArray.add(Integer.valueOf(i*100/2));
						//object wrapper class
			System.out.println(i+" AutoBoxing --> "+intArray.get(Integer.valueOf(i)));			
			int k = intArray.get(i).intValue();
								//converting back to primitive type again 
			System.out.println(i+" UnBoxing--> "+k);
		}
		
		Integer myInt = 56;//no error
		Integer myInt2 = Integer.valueOf(56);
		// during compile time its value is changed to Integer.valueOf(56);
		Double dbl = 56.56;
		Double dbl2 = Double.valueOf(56.56);
	}

}
