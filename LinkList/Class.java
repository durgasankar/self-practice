package LinkList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Class {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(10);
		list.add(1, "lee");
		list.add(new Temp());
		list.add(null);
		
		System.out.println(list.size());
		
		System.out.println("======print by iterator======");
		printIterator(list);
		list.remove(2);
		System.out.println("======print by iterator======");
		printIterator(list);
		System.out.println("======print by listIterator======");
		printListIterator(list);
		System.out.println("======print from last to begin======");
		printListIteratorFromLast(list);
	}
	
	private static void printIterator(List list) {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	private static void printListIterator(List list) {
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	}
	private static void printListIteratorFromLast(List list) {
		ListIterator lit = list.listIterator();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
class Temp{
	private void temp() {
		System.out.println("AMMMMAA");
	}
}