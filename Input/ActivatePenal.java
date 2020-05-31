package Input;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActivatePenal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("2nd programme");
		JPanel panel = new JPanel();//panel created
		frame.setSize(500, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//panel created
		
		
		frame.add(panel);//inside the frame panel is added to it 
		
		
		JButton button = new JButton();//button1
		button.setText("Sign Up");
		panel.add(button);
		
		JButton button1 = new JButton();//button2
		button1.setText("Login");
		panel.add(button1);
		
		JButton button2 = new JButton();//button
		button2.setText("Close");
		panel.add(button2);
		
	}

}
