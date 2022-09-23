package hust.soict.ictglobal.aims.media;
import java.util.ArrayList;

import hust.soict.ictglobal.aims.PlayerException;

public class CompactDisc extends Media implements Playable, Comparable<CompactDisc>{
	
	private String artist;
	private int length;
	private ArrayList<Track> tracks = new ArrayList<Track> ();
	private int numTrack;
	
	public int getNumTrack() {
		return numTrack;
	}

	public void setNumTrack(int numTrack) {
		this.numTrack = numTrack;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public CompactDisc() {
		
	}
	public CompactDisc(String title, int length, int numTrack) {
		this.title=title;
		this.length= length;
		this.numTrack= numTrack;
	}
	
	public CompactDisc(String typeMedia,String id,String title, String category, float cost, String artist) {
		super("CD",id,title,category,cost);
		this.artist= artist;
	//	this.category = category;
		//this.cost =cost;
	}
	
	public boolean checkExist(Track track) {
		return this.tracks.contains(track);
	}
	
	public void addTrack(Track track) {
		if(checkExist(track)) {
			System.out.println("The track existed! Enter again");
		}else {
			this.tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if(!checkExist(track)) {
			System.out.println("The track does not exist!");
		}else {
			this.tracks.remove(track);
		}
	}
	
	public int getLength() {
		int totalTrack =0;
		for(int i=0; i< tracks.size();i++) {
			totalTrack+= tracks.get(i).getLength();
		}
		return totalTrack;
	}

	@Override
	public void play() throws PlayerException {
		if(this.getLength() <=0) {
			System.err.println("ERROR: DVD Length is 0");
			throw(new PlayerException());
		}
		System.out.println("\n****PLAY CD****");
		System.out.println("Playing CD: "+this.getTitle());
		System.out.println("CD length: "+this.getLength());
		
		/*for(int i=0; i< tracks.size();i++) {
			tracks.get(i).play();
		}*/
		
		java.util.Iterator iter = tracks.iterator();
		Track nextTrack;
		
		while(iter.hasNext()) {
			nextTrack = (Track)iter.next();
			try {
				nextTrack.play();
			} catch(PlayerException e) {
				System.err.println("The error: "+e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String toString() {
		
		return typeMedia+": id= "+id+ ", title= "+title+ ", category= "+category+", cost= "+cost+ ", length="+getLength()+ ", artist = "+artist;
	}

	@Override
	public int compareTo(CompactDisc o) {
		if(this.getCost()> o.getCost()) {
			return 1;
		}
		if(this.getCost() < o.getCost()) {
			return -1;
		}
		return 0;
	}


}