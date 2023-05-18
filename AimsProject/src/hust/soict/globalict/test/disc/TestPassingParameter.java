package hust.soict.globalict.test.disc;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		System.out.println("Before swap:");
	    System.out.println("jungleDVD: " + jungleDVD.getTitle());
	    System.out.println("cinderellaDVD: " + cinderellaDVD.getTitle());
	    
	    DigitalVideoDisc[] dvdarray = {jungleDVD,cinderellaDVD};
	   
		swapp_active(dvdarray, 0, 1);
		// assign again
		jungleDVD = dvdarray[0]; cinderellaDVD = dvdarray[1];
		
		System.out.println("After swap:");
		System.out.println("jungleDVD: " + jungleDVD.getTitle());
		System.out.println("cinderellaDVD: " + cinderellaDVD.getTitle());
	    
		
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;		
	}
	
	 
	public static void swapp_active(DigitalVideoDisc[] disc ,int index1,int index2) {
		DigitalVideoDisc tmp = disc[index1];
		disc[index1] = disc[index2];
		disc[index2] = tmp;
		return;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitleString = dvd.getTitle();
		dvd.setTitle(title); // it effect on jungle dvd
		dvd = new DigitalVideoDisc(oldTitleString); // dvd is no longer point to jungle dvd  , but jungle dvd still exist
		}

}
