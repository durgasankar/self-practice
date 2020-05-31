package Input;
import java.io.*;
public class AcceptKeyEnteredByUser {
	
	public static void main(String[] args) {
		
		fibonacci();
		
	}
	
	public static void fibonacci()
	{
		int n=10;
		int f1=0;
		int f2=1;
		int sum=0;
		int count=0;
		while (count<n) {
		f1= f2;
		f2= sum;
		sum= f1+f2;
		System.out.println(sum);
		count++;
		}
		
		
	}
	
}