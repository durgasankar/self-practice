package array;

import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		
    	System.out.println("Enter the length");
    	int length = sc.nextInt();
    	System.out.println(getSum(getArray(length)));
    	
	}
    private static int[] getArray(int number) {
    	int[] values = new int[number];
    	for(int i=0; i < values.length; i++) {
    		values[i] = sc.nextInt();
    	}
    	return values;
    }
    private static int getSum(int[] arr) {
    	int sum = 0; 
    	for(int i=0; i<arr.length; i++) {
    		sum += arr[i];
    	}
    	return sum;
    }
    private static int diagonalDifference(int [][] arr) {
    	int sum1 = 0 , sum2 = 0;
    	for(int i=0; i<arr.length; i++) {
    		for(int j=0; j<arr.length; j++) {
    			if(i == j) {
    				sum1 += arr[i][j];
    			}
    			if(i == arr.length-j-1) {
    				sum2 += arr[i][j];
    			}
    		}
    	}
    	int diagonalDiff = Math.abs(sum1 -sum2);
    	return diagonalDiff;
    }
}
