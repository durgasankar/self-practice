package DownloadVdo;

public class StringToPrimitiveDataTypes {
	public static void main(String[] args) {
		
		String number = "1975";
		int number2 = 12;
		System.out.println(number + number2);
		int num = Integer.parseInt(number);
		int sum = num+number2;
		System.out.println(sum);
		
		double dnum = Double.parseDouble(number);
		System.out.println(dnum);
		
		String str = "1234";
		int strnum = Integer.parseInt(str);
		System.out.println(strnum+6);
		double strdbl = Double.parseDouble(str);
		System.out.println(strdbl+6);
		
				

	}
	
	

}
