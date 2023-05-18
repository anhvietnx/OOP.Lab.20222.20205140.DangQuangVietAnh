package lab01_20222;
import javax.swing.JOptionPane;
public class Ex6_1_ChoosingOption {
	public static void main(String [] args) {
		int option = JOptionPane.showConfirmDialog(null, 
				"Do u want to change the first class ticket?");
		JOptionPane.showMessageDialog(null,"You have choosen : "
			 +(option == JOptionPane.YES_OPTION? "Yes":"nO"));
		System.exit(0);
	}

}
