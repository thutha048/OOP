package hust.soict.ictglobal.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hust.soict.ictglobal.aims.media.*;

public class Book extends Media implements Comparable<Book>{

	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String,Integer> wordFrequency = new HashMap<String,Integer>();
	private List<String> authors = new ArrayList<String>();
	private String author ;
	
	public Book() {
	
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book (String title, String category) {
		super(title,category);
	}
	
	public Book(String typeMedia,String id, String title, String category,float cost, List<String> authors) {
		super("BOOK ",id,title, category,cost);
		this.authors= authors;
	}
	
	public Book(String typeMedia,String id,String title, String category, float cost, String author) {
		super("BOOK ",id,title, category,cost);
		this.author= author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	//check empty or not
	
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

//	@Override
//	public String toString() {
		
//		return typeMedia+ ": id= "+id+ ", title= "+ title+ ", category= "+category+ ", cost= "+cost+", author= "+author;
//	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
//	public void inputData() {
		// TODO Auto-generated method stub
		
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		processContent();
	}
	
	public void processContent() {
		String[] arr = content.split(" ");
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			contentTokens.add(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			int freq = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) == 0)
					freq++;
			}
			wordFrequency.put(arr[i], freq);
		}
		
	}
	
	public String toString() {
		String infor = typeMedia+ ":\nId= "+id
		+ "\nTitle: " + getTitle() 
		+ "\nCategory: " + getCategory() 
		+ "\nCost: "+ getCost()
		+"\nAuthor: "+getAuthor()
		+ "\nContent: " + getContent()
		+ "\nToken length: " + contentTokens.size()
		+ "\nWord frequency: \n";

		for(Map.Entry<String, Integer> e : wordFrequency.entrySet()) {
			infor = infor + e.getKey() + " - " + e.getValue() + "\n";
		}

		return infor;
	}
	
	
}
