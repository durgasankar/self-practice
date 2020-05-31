package array;

import java.util.Scanner;

public class PrintArrayInReverseOrder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("enter array elements");
		for(int i=0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		//reversing elements of array
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
