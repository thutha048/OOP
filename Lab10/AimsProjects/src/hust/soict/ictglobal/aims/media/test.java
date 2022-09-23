package hust.soict.ictglobal.aims.media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test {
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	public test(){
	}

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

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("This name existed! Not add more!");
		}else {
			authors.add(authorName);
		}
		
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}else {
			System.out.println("This name doesn't exist in list! Can't remove!");
		}
	}
	
}




















/*
List<Media> listMe = new ArrayList<Media>();

CompactDisc cd = new CompactDisc("CD","1","C title", "C category", 3,"Artist1");
cd.addTrack(new Track("C title", 3));
cd.addTrack(new Track("C_title", 3));
listMe.add(cd);

cd = new CompactDisc("2","C2title", "C2category", "C2director", 9,"Artist2");
cd.addTrack(new Track("C2title", 8));
cd.addTrack(new Track("C2title", 10));
listMe.add(cd);

listMe.add(new DigitalVideoDisc("DVD","d1","B title", "B category",10, "B diretor", 2 ));
listMe.add(new DigitalVideoDisc("DVD","d2","A title", "A category",20, "A director", 1));


Iterator iterator3 = listMe.iterator();

System.out.println("--------------------------------------");
System.out.println("The DVDS currently in the order are: ");

while(iterator3.hasNext()) {
	Media md = (Media)iterator3.next();
	
	System.out.println("Title: " + md.getTitle()
			+ "   Cost: " + md.getCost());
}


Collections.sort((List)listMe);

iterator3 = listMe.iterator();
System.out.println("---------------------------------------");
System.out.println("The DVDs in sorted order are: ");

while(iterator3.hasNext()) {
	Media md = (Media)iterator3.next();
	
	System.out.println("Title: " + md.getTitle()
			+ "   Cost: " + md.getCost());
}

System.out.println("---------------------------------------");

*/