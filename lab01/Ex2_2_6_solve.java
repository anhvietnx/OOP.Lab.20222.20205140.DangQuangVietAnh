package lab01;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Solve {
	static void A() {
		String a; String b;
		a = JOptionPane.showInputDialog(null,
				"Please input a: ", "ax+b=0",
				JOptionPane.INFORMATION_MESSAGE); // ham` nay thi o thong bao se co phan label , va se k show duoc bien x dau
		b = JOptionPane.showInputDialog(null,
				"Please input b: ", "ax+b=0",
				JOptionPane.INFORMATION_MESSAGE);
		float a1 = Float.parseFloat(a);
		float b1 = Float.parseFloat(b);
		float x = -b1/a1;
		//String x1 = "x = " + Float.toString(x);
		JOptionPane.showMessageDialog(null,"x = "+x);
		//JOptionPane.showMessageDialog(null,x1,"ax+b=0", JOptionPane.INFORMATION_MESSAGE); // co su khac nhau day nhe , cai duoi nay thi phai in ra string , cai tren in ra float cung dc
	}
	static void B() {
		String a11,a12,a21,a22,b1,b2;
		a11 = JOptionPane.showInputDialog(null,
				"Please input a11 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		a12 = JOptionPane.showInputDialog(null,
				"Please input a12 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		a21 = JOptionPane.showInputDialog(null,
				"Please input a21 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		a22 = JOptionPane.showInputDialog(null,
				"Please input a22 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		b1 = JOptionPane.showInputDialog(null,
				"Please input b1 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		b2 = JOptionPane.showInputDialog(null,
				"Please input b2 :", " first-degree equation with two variables",
				JOptionPane.INFORMATION_MESSAGE);
		float a111 = Float.valueOf(a11); float a121 = Float.valueOf(a12);
		float a211 = Float.valueOf(a21); float a221 = Float.valueOf(a22);
		float b11  = Float.valueOf(b1) ; float b21  = Float.valueOf(b2) ;
		float D    = a111*a221 - a211*a121 ; 
		float D1   = b11*a221 - b21*a121   ;
		float D2   = a111*b21  - a211*b11  ;
		float x1=0,x2 =0;
		if (D != 0) {
			 x1 = D1/D ; x2 = D2/D;
			 JOptionPane.showMessageDialog(null, "the system has a unique solution x1 = "+ x1 +" and x2 = "+x2);
		}
		if (D == 0) {
			if (D1 == 0 && D2 == 0) {
				JOptionPane.showMessageDialog(null, "the system has infinitely many solutions");
			}
			else {
				JOptionPane.showMessageDialog(null, "the system has no solution");
			}
		}
		
		
	}
	static void C() {
		String a,b,c;
		a = JOptionPane.showInputDialog(null,
				"Please input a :", " second-degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		b = JOptionPane.showInputDialog(null,
				"Please input b :", " second-degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		c = JOptionPane.showInputDialog(null,
				"Please input c :", " second-degree equation with one variable",
				JOptionPane.INFORMATION_MESSAGE);
		Float a1 = Float.valueOf(a); Float b1 = Float.valueOf(b);Float c1 = Float.valueOf(c);
		double d = b1*b1 - 4*a1*c1; 
		if (d < 0) {
			JOptionPane.showMessageDialog(null, "the system has no solution");
			}
		if (d == 0) {
			float x = -b1/(2*a1);
			JOptionPane.showMessageDialog(null, "the equation has double root x =" + x);
			}
		if (d > 0) {
			double x1 = ((-b1+Math.sqrt(d))/(2*a1));
			double x2 = ((-b1-Math.sqrt(d))/(2*a1));
			JOptionPane.showMessageDialog(null, "the equation has two distinct root x1 = " + x1 
					+" and x2 = "+x2);

		}
		
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	while (true){	
	String key =JOptionPane.showInputDialog(null, 
			"Input [1] for A first-degree equation with one variable \n"
		   +"Input [2] for A system of first-degree equations with two variables x1 and x2\n"
		   +"Input [3] for A second-degree equation with one variable","Please choose",
		     JOptionPane.INFORMATION_MESSAGE);
	int k = Integer.valueOf(key);
	switch (k) {
		case 1 : A(); break;
		case 2 : B(); break;
		case 3 : C(); break;
	}
	
	}
	}

}
