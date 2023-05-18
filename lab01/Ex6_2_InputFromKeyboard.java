package lab01_20222;
import java.util.Scanner;

public class Ex6_2_InputFromKeyboard {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are u?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are u?");
		double dHeight = keyboard.nextDouble();
		keyboard.close(); 
		//similar to other data types
		//nextByte(),nextShort(),nextLong()
		
		System.out.println("Mrs/Mr. " + strName + ", " + iAge +
				" years old." + "Your height is " + dHeight + ".");
	}

}
