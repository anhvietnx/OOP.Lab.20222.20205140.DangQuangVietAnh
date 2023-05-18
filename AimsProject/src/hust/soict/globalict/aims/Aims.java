package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;




public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart anOrderCart = new Cart();
		
		//create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Aller",87,24.95f);
		anOrderCart.addDigitalVideoDisc(dvd1); //method add (1)
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,19.95f);
		anOrderCart.addDigitalVideoDisc(dvd2); //method add (1)
		
		// only title , category and cost
				DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
				anOrderCart.addDigitalVideoDisc(dvd3); //method add (1)
				
		
		// public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DVD 4",100f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("DVD 5",150f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("DVD 6");
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("DVD 7");
		
		anOrderCart.addDigitalVideoDisc(new DigitalVideoDisc[] {dvd4,dvd5,dvd6,dvd7});
		
		//add by 2 arbitrary
		//public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("DVD 8","Con song que",170f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("The river","Alex");
		
		anOrderCart.addDigitalVideoDisc(dvd8, dvd9);
		
		//
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("DVD 10",100f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("DVD 11",150f);
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("DVD 12");
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("DVD 13");

        anOrderCart.addDigitalVideoDisc(dvd10,dvd11,dvd12,dvd13);
		
		
		
		
		//print total cost of the items in the cart
		System.out.println("Total cost is: ");
		System.out.println(anOrderCart.totalCost());
		
		
		// Xóa một đĩa DVD khỏi giỏ hàng
        anOrderCart.removeDigitalViDeoDisc(dvd2);
        anOrderCart.print_cart();
        
	}

}
