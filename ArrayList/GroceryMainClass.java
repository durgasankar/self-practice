package ArrayList;

import java.util.Scanner;

public class GroceryMainClass {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		System.out.println("WelCome Press to test application ");
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter Your choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 0: printInstructions();
					break;
			case 1: groceryList.printGroceryList();
					break;
			case 2: addItems();
					break;
			case 3: modifyItems();
					break;
			case 4: removeItems();
					break;
			case 5: searchItems();
					break;
			case 6: quit=true;
					break;
			default: System.out.println("Please choose the number from the instructions\n");
					printInstructions();
					break;
			}
		}
	}
	private static void printInstructions() {
		System.out.println("Please follow the Instruction and Press Accordingly.\n"
							+"0 -> to read instructions.\n"
							+"1 -> to see items in your list.\n"
							+"2 -> to add items to your list.\n"
							+"3 -> to modify items present in your list.\n"
							+"4 -> to remove items present in your list.\n"
							+"5 -> to search for items present in your list.\n"
							+"6 -> to quit the application.");
	}
	private static void addItems() {
		System.out.println("Plsease Enter the grocery items");
		String name = sc.nextLine();
		groceryList.addGroceryItems(name);	
	}
	private static void modifyItems() {
		System.out.println("please Enter the item Number");
		int itemNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("please Enter the Modified item Name");
		String itemName = sc.nextLine();
		groceryList.modifyGroceryList(itemNumber-1,itemName);
	}
	private static void removeItems() {
		System.out.println("Please Enter the Item Number");
		int itemNumber = sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceryList(itemNumber);	
	}
	private static void searchItems() {
		System.out.println("Please Enter the Intem name you want to search");
		String itemName = sc.nextLine();
		sc.nextLine();
		groceryList.findGroceryList(itemName);	
	}

}
