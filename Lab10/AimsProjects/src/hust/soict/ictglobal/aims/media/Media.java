package hust.soict.ictglobal.aims.media;

import java.util.Objects;

public abstract class Media {
	protected String id;
	protected String title;
	protected String category;
	protected float cost;


	protected String typeMedia;
	
	public String getTypeMedia() {
		return typeMedia;
	}
	public void setTypeMedia(String typeMedia) {
		this.typeMedia = typeMedia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	//--------constructor------------------
	public Media() {
		
	}
	public Media(String id) {
		this.id= id;
	}
	
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String id,String title, String category, float cost) {
		this(title,category);
		this.cost=cost;
		this.id =id;
	}
	
	public Media(String typeMedia,String id,String title, String category, float cost) {
		this.typeMedia = typeMedia;
		this.id =id;
		this.title= title;
		this.category = category;
		this.cost= cost;
	}
	
 	@Override
	public abstract String toString();
 	
	@Override
	public int hashCode() {
		return Objects.hash(category, cost, id, title);
	}
	
	/*@Override
	public boolean equals(Object obj) { //to support  function 3.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		return  Objects.equals(id, other.id);
	}
	*/
	//public abstract void inputData();	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		if(getClass() != obj.getClass())
			return false;
		if(this== obj)
			return true;
		Media other = (Media ) obj;
		return Objects.equals(getTitle(), other.getTitle()) && Objects.equals(getCost(), other.getCost());
	}
	
	//@Override
	public int compareTo(Media o) {
		/*if(this.getLength()> o.getLength()) {
			return 1;
		}
		if(this.getLength() < o.getLength()) {
			return -1;
		}*/
		if(getTitle().equals(o.getTitle()) && this.getCost()==o.getCost())
			return 0;
		else if(this.getCost()> o.getCost()) {
			return 1;
		}
		if(this.getCost() < o.getCost()) {
			return -1;
		}
		return 0;
	}
	public int compareTo(DigitalVideoDisc o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
