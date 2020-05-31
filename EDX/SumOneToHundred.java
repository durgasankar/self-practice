package EDX;

public class SumOneToHundred {

	static int sum=0;
	static int num=1;
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalSum ans = new TotalSum();
		ans.TotalCalc();
		
	}

}
class TotalSum
{
	public void allnum()
	{
		while(SumOneToHundred.num<=100)
		{
			SumOneToHundred.sum = SumOneToHundred.sum + SumOneToHundred.num;
			SumOneToHundred.num++;
			
		}
		System.out.println("Sum of all numbers from 1-100 is : "+SumOneToHundred.sum);

	}
	
	public int oddnum()
	{
		
		int sum=0;
		
		for(int num=1;num<=100;num++)
		{
			sum = sum + num ;
			num = num+1;
		}
		System.out.println("Sum of all Odd numbers from 1-100 is : "+sum);
		return 0;
		
	}
	
	public void evennum()

	{
		int sum = 0;
		int num = 2;
		
		while(num<=100)
		{
			sum = sum + num ; 
			num = num + 2 ;
		}
		System.out.println("Sum of all even  numbers from 1-100 is : "+sum);
	}

	public void TotalCalc()
	{
		TotalSum sum = new TotalSum();
		
		sum.allnum();
		System.out.println("\n");
		sum.oddnum();
		System.out.println("\n");
		sum.evennum();
	}
	
}

