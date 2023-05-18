import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class test {
	public static void swap(DigitalVideoDisc[] discs, int index1, int index2) {
	    DigitalVideoDisc tmp = discs[index1];
	    discs[index1] = discs[index2];
	    discs[index2] = tmp;
	}

	public static void main(String[] args) {
	    DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle Book");
	    DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

	    System.out.println("Before swap:");
	    System.out.println("jungleDVD: " + jungleDVD.getTitle());
	    System.out.println("cinderellaDVD: " + cinderellaDVD.getTitle());

	    DigitalVideoDisc[] dvdArray = {jungleDVD, cinderellaDVD};

	    swap(dvdArray, 0, 1);

	    jungleDVD = dvdArray[0];
	    cinderellaDVD = dvdArray[1];

	    System.out.println("After swap:");
	    System.out.println("jungleDVD: " + jungleDVD.getTitle());
	    System.out.println("cinderellaDVD: " + cinderellaDVD.getTitle());
	}


}
