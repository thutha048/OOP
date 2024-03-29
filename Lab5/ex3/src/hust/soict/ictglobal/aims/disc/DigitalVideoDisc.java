package hust.soict.ictglobal.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private String[] items = new String[100];

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

	public DigitalVideoDisc(String director, String category, String title, int length, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.length = length;
		this.cost = cost;
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
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

		/*
		 * if(ans =true) { System.out.println("It exists!\n"); }else {
		 * System.out.println("Not exist!\n"); }
		 */

		return ans;
	}

}
