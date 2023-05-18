package hust.soict.globalict.test.store.copy;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store(5);
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1", "Category 1", "Director 1", 90, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2", "Category 2", "Director 2", 120, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD 3", "Category 3", "Director 3", 105, 21.99f);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4", 50.55f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5", "Category 5" , 60.f);	
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD 6", 80.55f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD 7", "Category 7" , 90.f);	
        
        store.addDVD(dvd1,dvd2,dvd3,dvd4,dvd5,dvd6,dvd7);
        store.print_store();
       
        
        
    
        }

}
