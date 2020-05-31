package EDX;

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Positive Integer : ");
		int userInput = sc.nextInt();
		
		int factor=2;
		while (userInput % factor != 0)
		{
			factor++;
		}
		if (userInput == factor)
		{
			System.out.println("your Input Number is prime Number");
		}
		else 
		{
			System.out.println("Your Input Number is not prime Number because the factor is : "+factor);
		}
		
	}

}
