package array;

import java.util.Scanner;

public class ResizingAnArray {
	private static int[] array = new int[5];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter 5 inputs");
		getInput();
		printArray(array);
		resizeArray();
		System.out.println("\nEnter 7 inputs");
		sc.nextLine();
		getInput();
		printArray(array);
	}
	private static void getInput() {
		for(int i=0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}
	private static void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	private static void resizeArray() {
		int[] original = array;
		array = new int[original.length+2];
		for(int i=0; i < original.length; i++) {
			array[i] = original[i];
		}
	}
}
