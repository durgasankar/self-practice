package array;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array initialisation");
		
		int value/*value type variable*/=7;//primitive data type which stores 32 byte memory
		
		int[] values/*reference type variable*/;//array created
		values = new int[3];//new created memory which stores value 3
		
		System.out.println("default value of array");
		System.out.println(values[0]);//o/p=0
		System.out.println(values[1]);//default value is 0
		
		System.out.println("after values were assigned to ref");
		values[0]=10;//value 10 is stored in the ref of value [0]
		values[1]=20;
		
		System.out.println(values[0]);//o/p=10
		System.out.println(values[1]);
		
		System.out.println("values were reassigned to same ref");
		values[0]=30;
		
		System.out.println(values[0]);
		
		System.out.println("for loop created");
		for(int i=0;i<values.length;i++)//number.length is never equals to i values
		{
			System.out.println(values[i]);//it will print all values of i
		}
		System.out.println("if i<=3 then it will create ArrayOutOfBoundaryException");
		
		System.out.println("specify the values in the list instead allocating memory and then specifying values");
		System.out.println("array number must be declaired in {} brackets");
		int[] numbers = {5,6,7,8};//array number must be declaired inside {} brackets
		for (int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
