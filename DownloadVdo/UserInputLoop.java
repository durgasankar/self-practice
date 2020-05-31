package DownloadVdo;

import java.util.Scanner;

public class UserInputLoop {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int min = 0;
		 int max = 0;
		 boolean first = true;
		 int count = 0;
		 
		 while(true) {
			 System.out.println("Enter a number");
			 count += 1;
			 boolean isAnInt = sc.hasNextInt();
			 
			 if(isAnInt) {
				 int number = sc.nextInt();
				 
				 if(first) {
					 first = false;
					 min = number;
					 max = number;
				 }
				 if(number > max) {
					 max = number;
				 }
				 if(number < min) {
					 min = number;
				 }
			 }
			 else {
				 break;
			 }
		 }	 
		 System.out.println("Total count :"+count+" min number = "+min+" max number = "+max);
		 sc.close();
	}

}
