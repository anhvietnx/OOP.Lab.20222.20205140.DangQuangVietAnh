package hust.soict.globalict.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Media;

public class Store {
	//create array to store
	//private DigitalVideoDisc[] itemsInStore;
	
	
	public Store(){
	}
	//28/5/23 Update the Store class to work with Media
	
	/*Similar to the Cart class, change the itemsInStore[] attribute of the Store class to
	ArrayList<Media> type.*/
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	/*Replace the addDigitalVideoDisc() and removeDigitalVideoDisc() methods with
	addMedia() and removeMedia()*/
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println("Added " + media.getTitle() + " to the store !");
		System.out.println("Number of items in the store: " + itemsInStore.size());
	}
	
	public void addMedia(Media...medias) {
		for(Media media : medias) {
			itemsInStore.add(media);
			System.out.println("Added " + media.getTitle() +" in the store !");
		}
		System.out.println("Number of items in store: " + itemsInStore.size());
	}
	public void removeMedia(Media media) {
		itemsInStore.remove(media);
		System.out.println("Removed: " + media.getTitle());
		System.out.println("Number of items in store " + itemsInStore.size());
	}
	public void removeMedia(Media...medias) {
		for(Media item : medias) {
			itemsInStore.remove(item);
			System.out.println("Removed: " + item.getTitle());
		}
		System.out.println("Number of items in store " + itemsInStore.size());
	}
	
	public void printStore() {
		 System.out.println("***********************STORE***********************");
	     System.out.println("Items in the store:");
	     
	     for(Media media : itemsInStore) {
	    	 System.out.println(media.toString());
	     }
	     System.out.println("**************************************************");
	     System.out.println("");
		
	}
	
	
	public List<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void setItemsInStore(List<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	
	public Media searchByTitle(String title) {
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getTitle().equals(title)) {
                
                return itemsInStore.get(i);
            }
        }
        System.out.println("No match found!");
        return null;
	}
	
	
	/*
	public void addDVD(DigitalVideoDisc dvd) {
		// TODO Auto-generated method stub
		if(count >= itemsInStore.length) {
			System.out.println("The store is full !");
			return;
		}
		
		itemsInStore[count] = dvd;
		count++;
		System.out.println("DVD " + dvd.getTitle() + " has been added to the stor !");
	} 
	
	public void addDVD(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc dvd : dvds) {
	        if (count < itemsInStore.length) {
	            itemsInStore[count] = dvd;
	            count++;
	            System.out.println("DVD added: " + dvd.getTitle());
	        } else {
	            System.out.println("Store is full, cannot add more DVDs.");
	            break;
	        }
	    }	   
	}
	
	/*Trong trường hợp của chúng ta, dvds là một mảng các đối tượng DigitalVideoDisc.
	 Với cú pháp for (DigitalVideoDisc dvd : dvds), chúng ta tạo một biến dvd kiểu DigitalVideoDisc 
	 để lặp qua từng phần tử trong mảng dvds. Trong mỗi lần lặp, biến dvd sẽ lưu giữ giá trị của phần tử tương ứng trong mảng.

	Ví dụ, nếu bạn gọi addDVD(dvd1, dvd2, dvd3), thì trong phương thức addDVD, vòng lặp for-each sẽ thực hiện các lần lặp như sau:
	
	Lần lặp thứ nhất: dvd sẽ có giá trị của dvd1.
	Lần lặp thứ hai: dvd sẽ có giá trị của dvd2.
	Lần lặp thứ ba: dvd sẽ có giá trị của dvd3.
	public void removeDVD(DigitalVideoDisc dvd) {
		boolean remove = false;
		
		for(int i = 0; i < count; i++) {
			if(itemsInStore[i] == dvd) {
				for(int j = i; j < count -1; j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				count--;
				remove = true;
				break;
			}
		}
		
		if(remove) {
			System.out.println("DVD " + dvd.getTitle() +" has been removed");
		}
		else {
			System.out.println("not found DVD " + dvd.getTitle() +" in the store");
		}		
	}
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < count; i++) {
			total += itemsInStore[i].getCost();
		}
		return total;
	}
	
	public void print_store() {
		System.out.println("***********************STORE***********************");
		System.out.println("Ordered Items: ");
		
		System.out.printf("%-6s - %-20s - %-15s - %-15s - %-4s : %-2s $%n","id","title","category","director","length","cost");
		// Iterate over the ordered items in the cart
		for(int i = 0; i < count; i++) {
			DigitalVideoDisc dvd = itemsInStore[i];
			System.out.println(dvd.toString());
						
		}
		float total = totalCost();
		System.out.println("");
		System.out.println("Total cost: " + total);
		System.out.println("**************************************************");		
		System.out.println("");
		
	}
	*/
}
