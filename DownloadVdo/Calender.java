package DownloadVdo;
import java.util.*;
public class Calender{
	
	public static void main(String[] args) {
		
		Calender cal = new Calender();
		//cal.month(5);//for single output
		//cal.montharr(12);//all the months after month 1
		cal.numberofdays(2,2001);//to find number of month and year
		//cal.arraySearch(91);//searching a number in the array
		

	}
	public void month(int month) {

		String monthName;
			
			switch(month) {
			
			case 1 :monthName = "Jan";
					break;
			case 2 :monthName = "Feb";
					break;
			case 3 :monthName = "Mar";
					break;
			case 4 :monthName = "Apr";
					break;
			case 5 :monthName = "May";
					break;
			case 6 :monthName = "June";
					break;
			case 7 :monthName = "July";
					break;
			case 8 :monthName = "Aug";
					break;
			case 9 :monthName = "Sept";
					break;
			case 10 :monthName = "Oct";
					break;
			case 11 :monthName = "Nov";
					break;
			case 12 :monthName = "Dec";
					break;
			default :monthName = "Invalid Month Number";
				
					
			}
			System.out.println(monthName);
			
	}
	
	public void montharr(int month) {
		ArrayList<String> fmonth = new ArrayList<String>();
		
		switch(month) {
		
		case 1:  fmonth.add("Jan");
		case 2:  fmonth.add("Feb");
		case 3:  fmonth.add("Mar");
		case 4:  fmonth.add("Apr");
		case 5:  fmonth.add("May");
		case 6:  fmonth.add("June");
		case 7:  fmonth.add("July");
		case 8:  fmonth.add("Aug");
		case 9:  fmonth.add("Sept");
		case 10: fmonth.add("Oct");
		case 11: fmonth.add("Nov");
		case 12: fmonth.add("Dec");
		break;
		default: break;
		}
		
		if(fmonth.isEmpty()) {
			System.out.println("Invalid month Number");
		}
		else {
			for(String monthName : fmonth) {
				System.out.println(monthName);
			}
			
		}
		
	}
	
	public void numberofdays(int month,int year) {
		
		int NumOfDays = 0;
		
		switch(month) {
		
		case 1: case 3: case  5:
		case 7: case 8: case 10:
		case 12:
			NumOfDays=31;
		break;
		
		case 4: case  6:
		case 9: case 11:
			NumOfDays=30;
		break;
		
		case 2:
			if(((year % 4 == 0) && 
				!(year % 100 == 0))
					||(year % 400 == 0)) {
				NumOfDays=29;
			}
			else {
				NumOfDays=28;
				break;
			}
			default : 
			System.out.println("Invalid Entry");
			break;
		}
		System.out.println("Number of Days = " + NumOfDays);
	}
	
	public void arraySearch(int searchNum) {
		int[] array = {12 , 55 , 64 , 85 , 
					   45 , 95 , 87 , 86 ,
					   48 , 25 , 37 , 91 , 
					   73 , 49 , 94 , 35 ,
					    2 ,  4 ,  8 , 16 };
		int i=0;
		boolean foundIt = false;
		
		for(i = 0; i < array.length; i++) {
			if(array[i] == searchNum) {
				foundIt = true;
				break;
			}
			
		}
			if(foundIt) {
				i=i+1;
				System.out.println("You found :"+searchNum+" at position : "+i);
			}
			else {
				System.out.println(searchNum+" Not in the array list");
			}
	}

}