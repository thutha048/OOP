package hust.soict.ictglobal.aims;
import hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.*;

public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd[] = new DigitalVideoDisc[3];
		String key = "Star Wars";
		boolean kq;
		String[] listTitle = new String[3];

		dvd[0] = new DigitalVideoDisc("Roger Allers", "Animation", "The Lion King", 87, 19.95f);
		dvd[1] = new DigitalVideoDisc("George Lucas", "Science Fiction", "Star Wars", 124, 24.95f);
		dvd[2] = new DigitalVideoDisc("John Musker", "Animation", "Aladdin", 90, 18.99f);

		/*
		 * anOrder.setDateOrdered("24/04/2022"); anOrder.print(
		 * anOrder.getDateOrdered(), dvd); System.out.print("Total Cost is: ");
		 * System.out.println(anOrder.totalCost());
		 */

		key = key.toLowerCase();
		System.out.println("Substr is " + key);

		for (int i = 0; i < dvd.length; i++) {
			// listTitle[i]= dvd[i].getTitle();
			listTitle[i] = dvd[i].getTitle().toLowerCase();
			System.out.println("title[" + i + "] = " + listTitle[i]);
			kq = listTitle[i].contains(key);
			System.out.println("ANS = " + kq);
		}

		System.out.println("Next\n");

		for (int i = 0; i < listTitle.length; i++) {
			listTitle[i] = listTitle[i].toLowerCase();
			kq = listTitle[i].contains(key);
			System.out.println("ANS = " + kq);
		}

		/*
		 * kq= DigitalVideoDisc.search(key,listTitle); if(kq==true) {
		 * System.out.println(key+" exist in list\n"); }else {
		 * System.out.println(key+" doesn't exit!"); }
		 * 
		 * }
		 */
	}

}