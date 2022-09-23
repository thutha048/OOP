
public class Order {
	//--------------------------
	public static final int MAX_NUMBERS_ORDERS =10; //numofDVD
	private int qtyOrdered=0; //numDvds in each order 
	public static final int MAX_LIMITTED_ORDERS =5; //limit numofOrders per user
	private static int nbOrders = 0; //numOrders
	//-------------------------
		
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERS];

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public static int getNbOrders() {
		return nbOrders;
	}

	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}

	public  void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(nbOrders > MAX_LIMITTED_ORDERS)
			System.out.println("Can not exceed max number of orders!\n");
		else if(qtyOrdered >MAX_NUMBERS_ORDERS){
			System.out.println("Can not exceed max number of items!\n");
		}else {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
		}
	//	System.out.println(qtyOrdered);
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
			int newSize = dvdList.length;
			if( newSize > MAX_NUMBERS_ORDERS) 
			{
				System.out.println("The number of input items is "+ newSize);
				System.out.println("Error! The number of items can not exceed "+MAX_NUMBERS_ORDERS);
			}else if(nbOrders > MAX_LIMITTED_ORDERS)
				System.out.println("Can not exceed max number of orders!\n");
			else{
				int j=0;
				for(int i=qtyOrdered;i<newSize;i++) {
					itemsOrdered[i]= dvdList[j];
					j++;
					qtyOrdered++;
					if(j>dvdList.length) {
						//System.out.println("The order is almost full! Cannot add more!");
						System.out.println(qtyOrdered);
						break;
					}
				}
			} 
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(MAX_NUMBERS_ORDERS- qtyOrdered >=1) {
			itemsOrdered[qtyOrdered++] = dvd1;
		}
		if(MAX_NUMBERS_ORDERS- qtyOrdered >=1) {
			itemsOrdered[qtyOrdered++]=dvd2;
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		System.out.println("Remove item:  "+ disc.getTitle());
		int check=0;
		for(int i=0; i< qtyOrdered; i++) {
		//	System.out.println("qty = "+ qtyOrdered+ "items : "+ itemsOrdered[i].getTitle());
			if(disc.equals (itemsOrdered[i])){
				check=1;
				itemsOrdered[i]=itemsOrdered[i+1];
				qtyOrdered--;
				}
		}
		
		if(check==0) {
			System.out.println("The items does not exist in this order!\n");
		}else {
			System.out.println("Item:  "+disc.getTitle()+" has been removed.\n");
		}
	}
	
	public float totalCost() {
		if(nbOrders >= MAX_LIMITTED_ORDERS)
			return 0;
		float tCost=0;
		for(int i=0;i<qtyOrdered; i++) {

				//	System.out.println("Cost = "+itemsOrdered[i].getCost());
					tCost+= itemsOrdered[i].getCost();
		}
		nbOrders++; //increase the number of orders
		//qtyOrdered=0; //set number of dvds in the new order =0
		return tCost;
	}

	public void createNewOrder() {
		qtyOrdered=0;
		if(nbOrders >= MAX_LIMITTED_ORDERS) {
			System.out.println("Can not exceed max number of orders!\n");
		}
	}
	//-----------------------
	//instance variable
	private String dateOrdered;
	public String getDateOrdered() {
		return dateOrdered;
	}
	
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	

			
	public void print(String date) {
		if(nbOrders >= MAX_LIMITTED_ORDERS ||  itemsOrdered.length >MAX_NUMBERS_ORDERS )
			System.out.printf("\n");
		else {
			System.out.println("******************************Order*******************************");
			System.out.println("Date: "+date);
			System.out.println("Ordered Items: ");
			for(int i=0;i< qtyOrdered;i++) {
				System.out.println((i+1)+". DVD - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+" : "+ itemsOrdered[i].getCost()+"$ \n");
			}
			System.out.println("Total cost: "+totalCost()+"$");
			
			System.out.println("******************************************************************\n");
		}
		
	}
	
}
