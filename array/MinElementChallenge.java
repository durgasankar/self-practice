package array;

import java.util.Scanner;

public class MinElementChallenge {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the count :");
		int count = sc.nextInt();
		sc.nextLine();
		
		int[] returnedArray = readInteger(count);
		int returnedMin = findMin(returnedArray);
		System.out.println("Minimum Integer value is :"+returnedMin);
	}
	private static int[] readInteger(int count) {
		int [] array = new int[count];
		for(int i=0; i < array.length; i++) {
			System.out.println("Enter the Element : ");
			int number = sc.nextInt();
			array[i] = number;
		}
		return array;
	}
	public static int findMin(int[] array) {
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			
			int value = array[i];
			if(value < min) {
				min = value;
			}
		}
		return min;
	}	
}
