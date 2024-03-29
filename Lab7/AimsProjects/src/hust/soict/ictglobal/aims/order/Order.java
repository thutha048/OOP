package hust.soict.ictglobal.aims.order;

import hust.soict.ictglobal.aims.media.*;
import java.util.ArrayList;

public class Order {
	
	public static final int MAX_LIMITTED_ORDERS = 5;
	
	ArrayList<Media> itemsOrdered = new ArrayList<Media> ();
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	public static int getMaxLimittedOrders() {
		return MAX_LIMITTED_ORDERS;
	}
	
	//Check the list empty or not
	public boolean checkEmpty() {
		return this.itemsOrdered.isEmpty();		
	}
	//Check media exists or not
	public boolean checkExist(Media item) {
		return this.itemsOrdered.contains(item);
	}
		
	//1.Create a new order
	public void create() {
		//delete the previous list
		this.itemsOrdered.removeAll(itemsOrdered);
		System.out.println("Created a new order!");
	}
	
	//2.Add new Media
	public void addMedia(Media item) {
		if(checkExist(item)) {
			System.out.println("The id existed! Enter again!");
		}else {
			this.itemsOrdered.add(item);
		}
	} 
	
	//3.Delete a media by id
	public void removeMe(String id) {
		boolean check = false;
		for(int i=0;i < itemsOrdered.size();i++) {
			 check = itemsOrdered.get(i).getId().equals(id);
			if(check ==true ) {
				itemsOrdered.remove(i);
				System.out.println("Success! It is deleted!\n");
				break;
			}
		}
		
		if(check == false) {
			System.out.println("Fail!This id doesn't exist!\n");
		}
	}
	
	//4. 	Display the list
	public void displayList() {
		if(checkEmpty()) {
			System.out.println("The list is empty!");
		}else {
			System.out.println("\n-----------LIST------------");
			for(Media media: itemsOrdered) {
				System.out.println(media);
			}
		}
	}
	
	//5. total cost
	public void totalCost() {
		float total = 0;
		for(int i=0;i<itemsOrdered.size();i++) {
			total+= itemsOrdered.get(i).getCost();
		}
		System.out.println("The total cost = "+ total);
	}

}
