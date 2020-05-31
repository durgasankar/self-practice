package array;

import java.util.*;

public class PrintAnArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//array creation
		System.out.println("Enter the length of array");
		int arr[] = new int[sc.nextInt()];
		
		//array declaration
		System.out.println("Enter the array elements");
		for(int i=0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//array printing
		for(int i = 0; i<arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
	}
	

}
