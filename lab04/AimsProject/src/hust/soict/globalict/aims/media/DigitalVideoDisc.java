package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	//private int id;  // Instance attribute
	//private String title;
	//private String category;
	private String director;
	private int length;
	//private float cost;
	
	//private static int nbDigitalVideoDiscs = 0; // Class attribute
	
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
		if(length < 0) {
			this.length = 0;
		}
		else {
			this.length = length;
		}
	}

	public DigitalVideoDisc() {
		super();	   
		this.id = ++numberMedia;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;	
		this.id = ++numberMedia;
		
	}
	
	public DigitalVideoDisc(String title, String category) {		
		this(title);
		this.category = category;
		
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		this(title,category);
		this.director = director;
	
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length) {
		this(title,category,director);
		this.length = length;
	
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {

		this(title,category,director,length);
		this.cost = cost;
	
	}
	
	
	@Override
	public String toString() {
	    return String.format("%2d.DVD - %-20s - %-15s - %-15s - %-6d : %.2f $%n", id, title, category, director, length, cost);
	}
	
	public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }

	public void show() {
		System.out.println("id: "+id);
		System.out.println("Title: "+title);
		System.out.println("Category: "+category);
		System.out.println("Director: "+director);
		System.out.println("Length: "+length);
		System.out.println("Cost "+ cost);
	}
	
	//28/05/24
	//Implement play() for DigitalVideoDisc and Track
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	
	
	

}
