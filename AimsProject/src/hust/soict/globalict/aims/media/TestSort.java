package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<Media>();
        // Thêm các đối tượng Media vào danh sách
        
        mediaList.add(new CompactDisc("CD Title", "CD Category", "CD Artist", 60,9.99f));
        mediaList.add(new DigitalVideoDisc("DVD Title", "DVD Category", "DVD Director", 14, 120.5f));
        mediaList.add(new Book( "Book Title", "Book Category", 19.99f));
        mediaList.add(new CompactDisc("CD Title", "CD Category", "CD Artist",70, 9.99f));
        mediaList.add(new DigitalVideoDisc("DVD Title", "DVD Category", "DVD Director", (int) 14.99f, 120));
        mediaList.add(new Book( "Book Title", "Book Category", 19.99f));

        // Sắp xếp theo tiêu đề sau đó là giá
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);

        // Sắp xếp theo giá sau đó là tiêu đề
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);

        // In ra danh sách sau khi sắp xếp
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}
