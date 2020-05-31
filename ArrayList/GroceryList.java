package ArrayList;

import java.util.ArrayList;

public class GroceryList {
	private  ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItems(String name) {
		groceryList.add(name);
	}
	public void printGroceryList() {
		for(int i=0; i < groceryList.size(); i++) {
			System.out.println((i+1)+". "+groceryList.get(i));
		}
	}
	public void modifyGroceryList(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Item at position :"+(position+1)+"has been modified");
	}
	public void removeGroceryList(int position) {
		groceryList.remove(position-1);
	}
	public String findGroceryList(String name) {
		int position = groceryList.indexOf(name);
		if(position >= 0) {
			return groceryList.get(position);
		}
		return null;
	}

}
