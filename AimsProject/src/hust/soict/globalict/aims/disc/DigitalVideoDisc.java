package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0; // Class attribute
	private int id;  // Instance attribute
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
		if(length < 0) {
			this.length = 0;
		}
		else {
			this.length = length;
		}
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		if(cost < 0) {
			this.cost = 0.0f;
		}
		else {
			this.cost = cost;
		}		
	}
	
	public int getId() {
		return id;
	}
	public DigitalVideoDisc() {
		this.id = nbDigitalVideoDiscs++;
		this.title ="";
		this.category ="";
		this.director = "";
		this.length = 0;
		this.cost = 0.0f;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	

	public DigitalVideoDisc(String title, float cost) {
		super();
		this.id = nbDigitalVideoDiscs++;
		this.title = title;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
	    return String.format("%2d.DVD - %-20s - %-15s - %-15s - %-6d : %.2f $%n", id, title, category, director, length, cost);
	}

	
	public boolean isMatch(String title) {
		if (this.getTitle().equals(title)) {	
		return true;
		}
		else return false;
	}
	public void show() {
		System.out.println("id: "+id);
		System.out.println("Title: "+title);
		System.out.println("Category: "+category);
		System.out.println("Director: "+director);
		System.out.println("Length: "+length);
		System.out.println("Cost "+ cost);
	}
	
	
	
	

}
