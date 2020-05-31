package array;

import java.util.Scanner;

public class SortArrayHighestToLowest {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int [] myArray = toGetArray(3);
		//int [] sortArray = sortArray(myArray);
		//toPrintArray(sortArray);
		
		int[] array = getArr(5);
		int[] sortArr = sortAscendingOrder(array);
		printarr(sortArr);
	}
	
	public static int[] toGetArray (int number) {
		System.out.println("Enter the "+number+" elements of the array");
		int[] array = new int[number];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static void toPrintArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println("Element of index "+i+" contains "+array[i]);
		}
	}
	
	public static int[] sortArray(int[] array) {
		int[] sortedArray = new int[array.length];
		for(int i=0; i<array.length; i++) {
			sortedArray[i] = array[i];
		}
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i=0; i < sortedArray.length-1; i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}
	
	public static int[] getArr (int number) {
		System.out.println("Enter the "+number+" of elements of Array");
		int[] arr = new int[number];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void printarr(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Array of index "+i+" value is "+arr[i]);
		}
	}
	
	public static int[] sortAscendingOrder(int[] arr) {
		int [] sortArr = new int[arr.length];
		for(int i=0; i < sortArr.length; i++) {
			sortArr[i] = arr[i];
		}
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i = 0; i < sortArr.length-1; i++) {
				if(sortArr[i] > sortArr[i+1]) {
					temp = sortArr[i];
					sortArr[i] = sortArr[i+1];
					sortArr[i+1] = temp;
					flag = true;
				}
			}
		}	
		return sortArr;
	}
}
