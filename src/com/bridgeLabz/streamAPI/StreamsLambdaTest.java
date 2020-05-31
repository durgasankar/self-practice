package com.bridgeLabz.streamAPI;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsLambdaTest {

	public static void main(String[] args) {
		/**
		 * traditional way doing internal iteration fetching the data and adding it to
		 * the temporary list and after sorting fetching the data.
		 */
		List<String> list = Arrays.asList("A02", "A64", "H60", "T75", "S67", "P04", "Q42", "V08");
//		List<String> aList = new ArrayList<String>();
//		list.forEach(number -> {
//			if (number.toUpperCase().startsWith("A")) {
//				aList.add(number);
//				System.out.println(number);
//			}//		List<String> aList = new ArrayList<String>();
//		list.forEach(number -> {
//		if (number.toUpperCase().startsWith("A")) {
//			aList.add(number);
//			System.out.println(number);
//		}
//	});
//	aList.sort((s1, s2) -> s1.compareTo(s2));
//	System.out.println("Following traditional way...");
//	aList.forEach(s -> System.out.println(s));

//		});
//		aList.sort((s1, s2) -> s1.compareTo(s2));
//		System.out.println("Following traditional way...");
//		aList.forEach(s -> System.out.println(s));

		/**
		 * 
		 */
		System.out.println("Using stream...");
		//stream should not depend on any variables
		list.stream()
			// method accepts a function String object used to invite object
			.map(String::toUpperCase)
			//
			.filter(s -> s.startsWith("A"))
			//contains sorted list which starts with A
			.sorted()
			//for each method from stream class mapping by Consumer Interface
			.forEach(System.out::println);
		
		//foreach method is a terminal operation

	}

}
