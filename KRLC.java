import java.awt.Font;

import javax.swing.*;

public class KRLC {
	private static 	JFrame frame = new JFrame("Korean Restaurant's Locator in Cebu City");
	private static	JPanel panel = new JPanel();
	private static	JLabel label;
	private static 	JLabel label1;

	
	KRLC() {
		frame.setSize(750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("Location:");
		label.setFont(new Font(null,Font.PLAIN,17));
		label.setBounds(20, 50, 80, 50);
		panel.add(label);
		
		label1 = new JLabel("Restaurants");
		label1.setBounds(250, 50, 100, 50);
		label1.setFont(new Font(null,Font.PLAIN,17));
		panel.add(label1);
		
		frame.setVisible(true);
	}
}
