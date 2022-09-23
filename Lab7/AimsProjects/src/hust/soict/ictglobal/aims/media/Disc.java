package hust.soict.ictglobal.aims.media;

public class Disc extends Media{
	protected int length;
	protected String director;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Disc(String typeMedia,String id,String title, String category, float cost,String director, int length) {
		super(typeMedia,id,title,category,cost);
		this.director = director;
		this.length = length;
	}
	
	public Disc(String typeMedia,String id,String title, String category, float cost,int length)
	{
		super(typeMedia,id,title,category,cost);
		this.length =length;
	}
	
	public Disc() {
		super();
	}
	
	public Disc(String title, String category) {
		super(title, category);
	}
	public Disc(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		
		return "Disc: id= "+id+ ", title= "+title+ ", category= "+category+", cost= "+cost+ ", length="+length;
	}
	
	
	
}
