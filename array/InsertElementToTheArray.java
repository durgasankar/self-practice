package array;

import java.util.*;

public class InsertElementToTheArray {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter the length of array");
		int arr1[] = new int[sc.nextInt()];
		int arr2[] = new int[arr1.length + 1];
		
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Index Number less than " + arr1.length);
		int index = sc.nextInt();
		if(index < arr1.length) {
			System.out.println("Enter the element you want to insert int to the array:");
			int element = sc.nextInt();
		
			for( int i = 0; i < arr2.length; i++) {
				if(i < index) {
					arr2[i] = arr1[i];
				}else if(i == index) {
					arr2[i] = element;
				}else {
					arr2[i] = arr1[i-1];
				}
			}
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.toString(arr2));
			System.out.println("old array");
			for(int i = 0; i < arr1.length; i++) {
				if(i !=0)
				System.out.print(" " + arr1[i]);
				else
					System.out.print(arr1[i]);
					
			}
			System.out.println();
			
			System.out.println("after insertion");
			for(int i =0; i < arr2.length; i++) {
				if(i != 0)
				System.out.print(" " + arr2[i]);
				else
					System.out.print(arr2[i]);
			}
		}else {
			System.out.println("Your index number is out of limit");
		}
		
	}

}
