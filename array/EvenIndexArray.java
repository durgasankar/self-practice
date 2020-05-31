package array;

import java.util.Scanner;

public class EvenIndexArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length ; i++) {
			if((i==0) || (i%2 ==0)) {
				System.out.println(arr[i]);
				
			}
		}	
	}
}
