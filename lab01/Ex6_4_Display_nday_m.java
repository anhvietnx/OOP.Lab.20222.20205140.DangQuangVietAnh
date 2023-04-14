package lab01_20222;
import java.util.Scanner;

/*Write a program to display the number of days of a month, which is entered by users
(both month and year). If it is an invalid month/year, ask the user to enter again.
 You must create a new Java project for this exercise.
-The user can either enter a month in its full name, abbreviation, in 3 letters, or in number.
To illustrate, the valid inputs of January are January, Jan., Jan, and 1.
-The user must enter a year in a non negative number and enter all the digits. For instance,
the valid inputs of year 1999 is only 1999, but not 99, "one thousand nine hundred ninety nine", or anything else.
-A year is either a common year of 365 days or a leap year of 366 days. Every year that is
divisible by 4 is a leap year, except for years that are divisible by 100, but not by 400. 
For instance, year 1800 is not a leap year, yet year 2000 is a leap year. In a year, there are twelve
months, which are listed in order as follows.  */
public class Ex6_4_Display_nday_m {
	static int inputM() {
		String[] months = 
		{ "1","January","Jan.","Jan" , "2","February","Feb." ,"Feb" , "3","March","Mar.","Mar" ,"4","April","Apr.","Apr",
		  "5","May","May","May."     , "6","June","June.","Jun"     , "7","July","July.","Jul" ,
		  "8","August","Aug.","Aug"  , "9","September","Sept.","Sep","10","October","Oct.","Oct" , 
		  "11","November","Nov.","Nov" ,"12","December","Dec.","Dec" 
		};
			int length = months.length;
			
			
		Scanner M = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a month in its full name, abbreviation, in 3 letters, or in number");
			System.out.println("Example : the valid inputs of January are January, Jan., Jan, and 1");
			String strM = M.nextLine();
			
			for(int i = 0; i < length; i++) {
				if(strM.equals(months[i])) {					
					int month = i/4 + 1;
					return month;
				}
			}
			System.out.println("You have enter the wrong syntax for month");
		}
		
		
	
	}
	static int inputY() {
		System.out.println("Enter a year in a non negative number and enter all the digits");
		System.out.println("the valid inputs of year 1999 is only 1999, but not 99, \"one thousand nine hundred ninety nine\", or anything else.");
		Scanner Y = new Scanner(System.in);
		int iYear = 0 ;
		
		
		while(true) // !check <=> check == false 
			{
			System.out.print(" ");
			try {
				iYear = Y.nextInt();
				break;
			}catch(Exception ex) { // khoi catch dung de xu ly neu xay ra exception , neu khong thi bo qua
				System.out.println("Please input interger ! Do again =))");
			    Y.nextLine();
				}
		}
		
		return(iYear);
	}
	 static boolean isLeapYear(int year) 
	 { 
		// return true if only % 4 or % 400 = 0(100 and 4)
		return (((year % 4 == 0) && (year % 100 != 0)) || 
		        (year % 400 == 0)); 
	 } 
	 static void Print(int month, int year) {
		 if (month == 2  ) {
			 if (isLeapYear(year)) {
				 System.out.println("The day of month " + month +" in the year "+ year +" is 29");
			 }
			 else {
				 System.out.println("The day of month " + month +" in the year "+ year +" is 28");
			 }
		 }
		 else if (month == 4 || month == 6 || month == 9 || month == 11) {
			 System.out.println("The day of month " + month +" in the year "+ year +" is 30");
		 }
		 else {
			 System.out.println("The day of month " + month +" in the year "+ year +" is 31");
		 }
	}
	
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("--Program to display the number of days of a month--");
			System.out.println("-----------------------------------------------------");
			int month = inputM();
			int year = inputY();
			Print(month,year);
			System.out.println();
			
		}
		
	}
}
