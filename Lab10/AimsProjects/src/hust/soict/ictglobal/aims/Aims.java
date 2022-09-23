package hust.soict.ictglobal.aims;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

import hust.soict.ictglobal.aims.order.*;
import hust.soict.ictglobal.aims.PlayerException;
import hust.soict.ictglobal.aims.media.*;

public class Aims {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int choice2=0;
		Order anOrder = new Order();	
	
		/*
		************Lab8***********

		ArrayList<DigitalVideoDisc> collection = new ArrayList<DigitalVideoDisc>();
		
		//Add the DVD objects to the ArrayList
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King",87,600);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",124,500);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",90,700);
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		dvd1.play();
		dvd2.play();
		dvd3.play();
		
		//Iterate through the ArrayList and output their titles
		// unsorted order
		Iterator<DigitalVideoDisc> iterator = collection.iterator();
		
		System.out.println("------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		//Sort the collection of DVDs - based on the compareTo()
		java.util.Collections.sort((java.util.List)collection);
		
		//Iterate through the ArrayList and output their titles in sorted order
		iterator = collection.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
			
		}
		
		System.out.println("---------------------------------");


		
		ArrayList<CompactDisc> collection2 = new ArrayList<CompactDisc>();
		
		//Add the DVD objects to the ArrayList
		CompactDisc cd1=new CompactDisc("CD1",87,10);
		CompactDisc cd2 = new CompactDisc("CD2",124,5);
		CompactDisc cd3 = new CompactDisc("CD3",90,700);
		collection2.add(cd1);
		collection2.add(cd2);
		collection2.add(cd3);
		cd1.play();
		cd2.play();
		cd3.play();
		
		//Iterate through the ArrayList and output their titles
		// unsorted order
		Iterator<CompactDisc> iterator2 = collection2.iterator();
		
		System.out.println("------------------------------");
		System.out.println("The CDs currently in the order are: ");
		while(iterator2.hasNext()) {
			System.out.println(((CompactDisc)iterator2.next()).getTitle());
		}
		
		//Sort the collection of DVDs - based on the compareTo()
		java.util.Collections.sort((java.util.List)collection2);
		
		//Iterate through the ArrayList and output their titles in sorted order
		iterator2 = collection2.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The CDs in sorted order are: ");
		
		while(iterator2.hasNext()) {
			System.out.println(((CompactDisc)iterator2.next()).getTitle());
			
		}
		
		System.out.println("---------------------------------");
		*/
		
		//**********************Ex5***********
		/*MemoryDaemon memoryDaemon = new MemoryDaemon();
		Thread thread = new Thread(memoryDaemon);
		thread.setDaemon(true);
		thread.start();*/
		
		/*LAB 7 */
		 do {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine(); //Xoa 1 dau enter de tranh bi miss lenh duoi
			
			switch(choice) {
			case 1:
				//Create a new order
				anOrder.create();
				break;
			case 2: 
				System.out.println("Choose the type of new item :\n"
						+"1. Book\n"
						+"2. DigitalVideoDisc\n"
						+"3. CompactDisc");
				System.out.println("Enter your choice: ");
				choice2 = sc.nextInt();
				sc.nextLine();
				
				switch(choice2) {
				
					case 1: 
					//Add book
						anOrder.addMedia(addBook());
						break;
					case 2:
					//add dvd
						anOrder.addMedia(addDvd());
						break;
					case 3: 
					//add cd
						anOrder.addMedia(addCd());
						break;
					default:
						System.out.println("Error! Enter choice again!\n");
						break;
					}
				break;
			case 3:
				//Delete item by id
				System.out.println("Enter id: ");
				sc = new Scanner(System.in);
				String id =sc.nextLine();
				anOrder.removeMe(id);
				anOrder.displayList();
				break;
			case 4:
				//display list
				anOrder.displayList();
				break;
			case 5:
				//totalcost
				anOrder.totalCost();
				break;
			case 0:
				System.out.println("EXIT!");
				break;
			default:
				System.out.println("Invalid!");
				break;
				
			}
		}while(choice!=0);
		
	}
	
	public static void showMenu() {
		System.out.println("\n\n*********************************");
		System.out.println("Order Management Application: ");
		System.out.println("       --------------         ");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("5. Find total cost");
		System.out.println("0. Exit");
		System.out.println("----------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		System.out.println("***********************************\n");
	}
	
	public static Book addBook() {
		System.out.println("Enter id: "); Scanner sc = new Scanner(System.in);
		String id =  sc.nextLine();
		System.out.println("Enter the title: "); String title= sc.nextLine();
		System.out.println("Enter the category: "); String category=sc.nextLine();
		System.out.println("Enter the cost: "); float cost= Float.parseFloat(sc.nextLine());
		System.out.println("Enter the author: "); String author = sc.nextLine();
		
		return new Book("Book",id,title,category, cost, author);
	}
	
	public static DigitalVideoDisc addDvd() {
		System.out.println("Enter id: "); Scanner sc = new Scanner(System.in);
		String id =  sc.nextLine();
		
		System.out.println("Enter the title: "); String title= sc.nextLine();
		System.out.println("Enter the category: "); String category=sc.nextLine();
		System.out.println("Enter the cost: "); float cost= Float.parseFloat(sc.nextLine());
		System.out.println("Enter the director: "); String director = sc.nextLine();
		System.out.println("Enter the length: "); int length = sc.nextInt();
		
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("DVD",id,title,category, cost,director, length);
		
		
		try {
			//DigitalVideoDisc dvd = new DigitalVideoDisc("DVD",id,title,category, cost,director, length);
			dvd.play();
		}catch(PlayerException e) {
			System.err.println("The error: "+e.toString());
			e.printStackTrace();
			
		}
		
		return dvd;
		
	}
	
	

	public static CompactDisc addCd() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id: "); String id =  sc.nextLine();
		System.out.println("Enter the title: "); String title= sc.nextLine();
		System.out.println("Enter the category: "); String category=sc.nextLine();
		System.out.println("Enter the cost: "); float cost= Float.parseFloat(sc.nextLine());
		System.out.println("Enter the artist: "); String artist= sc.nextLine();
		
		CompactDisc cd= new CompactDisc("CD",id,title,category, cost, artist);
		
		System.out.println("How many tracks are there: ");
		int numTrack = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i < numTrack; i++) {
			System.out.println("\n Enter track title: ");
			String titleTrack = sc.nextLine();
			
			System.out.println("Enter track length: ");
			int lengthTrack = Integer.parseInt(sc.nextLine());

			cd.addTrack(new Track(titleTrack,lengthTrack));			
		}		
		try {
			cd.play();
		}catch (PlayerException e) {
			e.printStackTrace();
			System.err.println("The error: "+e.getMessage());
		}
		return cd;
	}
}