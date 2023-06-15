package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;



public class Book extends Media {

		// TODO Auto-generated constructor stub
		/*private int id ; 
	    private String title;
	    private String  category;
	    private float cost;*/ // kế thừa từ Media
	    private List<String> authorList = new ArrayList<String>();
	    
	    public Book( String title, String category, float cost,List<String> authorList ) {
	    	super(title, category, cost); // Invoke the constructor of the Media class
	        this.authorList = authorList;
	        this.id = ++numberMedia;
	    }
	    public Book(String title, String category,float cost) {
	    	super(title,category,cost);
	    	this.id = ++numberMedia;    	
	    }
	    

		public List<String> getauthorList() {
			return authorList;
		}

		public void setauthorList(List<String> authorList) {
			this.authorList = authorList;
		}
		public void addauthorList(String authorName) {
			if(!authorList.contains(authorName)) {
				authorList.add(authorName);
				System.out.println("Author added " + authorName);
			}
			else {
				System.out.println("Author already exist: "+ authorName);
			}
		}
		public void removeauthorList(String authorName) {
			if(!authorList.contains(authorName)) {
				authorList.remove(authorName);
				System.out.println("Author removed: " + authorName);
			}
			else {
				System.out.println("Author not exist in list:" + authorName);
			}
		}
		//08-06-2023
		@Override
		public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append(String.format("%2d.Book - %-20s - %-15s - %.2f $%n", id, title, category, cost));
		    sb.append("Authors: ");
		    for (String author : authorList) {
		        sb.append(author).append(", ");
		    }
		    if(authorList.size()>0) {
		    	sb.delete(sb.length() - 2, sb.length()); // Xóa dấu ',' cuối cùng
		    }
		    
		    sb.append("\n");
		    return sb.toString();
		}

	

}
