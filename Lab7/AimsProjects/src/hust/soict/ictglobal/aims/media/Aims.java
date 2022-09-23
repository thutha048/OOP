package hust.soict.ictglobal.aims.media;

import java.util.Scanner;

import java.util.ArrayList;

import hust.soict.ictglobal.aims.order.*;
import hust.soict.ictglobal.aims.media.*;

public class Aims {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		int choice2=0;
		Order anOrder = new Order();	
		//**********************Ex5***********
		MemoryDaemon memoryDaemon = new MemoryDaemon();
		Thread thread = new Thread(memoryDaemon);
		thread.setDaemon(true);
		thread.start();
		
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
		
		dvd.play();
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
		cd.play();
		return cd;
	}
}
