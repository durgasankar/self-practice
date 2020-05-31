package array;

import java.util.Arrays;

public class UnderstandingReference {
	public static void main(String[] args) {
		
		int number = 10;
		int anatherNumber = number;
		System.out.println("Number is : "+number);
		System.out.println("Anather Number is : "+anatherNumber);
		//premitive data types to if we will do any changes in the refernce it will do changes in the
		//reference variable itself as it created blocks of memory allortment.
		anatherNumber++;
		System.out.println("Number is : "+number);
		System.out.println("Anather Number is : "+anatherNumber);
		
		int[] array = new int[5];
		int[] anatherArray = array;
		//Arrays and strings act as a refernce type
		System.out.println("Array values are : "+Arrays.toString(array));
		System.out.println("Anather Array values are : "+Arrays.toString(anatherArray));
		
		//reassigning values to array
		anatherArray[0] = 25;
		
		System.out.println("After reassigning Array values are : "+Arrays.toString(array));
		System.out.println("After reassigning Anather Array values are : "+Arrays.toString(anatherArray));
		
	}

}
