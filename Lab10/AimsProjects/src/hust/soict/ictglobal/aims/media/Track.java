package hust.soict.ictglobal.aims.media;

import hust.soict.ictglobal.aims.PlayerException;

public class Track implements Playable, Comparable<Track> {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public  Track(String title, int length) {
		this.title = title;
		this.length =length;
	}
	@Override
	public void play() throws PlayerException{
		// TODO Auto-generated method stub
		if(this.getLength() <=0) {
			System.err.println("ERROR: DVD Length is 0");
			throw(new PlayerException());
		}
		System.out.println("Playing track: "+ this.getTitle());
		System.out.println("Track length: "+ this.getLength());
	}
	@Override
	public int compareTo(Track o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
