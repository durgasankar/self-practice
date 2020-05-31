package others;

import java.util.ArrayList;
import java.util.List;

public class Practise {
	public static void main(String[] args) {
		
	//difference between add and addAll	
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(10);
		
		
		System.out.println("printing arrayLIst 1");
		for(Integer printNumber: arrList) {
			System.out.println(printNumber);
		}
		
		List<Integer> arr2List = new ArrayList<Integer>();
		arr2List.add(2);
		arr2List.add(4);
		System.out.println("printing arrayLIst 2");
		for(Integer printNumber:arr2List) {
			System.out.println(printNumber);
		}
		
		arrList.addAll(arr2List);
		System.out.println("printing updated arrayLIst 1");
		for(Integer printNumber: arrList) {
			System.out.println(printNumber);
		}
		
		//difference between contains and containsAll
		List<String> list = new ArrayList<String>();
		
		list.add("Hallo");
		list.add("Raja");
		list.add("How");
		list.add("are");
		list.add("You");
		
		System.out.println("list :"+list);
		
		List<String> containsAllTest = new ArrayList<String>();
		containsAllTest.add("Raja");
		containsAllTest.add("You");
		
		if(list.containsAll(containsAllTest)) {
			System.out.println("ContainsAll");
		}else {
			System.out.println("Not present");
		}
		
	}

}
