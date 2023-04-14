//Write a Java program to sort a numeric array, and calculate the sum and average value of array elements
import java.util.Arrays;
import java.util.Scanner;
public class Ex6_5_shortandcalculate {
	    public static void main(String[] args) {
	    	Scanner ip = new Scanner(System.in);
	    	
	    	System.out.println("Enter the number (n) elements of array: ");
	    	int number = ip.nextInt();
	    	
	    	// create an array of the given length
	        int[] array = new int[number];
	        
	        //enter arr
	        System.out.println("Enter the elements a[i] of array");
	        for (int i =0; i < number; i++) {
	        	array[i] = ip.nextInt();
	        }
	        

	        // sort the array
	        int[] array1 = Arrays.copyOf(array, array.length);
	        Arrays.sort(array1);
	        // calculate the sum of array elements
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }

	        // calculate the average of array elements
	        double average = (double) sum / array.length;

	        // print the sorted array, sum, and average
	        System.out.printf("%-15s%s%n", "Original array:", Arrays.toString(array));
	        System.out.printf("%-15s%s%n", "Sorted array:", Arrays.toString(array1));;
	     
	        System.out.println("Sum of array elements: " + sum);
	        System.out.println("Average of array elements: " + average);
	    }
	}



