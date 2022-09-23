package store;


import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
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
