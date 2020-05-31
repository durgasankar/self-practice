package ArrayList;

import java.util.ArrayList;

public class AutoBoxingAndUnboxing {
	public static int sumOfOddNumber(ArrayList<Integer> list) {
		int sum = 0;
		for(Integer i: list) {
			if(i % 2 != 0)
				sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i < 10; i++) {
			list.add(i);
		}
		int sumOdd = sumOfOddNumber(list);
		System.out.println(sumOdd);*/
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//add values
		for(int i=0; i < 10; i++) {
			arrayList.add(Integer.valueOf(i));
			System.out.println(i);
		}
		for(int i=0; i < 10; i++) {
			arrayList.get(i).intValue();
			System.out.print(arrayList.get(Integer.valueOf(i))+" ");
		}
		
	}
}
