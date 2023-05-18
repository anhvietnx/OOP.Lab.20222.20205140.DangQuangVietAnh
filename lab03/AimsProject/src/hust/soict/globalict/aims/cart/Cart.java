package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; 
			//Add a field as an array to store a list of DigitalVideoDisc.
	private  int qtyOrdered = 0 ;
	
	//method add (1)
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}
		else if (this.qtyOrdered == (MAX_NUMBERS_ORDERED -1)) {
			System.out.println("The cart is almost full");			
		}
		else {
			this.itemsOrdered[qtyOrdered ] = disc;
			qtyOrdered += 1;
			System.out.println(("The disc " + disc.getTitle() +" have been added"));
			System.out.println("Current disc: "+ qtyOrdered);
		}
	}
	
	//add by 2 arbitrary
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
			if (MAX_NUMBERS_ORDERED- this.qtyOrdered < 2) {
				System.out.println("The cart is full");
			}
			/*else if(this.qtyOrdered == MAX_NUMBERS_ORDERED  - 2) {
				System.out.println("The cart is almost full");
				this.itemsOrdered[qtyOrdered] = dvd1; 
				qtyOrdered += 1 ; 
				System.out.println("The disc "+ dvd1.getTitle()+ " have been added");
				System.out.println("Current disc: "+ qtyOrdered);
				
				this.itemsOrdered[qtyOrdered] = dvd2; 
				qtyOrdered += 1 ; 
				System.out.println("The disc " + dvd2.getTitle() +" have been added");
				System.out.println("Current disc: "+ qtyOrdered);
			}*/
			else {
				this.itemsOrdered[qtyOrdered] = dvd1; 
				qtyOrdered += 1 ; 
				System.out.println("The disc "+ dvd1.getTitle()+ " have been added");
				System.out.println("Current disc: "+ qtyOrdered);
				
				this.itemsOrdered[qtyOrdered] = dvd2; 
				qtyOrdered += 1 ; 
				System.out.println("The disc " + dvd2.getTitle() +" have been added");
				System.out.println("Current disc: "+ qtyOrdered);
			}
		}
//12/5 start	
	//method cart 12/5/2023
	/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
	    int totalDiscsToAdd = dvdList.length;
	    int spaceAvailable = MAX_NUMBERS_ORDERED - qtyOrdered;

	    if (totalDiscsToAdd > spaceAvailable) {
	        System.out.println("Not enough space in the cart to add all the discs.");
	        System.out.println("Please remove some discs before adding more.");
	        return;
	    }

	    for (int i = 0; i < totalDiscsToAdd; i++) {
	        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
	            System.out.println("The cart is full.");
	            break;
	        }

	        itemsOrdered[qtyOrdered] = dvdList[i];
	        qtyOrdered++;
	        System.out.println("The disc  has been added.");
	    }

	    System.out.println("Current number of discs in the cart: " + qtyOrdered);
	}
	*/
	
	

	//add by n arbitrary , this what is include addDigitalVideoDisc(DigitalVideoDisc[] dvdList , we only need this
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	    int totalDiscsToAdd = dvds.length;
	    int spaceAvailable = MAX_NUMBERS_ORDERED - qtyOrdered;

	    if (totalDiscsToAdd > spaceAvailable) {
	        System.out.println("Not enough space in the cart to add all the discs.");
	        System.out.println("Please remove some discs before adding more.");
	        return;
	    }

	    for (int i = 0; i < totalDiscsToAdd; i++) {
	        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
	            System.out.println("The cart is full.");
	            break;
	        }

	        itemsOrdered[qtyOrdered] = dvds[i];
	        qtyOrdered++;
	        System.out.println("The disc " + dvds[i].getTitle() +" has been added.");
	    }

	    System.out.println("Current number of discs in the cart: " + qtyOrdered);
	}

	
	// search 12/05
	/*public void searchForDVDByTitle(String title) {
	boolean check = false;
	for (int i = 0; i < qtyOrdered ; ++i) {
		if () {
			itemOrdered[i].show();
			check = true;
		}
	}
	if (check = false) {
		System.out.println("no match is found");
	}
}*/
	

	

	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void removeDigitalViDeoDisc(DigitalVideoDisc disc) {
	    boolean removed = false;
	    
	    if (qtyOrdered == 0) {
	        System.out.println("There is no disc inside cart");
	    } else {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (this.itemsOrdered[i] == disc) {
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                removed = true;
	                break;
	            }
	        }
	        
	        if (removed) {
	            qtyOrdered--;
	            System.out.println("The disc  has been removed");
	            System.out.println("Total disc: " + this.qtyOrdered);
	        } else {
	            System.out.println("No disc found");
	        }
	    }
	}
	//18/05023 search
	public void searchForDVDbyid(int id) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].getId() == id) {
	            System.out.println("Match found:");
	            itemsOrdered[i].show();
	        	System.out.println("**************************************************");

	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No match found for ID: " + id);
	    }
	}

	public void searchForDVDbyTitle(String title) {
		boolean found = false;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
	            System.out.println("Match found:");
	            itemsOrdered[i].show();
	        	System.out.println("**************************************************");
	        	found = true;		
			}
		}
		if(!found) {
			System.out.println("No match found for title: " + title);
		}
	}

	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	public void show_cart() {
		for(int i = 0; i < qtyOrdered; i++) {
			itemsOrdered[i].show();
		}
	}
	
	public void print_cart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		
		System.out.printf("%-6s - %-20s - %-15s - %-15s - %-4s : %-2s $%n","id","title","category","director","length","cost");
		// Iterate over the ordered items in the cart
		for(int i = 0; i < qtyOrdered; i++) {
			DigitalVideoDisc dvd = itemsOrdered[i];
			System.out.println(dvd.toString());
						
		}
		float total = totalCost();
		System.out.println("");
		System.out.println("Total cost: " + total);
		System.out.println("**************************************************");		
		System.out.println("");
		
	}

}