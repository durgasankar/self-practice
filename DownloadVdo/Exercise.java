package DownloadVdo;

public class Exercise {
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	Integer i = 10;
	
	public static void checkNumber(int number) {

		if (number>0) {
			System.out.println("Positive : "+number);
		}else if (number<0) {
			System.out.println("Negative : "+number);
		}else {
			System.out.println("Number is Zero");
		}
	}
	
	public static long toMilesPerHour(double kmPerHour) {
		
		if(kmPerHour < 0) {
			
			return -1;
			
		}else {
			
			return Math.round(0.621371*kmPerHour);
		}
	}
	
	public static void printConversion (double kmPerHour) {
		
		if (kmPerHour > 0) {
			
			System.out.println(kmPerHour+" km/hr = "+Math.round(0.621371*kmPerHour)+" miles/hr");
		}
		else 
			
			System.out.println(INVALID_VALUE_MESSAGE);
		
	}

	public static void calcFeetAndInchesToCentimeter(int feet , int inches) {
		
		if ((feet >= 0) && (inches >= 0 && inches <=12)) {	
			
			double centimeter = ((feet*12) + inches)*2.54;
			System.out.println(feet+" feet & "+inches+" inches = "+centimeter+" centimeter");
			
		}
		else
			System.out.println(INVALID_VALUE_MESSAGE);
		
	}
	
	public static void inchesToCentimeter(int inches) {
		
		if(inches>0) {
			
			int feet  = inches/12;
			int	remainder =	inches % 12;
			double  centimeter = (feet * 12 + remainder)*2.54 ;
			System.out.println(inches+" + inches = "+feet+" feet & "+inches+" inches = "+centimeter+" centimeter");
		}
		
	}
	
	public static String getDurationString(int minutes,int seconds) {
		if ((seconds < 0) || (minutes < 0) || (seconds >59)) {
			return INVALID_VALUE_MESSAGE;
		}
		else{
			  int hour = minutes / 60;
			  String stringhour = hour + " h ";
			  if(hour<10) {
				  stringhour = "0" + stringhour;
			  }
			  String stringminutes = minutes + " m ";
			  if(minutes<10) {
				  stringminutes = "0" + stringminutes;
			  }
			  String stringseconds = seconds + " s ";
			  if(seconds<10) {
				  stringseconds = "0" + stringseconds;
			  }
			  return stringhour+stringminutes+stringseconds;
		}
	}

	public static String getDurationString(int seconds) {
		
		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}else {
			
			int minutes = seconds / 60;
			int remainingsec = seconds % 60;
			
			return getDurationString(minutes,remainingsec);
		}
	}
	
	public static boolean isCatPlaying(boolean summer,int temp) {
		if((summer) && (temp >= 25) && (temp <= 45)) {
			return true;
		} return false;
	}	
	
	public static boolean isPrime(int number) {
		
		if(number == 1) {
			return false;
		}else
		{
			for(int i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					return false;
				}		
			}
		}
		return true;	
	}
	
	public static void primeNumberLoop() {
		
		int count = 0;
		for(int i = 10 ; i<50 ; i++) {
			
			if(isPrime(i)) {
				
				System.out.println(i+" is prime");	
				count ++;
				if(count == 3) {
					System.out.println("exciding for loop");
					break;
				}

			}
			
		}
		
	}
	
	public static void sumOneToOneThousand() {
		
		int count = 0;
		int sum = 0;
		for (int i = 1; i <=1000 ; i++) {
			
			if((i % 3 == 0) && (i % 5 == 0)) {
				
				System.out.println(i);
				count ++ ;
				sum += i; 
				if (count == 5) {	
					System.out.println("exciding loop");
					break;
				}
			}		
		}
		System.out.println("Total sum = "+sum);
	}
	
	public static boolean isEvenNumber(int number) {
		
		if (number == 1) {
			return false;
		}
		else {
			if(number % 2 != 0) {
				return false;
			}		
		}
		return true;			
	}
	
	public static void countFiveEvenNumber() {
		
		int number = 12;
		int finalnumber = 20 ;
		int count = 0; 
		
		while (number <= finalnumber) {
			
			number++;
			if(isEvenNumber(number)) {
				count ++;
				System.out.println("Even number is "+number);
				if(count == 5) {
					System.out.println("You are exciding the loop");
					break;
				}
			}
		}
		System.out.println("Total Even Number found : "+count);
	}
	
	public static int sumOfDigitsOfTheNumber(int number) {
		if(number < 10) {
			return -1;
		}
		else {
			int sum = 0;
			while (number > 0) {//121 t,t,t,f
				
				int digit = number % 10;//1,2,1
				sum = sum + digit;//0+1+2=3+1=4
				number = number / 10;//0
			}
			return sum;
		}
	}
	
	public static void palindromeNumber(int number) {
		
		int sum = 0;
		int tempnumber = number;
		while(number>0) {
			
			int remainder = number % 10;
			sum = (sum * 10) + remainder;
			number /= 10;
		}
		if(sum == tempnumber) {
			System.out.println("palindrome :"+tempnumber);
		}else
		{
			System.out.println("not a palindrome number");
		}
	}
	
	public static void firstAndLastDigitOfNumber(int number) {
		int sum = 0;
		int firstdigit = 0;
		int lastdigit = 0;
		if(number < 0) {
			System.out.println("Please Enter Positive value");
		}
		else {
			{
			lastdigit = number % 10;
			}
			while(number>0) {
				firstdigit = number % 10;
				number /= 10;
			}
			sum = firstdigit + lastdigit;
			System.out.println("first digit :"+firstdigit+" + last digit :"+lastdigit+" = sum :"+sum);
		}
	}
	
	public static void evenDigitSumOfNumber(int number) {
		int sum = 0;
		int digit;
		if(number < 0) {
			System.out.println(INVALID_VALUE_MESSAGE);
		}
		else {
			while(number>0) {
				digit = number % 10;
				number /= 10;
				if((digit % 2 ==0) && digit != 0) {
					sum += digit;
					System.out.println("even digits are :"+digit);
				}
			}
			System.out.println("sum of even digits are :"+sum);
		}
	}
	
	public static void main(String[] args) {
		
		checkNumber(10);
		
		System.out.println("in miles per hour "+toMilesPerHour(150.00));
		
		printConversion(120);
		
		calcFeetAndInchesToCentimeter(1,3);
		
		inchesToCentimeter(15);
		
		System.out.println(getDurationString(1,40));
		
		System.out.println(getDurationString(121));
		
		System.out.println(isCatPlaying(true,30));
		
		isPrime(13);
		
		primeNumberLoop();
		
		sumOneToOneThousand();
		
		System.out.println(isEvenNumber(8));
		
		countFiveEvenNumber();
		
		System.out.println(sumOfDigitsOfTheNumber(121));
		
		palindromeNumber(122);
		
		firstAndLastDigitOfNumber(12512546);
		
		evenDigitSumOfNumber(2468024);
	}
}
