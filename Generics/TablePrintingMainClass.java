package Generics;

import java.util.Scanner;

public class TablePrintingMainClass {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		TablePrinting table = new TablePrinting(sc.nextLong());
		table.table();
	}

}
