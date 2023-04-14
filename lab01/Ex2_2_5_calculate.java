
 

/* Write a program to calculate sum,difference,product, 
and quotient of 2 double numbers which are entered by users.
Notes
-To convert from String to double, you can use
double num1 = Double.parseDouble(strNum1)
-Check the divisor of the division */
import javax.swing.JOptionPane;
public class Ex2_2_5_calculate {
	public static void main (String[] args) {
		String strnum1, strnum2;
		String strNoti = "You have input 2 number :";
		strnum1 = JOptionPane.showInputDialog(null,"Please input the 1st number",
				"Input the 1st number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strnum1);
		
		strnum2 = JOptionPane.showInputDialog(null, "Please input 2nd number",
				"Input the 2st number", JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strnum2);
		strNoti += strnum1 + " and " +strnum2;
		double sum = num1 + num2;
		double diff = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		
		String s = String.valueOf(sum);
		String d = String.valueOf(diff);
		String p = String.valueOf(product);
		String q = String.valueOf(quotient);
		
		strNoti += "\nThe sum is " +s +"\nThe diff is " + d
			+ "\nThe product is " + p + "\nThe quotient is " + q;
		JOptionPane.showMessageDialog(null, strNoti,"Calculate",
				JOptionPane.INFORMATION_MESSAGE);		
	}

}
