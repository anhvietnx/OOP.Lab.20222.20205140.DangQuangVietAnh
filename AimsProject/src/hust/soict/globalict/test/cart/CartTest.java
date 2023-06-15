package hust.soict.globalict.test.cart;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart anOrderCart = new Cart();
		
		//CartTest anOrderCart = new CartTest(); không thể dùng vì trong CartTest không có những hàm như add rồi search ...
		
		//create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Aller",87,24.95f);
		anOrderCart.addMedia(dvd1); //method add (1)
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,19.95f);
		anOrderCart.addMedia(dvd2); //method add (1)
		
		// only title , category and cost
				DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation");
				anOrderCart.addMedia(dvd3); //method add (1)
				
		
		// public void addMedia(DigitalVideoDisc[] dvdList) {
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5");
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD 6");
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD 7");
		
		anOrderCart.addMedia(new DigitalVideoDisc[] {dvd4,dvd5,dvd6,dvd7});
		
		//add by 2 arbitrary
		//public void addMedia(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("DVD 8","Con song que","Thuy Linh",100,170f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("The river","Alex");
		
		anOrderCart.addMedia(dvd8, dvd9);
		
		//
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("DVD 10","Music");
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("DVD 11","Film");
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("DVD 12");
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("DVD 13");

        anOrderCart.addMedia(dvd10,dvd11,dvd12,dvd13);
		
     // Xóa một đĩa DVD khỏi giỏ hàng
        anOrderCart.removeMedia(dvd2);
				
		//print total cost of the items in the cart
		System.out.println("Total cost is: ");
		System.out.println(anOrderCart.totalCost());
		
		// test print method
        anOrderCart.printCart();
        
        //To-do test search by id method
        anOrderCart.filterByID(3);
        //To do test search by title
        anOrderCart.filterByTitle("The Lion King");
        
	}


}
