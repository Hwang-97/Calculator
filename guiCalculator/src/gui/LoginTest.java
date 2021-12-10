package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginTest extends JFrame {
	
	public LoginTest() {
		JPanel panel = new JPanel();
		JLabel labelID = new JLabel("ID :");
		JLabel labelPW = new JLabel("PassWord :");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log In");
		
		panel.add(labelID);
		panel.add(txtID);
		panel.add(labelPW);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener((ActionEvent e)-> {
			String id = "Dan";
			String pass = "1234";
			
			if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
				JOptionPane.showMessageDialog(null, "You have logged in successfully");
			}else {
				JOptionPane.showMessageDialog(null, "You failed to log in");
			}
		});
		
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginTest();

	}

}
