package com.bridgeLabz.java8Features.forEach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/***
 * functional interface which have one method accept
 * 
 * @author Durgasankar Mishra
 *
 */
public class ForEach {

	static List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);

	public static void justPrint() {
		System.out.println(list);
	}

	public static void printForLoop() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void printAdvForLoop() {
		for (int i : list) {
			System.out.println(i);
		}
	}

	public static void printIterator() {
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public static void printForEach() {
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};

		list.forEach(c);
	}

	public static void printEfficentForEach() {
		Consumer<Integer> c = (Integer i) -> System.out.println(i);
		list.forEach(c);
	}

	public static void printMostEfficient() {
		list.forEach(i -> System.out.println(i));
	}

	/**
	 * call directly by class name :: method name
	 */
	public static void bestWayPrint() {
		list.forEach(System.out::println);
	}

	private static void doubleIt(int i) {
		System.out.println(i * 2);
	}

	/**
	 * call directly by class name :: method name ---->> method reference.
	 */
	public static void bestWayPrintDouble() {
		list.forEach(ForEach::doubleIt);
	}

	public static void main(String[] args) {

		justPrint();

//		printForLoop();

//		printAdvForLoop();

//		printIterator();

//		printForEach();

//		printEfficentForEach();

//		printMostEfficient();

//		bestWayPrint();

//		bestWayPrintDouble();

	}

}
