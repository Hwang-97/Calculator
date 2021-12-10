package gui.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculatorGUI {
	public static JLabel label;
	
	public static Button btn_onoff;
	public static Button btn_ac;
	public static Button btn_back;

	public static Button btn_1;
	public static Button btn_2;
	public static Button btn_3;
	public static Button btn_4;
	public static Button btn_5;
	public static Button btn_6;
	public static Button btn_7;
	public static Button btn_8;
	public static Button btn_9;
	public static Button btn_0;
	public static Button btn_comma;
	public static Button btn_pm;
	
	public static Button btn_plus;
	public static Button btn_minus;
	public static Button btn_multi;
	public static Button btn_divi;
	public static Button btn_eq;

	private JLayeredPane layeredPane;
	public static JFrame frame;
	
	/**
	 * Create the application.
	 */
	public CalculatorGUI() {//»ý¼ºÀÚ
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color (128,128,128));
		frame.setBounds(100, 100, 365, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		layeredPane = new JLayeredPane();
		layeredPane.setForeground(new Color(128, 128, 128));
		layeredPane.setBackground(new Color(128, 128, 128));
		layeredPane.setToolTipText("");
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		btn_1 = new Button("1");
		layeredPane.setLayer(btn_1, 1);
		btn_1.setForeground(new Color(240, 255, 255));
		btn_1.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_1.setBackground(new Color(0, 0, 0));
		btn_1.setBounds(20, 189, 72, 68);
		layeredPane.add(btn_1);
		
		btn_2 = new Button("2");
		btn_2.setForeground(new Color(240, 255, 255));
		btn_2.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_2.setBackground(Color.BLACK);
		btn_2.setBounds(98, 189, 72, 68);
		layeredPane.add(btn_2);
		
		btn_3 = new Button("3");
		btn_3.setForeground(new Color(240, 255, 255));
		btn_3.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_3.setBackground(Color.BLACK);
		btn_3.setBounds(176, 189, 72, 68);
		layeredPane.add(btn_3);
		
		btn_4 = new Button("4");
		btn_4.setForeground(new Color(240, 255, 255));
		btn_4.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_4.setBackground(Color.BLACK);
		btn_4.setBounds(20, 262, 72, 68);
		layeredPane.add(btn_4);
		
		btn_5 = new Button("5");
		btn_5.setForeground(new Color(240, 255, 255));
		btn_5.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_5.setBackground(Color.BLACK);
		btn_5.setBounds(98, 262, 72, 68);
		layeredPane.add(btn_5);
		
		btn_6 = new Button("6");
		btn_6.setForeground(new Color(240, 255, 255));
		btn_6.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_6.setBackground(Color.BLACK);
		btn_6.setBounds(176, 262, 72, 68);
		layeredPane.add(btn_6);
		
		btn_7 = new Button("7");
		btn_7.setForeground(new Color(240, 255, 255));
		btn_7.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_7.setBackground(Color.BLACK);
		btn_7.setBounds(20, 337, 72, 68);
		layeredPane.add(btn_7);
		
		btn_8 = new Button("8");
		btn_8.setForeground(new Color(240, 255, 255));
		btn_8.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_8.setBackground(Color.BLACK);
		btn_8.setBounds(98, 337, 72, 68);
		layeredPane.add(btn_8);
		
		btn_9 = new Button("9");
		btn_9.setForeground(new Color(240, 255, 255));
		btn_9.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_9.setBackground(Color.BLACK);
		btn_9.setBounds(176, 337, 72, 68);
		layeredPane.add(btn_9);
		
		btn_plus = new Button("+");
		btn_plus.setBackground(new Color(0, 0, 0));
		btn_plus.setForeground(new Color(240, 248, 255));
		btn_plus.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_plus.setBounds(254, 337, 72, 68);
		layeredPane.add(btn_plus);
		
		btn_minus = new Button("-");
		btn_minus.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_minus.setForeground(new Color(240, 248, 255));
		btn_minus.setBackground(new Color(0, 0, 0));
		btn_minus.setBounds(254, 262, 72, 68);
		layeredPane.add(btn_minus);
		
		btn_multi = new Button("x");
		btn_multi.setBackground(new Color(0, 0, 0));
		btn_multi.setForeground(new Color(240, 248, 255));
		btn_multi.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_multi.setBounds(254, 189, 72, 68);
		layeredPane.add(btn_multi);
		
		btn_0 = new Button("0");
		btn_0.setForeground(new Color(240, 255, 255));
		btn_0.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_0.setBackground(Color.BLACK);
		btn_0.setBounds(98, 411, 72, 68);
		layeredPane.add(btn_0);
		
		btn_comma = new Button(".");
		btn_comma.setBackground(new Color(0, 0, 0));
		btn_comma.setForeground(new Color(240, 248, 255));
		btn_comma.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_comma.setBounds(176, 411, 72, 68);
		layeredPane.add(btn_comma);
		
		btn_pm = new Button("+/-");
		btn_pm.setBackground(new Color(0, 0, 0));
		btn_pm.setForeground(new Color(255, 255, 255));
		btn_pm.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_pm.setBounds(20, 411, 72, 68);
		layeredPane.add(btn_pm);
		
		btn_eq = new Button("=");
		btn_eq.setForeground(new Color(240, 248, 255));
		btn_eq.setBackground(new Color(0, 0, 0));
		btn_eq.setBounds(254, 411, 72, 68);
		layeredPane.add(btn_eq);
		
		btn_back = new Button("\u2190");
		btn_back.setForeground(new Color(240, 248, 255));
		btn_back.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_back.setBackground(Color.BLACK);
		btn_back.setBounds(254, 115, 72, 68);
		layeredPane.add(btn_back);
		
		btn_divi = new Button("/");
		btn_divi.setForeground(new Color(240, 248, 255));
		btn_divi.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_divi.setBackground(Color.BLACK);
		btn_divi.setBounds(176, 115, 72, 68);
		layeredPane.add(btn_divi);
		
		btn_ac = new Button("ac");
		btn_ac.setForeground(new Color(240, 248, 255));
		btn_ac.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_ac.setBackground(Color.BLACK);
		btn_ac.setBounds(98, 115, 72, 68);
		layeredPane.add(btn_ac);
		
		btn_onoff = new Button("on/off");
		btn_onoff.setForeground(new Color(240, 248, 255));
		btn_onoff.setFont(new Font("D2Coding", Font.BOLD, 20));
		btn_onoff.setBackground(Color.BLACK);
		btn_onoff.setBounds(20, 115, 72, 68);
		layeredPane.add(btn_onoff);
		
		
		label = new JLabel("0 ",SwingConstants.RIGHT);
		label.setOpaque(true);
		label.setForeground(new Color(240, 248, 255));
		label.setFont(new Font("D2Coding", Font.PLAIN, 20));
		label.setBackground(new Color(0, 0, 0));
		label.setBounds(20, 32, 306, 77);
		layeredPane.add(label);
	}
}
