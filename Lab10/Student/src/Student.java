//import hust.soict.ictglobal.aims.PlayerException;

public class Student {
	private String ID;
	private String name;
	private String birthday;
	private float gpa;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public Student(String ID, String name,String birthday, float gpa) {
		this.ID= ID;
		this.name = name;
		this.birthday= birthday;
		this.gpa = gpa;
	}
	
	
	
}
