package array;

import java.util.Scanner;

public class AverageOfArray {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr = getIntegers(6);
		for(int i=0; i < arr.length; i++) {
			System.out.println("Elements at index : "+i+" typed values : "+arr[i]);
		}
		System.out.println("Average is : "+getAverage(arr));
	}
	
	public static int[] getIntegers(int number) {
		System.out.println("Enter "+number+", integer values");
		int[] values = new int[number];	
		for(int i=0; i < values.length;i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum= 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return  (double)sum / (double)array.length;
	}
}
