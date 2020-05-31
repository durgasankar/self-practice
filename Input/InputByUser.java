package Input;

import java.util.Scanner;

public class InputByUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("what is your name? ");
		String UserName;
		UserName = input.nextLine();
		System.out.println("Enter your number - ");
		long Number;
		Number = input.nextLong();
		System.out.println("your name is: "+UserName);
		System.out.println("your number is: "+Number);

	}

}
