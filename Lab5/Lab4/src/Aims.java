
public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc order1[]= new DigitalVideoDisc[3];
		DigitalVideoDisc order2[]= new DigitalVideoDisc[2];
		
		//order1
		order1[0]= new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		order1[1]= new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f);		
	    order1[2]= new DigitalVideoDisc("Aladdin","Animation","John Musker",90, 18.99f);
	   

		anOrder.createNewOrder();
	    anOrder.addDigitalVideoDisc(order1);
		anOrder.setDateOrdered("24/04/2022");
		anOrder.print( anOrder.getDateOrdered());
		
		//order2
		order2[0]= new DigitalVideoDisc("The Tiger","Animation","K.A",100,20.0f);
		order2[1]= new DigitalVideoDisc("Sun","Science Fiction","L.A",200,25.5f);		
		
		anOrder.createNewOrder();
		anOrder.addDigitalVideoDisc(order2);
	    anOrder.setDateOrdered("24/06/2022");
		anOrder.print( anOrder.getDateOrdered());
		
		//order3
		anOrder.createNewOrder();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The King");
		dvd1.setCategory("Animation");
		dvd1.setCost(100f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
	
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sunny");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(80f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Anna");
		dvd3.setCategory("Animation");
		dvd3.setCost(90f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.setDateOrdered("25/06/2022");
		anOrder.print(anOrder.getDateOrdered());
		//***Remove order1[0] from order3
		anOrder.removeDigitalVideoDisc(order1[0]);
		
		//***Remove dvd2 from order3
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.print(anOrder.getDateOrdered());
		
		
		}
}

