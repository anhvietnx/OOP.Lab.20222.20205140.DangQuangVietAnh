import java.util.Scanner;

public class Ex6_3 {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = key.nextInt();
		key.close();
		//print 
		//thuat toan : moi dong thu i se phai  co n-i dau space va 2i-1 dau *
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i ;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 2*i-1;k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
