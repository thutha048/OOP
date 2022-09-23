package store;

//import hust.soict.ictglobal.aims.media.Media;

public class Media {
	private String title;
	private String category;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}


//order class

 /*	public void addMedia(String title, String category, float cost) {
		Media media = new Media(title, category, cost);
		if(itemsOrdered.contains(media)) {
			System.out.println("This media existed!");
		}else {
			itemsOrdered.add(media);
		}
	}*/

/*	public void printMedia() {
		System.out.println("The list media: ");
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.print(itemsOrdered.get(i)+"\n");
		}
	}
 
 public void removeMedia(String id,String title, String category, float cost) {
		Media media = new Media(id,title, category, cost);
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The list after remove "+media+ " is:\n");
			displayList();
		}else {
			System.out.println("This media doesn't exist!");
		}
	}
 */
