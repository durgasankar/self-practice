package DownloadVdo;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Enter your DOB :");
		int dob = sc.nextInt();
		int age = 2019 - dob;
		if(age <= 0 && age >= 100) {
			System.out.println("Invalid DOB entry");
		}
		else {
			System.out.println("Your name is :"+name+" and your age is :"+age);
			
		}
		
	}

}
