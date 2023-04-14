package lab01_20222;
import java.util.Scanner;

public class Ex6_6_summatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Initial matrix (array two dimension
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result  = new int[rows][columns];

        //Input the 1st matrix by loop
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.printf("maxtrix1[%d][%d]",i,j);
                matrix1[i][j] = input.nextInt();
            }
        }
        //input 2rd matrix by loop
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	System.out.printf("maxtrix2[%d][%d]",i,j);
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
