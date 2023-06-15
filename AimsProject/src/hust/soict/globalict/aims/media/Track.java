package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private int length;
	private String title;
	
	//Constructor
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}
	//Implement play() for DigitalVideoDisc and Track
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}
	//For the Track class: the title and the length are equal
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { // cùng tham chiếu tới 1 đối tượng
			return true;
		}
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Track otherTrack = (Track) obj;
			return (this.getTitle().equals(otherTrack.title) && this.getLength() == otherTrack.length);
		/*if(this.getTitle() == otherTrack.title && this.getLength() == otherTrack.length) {
			return true;
		}
		return false;*/		
	}
	
	//9/6/2023 overide toString
	@Override
	public String toString() {
		return "Track : " + title +" Length " + length;
	}
}
