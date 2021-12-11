package guiTest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("CLICK me!!");
		JButton btn2 = new JButton("EXIT");
		JTextArea txtArea = new JTextArea();
//		JTextField txtField = new JTextField(200); //크기지정 area 추천
		JPanel btnPanel = new JPanel();//버튼용
		
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label , BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		frame.add(panel);
		
		
		btn1.addActionListener((ActionEvent e) -> {
			label.setText(txtArea.getText());
		});
		btn2.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
		
		frame.setVisible(true);
		frame.setResizable(false);//크기 변경 불가능 하게 설정
		frame.setPreferredSize(new Dimension(840,840/12*9));// 내부 크기가 지정 크기를 넘어설 경우 유동성을 위해 선언
		frame.setSize(840,840/12*9); // 이것만 있어도 됨.
		frame.setLocationRelativeTo(null);//??
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
		
		
//		button1.setBounds(100,100,100,40);
//		frame.add(button1);
//		

	}		

}
