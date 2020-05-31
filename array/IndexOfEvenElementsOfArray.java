package array;

import java.util.Scanner;

public class IndexOfEvenElementsOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Index of even elements present in the array");
		for(int i=0; i<arr.length ; i++) {
			if((arr[i]==0) || (arr[i]%2 ==0)) {
				System.out.println(i);
				
			}
		}
	}	
}
