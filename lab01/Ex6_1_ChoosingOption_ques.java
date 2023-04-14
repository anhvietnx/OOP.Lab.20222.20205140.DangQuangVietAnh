package lab01_20222;
import javax.swing.JOptionPane;
public class Ex6_1_ChoosingOption_ques {
	public static void main(String [] args) {
		String[] options = {"Yes","No"};
		int option = JOptionPane.showOptionDialog(null,"Do you want to change the first ticket?",
					 "Confirmation",JOptionPane.DEFAULT_OPTION
				 	 ,JOptionPane.INFORMATION_MESSAGE, null, options, options);
		JOptionPane.showMessageDialog(null,"You have choosen: "	+(option == JOptionPane.YES_OPTION? "Yes" :"No"));
		System.exit(0);
	}
}


