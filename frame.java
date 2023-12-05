import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame implements ActionListener {
	JPanel panel = new JPanel();
	JFrame myFrame = new JFrame();
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	
public void webFrame() {
		myFrame.setSize(350, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(false);
		myFrame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new frame());
		panel.add(button);
				
		myFrame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	String user = userText.getText();
	String password = passwordText.getText();
	
	
	if (user.equals("123") && password.equals("123") && e.getSource()==button) {
		KRLC  KorResLoc = new KRLC();
		myFrame.dispose();
	}
	
}
	
}
