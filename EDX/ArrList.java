package EDX;
import java.util.*;
public class ArrList {
	
	public static void main(String[] args) {
		
		ArrayList<String> stdName = new ArrayList<String>();
		
		stdName.add("Student 1");
		stdName.add("Student 2");
		stdName.add("Student 3");
		stdName.add("Student 4");
		stdName.add("Student 5");
		stdName.add("Student 6");
		stdName.add("Student 7");
		stdName.add("Student 8");
		
		System.out.println(stdName.size());//it will print the size of the arraylist size
		
		for (String i : stdName) {
			System.out.println(i);
			
			
			
			//test for output 
			
			/*int[] scores = new int[] {88,55,71,98,93};
			ArrayList <Integer> ds = new ArrayList<Integer>();
			for (int j=0 ;j<scores.length;j++) {
				if (scores[j]>90) {
					ds.add(j);
				}
			}
			System.out.println(ds.get(1));
		*/}
		
	}
}	
	

