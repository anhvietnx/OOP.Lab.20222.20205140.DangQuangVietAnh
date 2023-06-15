package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class Media {

	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	//test sort in Class TestSort
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	protected static int numberMedia = 0 ;

	public Media(int id, String title, String category, float cost) {		
		this. title = title;
		this.category = category;
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	public Media() {
        // Constructor không tham số của lớp Media
        // Khởi tạo giá trị mặc định cho các thuộc tính
        
        this.title = "";
        this.category = "";
        this.cost = 0.0f;
    }
	
	public Media(String title) {
		this.title = title;
		
	}
	public Media(String title, String category) {
		this(title);
		this.category = category;
		
	}
	public Media(String title, String category, float cost) {
		this(title,category);
		this.cost = cost;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	//+ For the Media class: the title is equal
	@Override 
	public boolean equals(Object obj) {
	    if (this == obj) { // cùng tham chiếu tới 1 địa chỉ
	        return true;
	    }
	    if (obj == null || this.getClass() != obj.getClass()) { // kiểm tra xem có rỗng hay không , và xem có thuộc cùng 1 class hay không
	        return false;
	    }
	    Media otherMedia = (Media) obj;
	    return this.title.equals(otherMedia.title);
	}

	
	

}
