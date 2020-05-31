package LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		addInOrder(list,"Raja");
		addInOrder(list,"Sudhansu");
		addInOrder(list,"Amir");
		addInOrder(list,"Kharesh");
		addInOrder(list,"Tanu");
		addInOrder(list,"Amish");
		printList(list);
		list.remove("Amir");
		printList(list);
		addInOrder(list,"Suresh");
		printList(list);
		
		shownames(list);
		
	}
	private static void print(LinkedList<String> list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> ref = linkedList.iterator();
		while(ref.hasNext()) {
			System.out.println(ref.next());
		}
		System.out.println("*******************");
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String name) {
		ListIterator<String> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			int compare = listIterator.next().compareTo(name);
			if(compare == 0) {
				System.out.println("name already exist in the list");
				return false;
			}else if(compare > 0) {
				listIterator.previous();
				listIterator.add(name);
				return true;
			}else if(compare < 0) {
				//move to the next line
			}
		}
		listIterator.add(name);
		return true;	
	}
	private static void printMenu() {
		System.out.println("Available instructions.\n");
		System.out.println("0 -> Quit\n"+
							"1 -> Go to the next name\n"+
							"2 -> Go to the previous name\n"+
							"3 -> Print instructions");
	}
	private static void shownames(LinkedList name) {
		Scanner sc = new Scanner(System.in);
		ListIterator<String> listIterator = name.listIterator();
		boolean quit = false;
		boolean goingForward = true;
		
		if(name.isEmpty()){
			System.out.println("No Names in the list");
		}else {
			System.out.println("Now showing :"+listIterator.next());
		}
		while(!quit) {
			printMenu();
			int action = sc.nextInt();
			switch(action) {
			
			case 0://Quit! No more display
				System.out.println("Quit! No more display");
			break;
			
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Current name :"+listIterator.next());
				}else {
					System.out.println("End of the list");
					goingForward = false;
				}
			break;
			
			case 2:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Previous name :"+listIterator.previous());
				}else {
					System.out.println("Start of the list");
				}
			break;
			
			case 3:
				printMenu();
			break;
			}
		}
	}
}
