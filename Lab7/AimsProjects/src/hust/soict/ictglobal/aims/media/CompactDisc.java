package hust.soict.ictglobal.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Media implements Playable{
	
	private String artist;
	//private int length;
	private ArrayList<Track> tracks = new ArrayList<Track> ();
	
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public CompactDisc() {
		
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
	public void play() {
		System.out.println("\n****PLAY CD****");
		for(int i=0; i< tracks.size();i++) {
			tracks.get(i).play();
		}
	}
	
	@Override
	public String toString() {
		
		return typeMedia+": id= "+id+ ", title= "+title+ ", category= "+category+", cost= "+cost+ ", length="+getLength()+ ", artist = "+artist;
	}
	
}
