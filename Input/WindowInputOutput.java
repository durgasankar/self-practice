package Input;

import javax.swing.JOptionPane;

public class WindowInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname,fullname;
		fname=JOptionPane.showInputDialog("what is your first name?");
		lname=JOptionPane.showInputDialog("What is your last name?");
		fullname=fname+" "+lname;
		JOptionPane.showMessageDialog(null, "your name is: "+fullname);
		System.exit(0);
	}

}
