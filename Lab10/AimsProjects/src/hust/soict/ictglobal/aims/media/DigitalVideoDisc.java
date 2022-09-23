package hust.soict.ictglobal.aims.media;
import hust.soict.ictglobal.aims.*;

public class DigitalVideoDisc extends Media implements Playable, Comparable<DigitalVideoDisc>{
//	private String director;
	//private int length;
	private String[] items = new String[100];
	protected int length;
	protected String director;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public DigitalVideoDisc(String title, int length, float cost) {
		this.title=title;
		this.length=length;
		this.cost= cost;
		
	}

	public DigitalVideoDisc(String category, String title) {
		super();
		this.category = category;
		this.title = title;

	}

	public DigitalVideoDisc(String director, String category, String title) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
	}

	public DigitalVideoDisc(String typeMedia,String id,  String title,String category,  float cost,  String director,int length) {
		super("DVD",id,title,category,cost);
		this.length = length;
		this.director = director;
		/*this.category = category;
		this.title = title;
		this.length = length;
		this.cost = cost;*/
	}

	//***********************
	public static boolean search(String substr, String[] title) {
		substr = substr.toLowerCase();
		boolean ans = true;
		int num = 0; // num is num of words of substr
		String[] words = substr.split("\\s");

		for (String w : words) {
			num++;
		}
		// System.out.println("Num= "+num);
		int exist[] = new int[num]; // array assigns existence of each words
		for (int i = 0; i < num; i++) {
			exist[i] = 0;
		}

		for (int i = 0; i < title.length; i++) {
			title[i] = title[i].toLowerCase();
			String key[] = title[i].split("\\s");
			int j = 0; // j la so thu tu cua tung word trong substr

			for (String w : words) {
				for (String k : key) {
					if (w.equals(k)) {
						exist[j] = 1;
						break;
					}
				}
				j++;
			}
		}

		for (int k = 0; k < num; k++) {
			if (exist[k] == 0) {
				ans = false;
				break;
			}
		}
		return ans;

	}
//Check length of dvd <=0 then error.
	@Override
	public void play() throws PlayerException{
	// TODO Auto-generated method stub
		if(this.getLength() <=0) {
			System.err.println("ERROR: DVD Length is 0");
			throw(new PlayerException());
		}
		System.out.println("\n****PLAY DVD****");
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
		System.out.println("DVD cost: "+this.getCost());
	}

	@Override
	public String toString() {
		return typeMedia+ ": id= "+id+", title= "+title+", category= "+category+", cost= "+cost+", director= "+director+", length= "+length;
	}

	@Override
	public int compareTo(DigitalVideoDisc o) {
		/*if(this.getLength()> o.getLength()) {
			return 1;
		}
		if(this.getLength() < o.getLength()) {
			return -1;
		}*/
		if(this.getCost()> o.getCost()) {
			return 1;
		}
		if(this.getCost() < o.getCost()) {
			return -1;
		}
		return 0;
	}
}