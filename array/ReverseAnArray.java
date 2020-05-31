package array;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Original Array : "+Arrays.toString(array));
		reverse(array);
		System.out.println("Reversed Array : "+Arrays.toString(array));
		
	}
	private static void reverse(int[] array) {
		int lastindex = array.length - 1;
		for(int i=0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[lastindex -i];
			array[lastindex -i] = temp; 
		}
	}

}
