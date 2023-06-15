package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1", "Category 1", "Director 1", 90, 19.99f);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2", "Category 2", "Director 2", 120, 24.99f);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD 3", "Category 3", "Director 3", 105, 21.99f);
	    
	    DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4");
	    DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5", "Category 5","Director va",100 , 60.f);
	    CompactDisc cd1 = new CompactDisc("đĩa nhạc cổ","âm nhạc","sơn tùng mtp",180,100.5f);
	   
	    
	    store.addMedia(dvd1,dvd2,dvd3,dvd4,dvd5,cd1);
	    store.printStore();              
    }

}
/*Nếu constructor hoặc biến được khai báo là public, thì lớp import có thể truy cập và sử dụng chúng một cách trực tiếp.

Nếu constructor hoặc biến được khai báo là protected hoặc default (không có bất kỳ từ khóa truy cập nào), 
thì lớp import có thể truy cập và sử dụng chúng chỉ khi hai lớp đó cùng thuộc vào gói (package) chung.

Nếu constructor hoặc biến được khai báo là private, thì lớp import không thể truy cập và sử dụng chúng trực tiếp.*/
