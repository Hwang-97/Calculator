package gui.calculator;
import java.awt.event.ActionEvent;

public class Calculator extends CalculatorGUI {
	private static String numberResult="";
	private static String operatorResult="";
	private static double preNum=0;
	private static double num=0;
	private static double resultNum=0;
	private static boolean onOffCheck=true;
	
	public static void main(String[] args) {
		CalculatorGUI window = new CalculatorGUI();

		window.frame.setVisible(true);
		
		inputNumber();
		inputOperator();		inputBasic();
		onOff();
		
	}
	
	private static void onOff() {
		btn_onoff.addActionListener((ActionEvent e)->{
			if(onOffCheck) {
				onOffCheck = false;
				btn_ac.setEnabled(onOffCheck);
				btn_back.setEnabled(onOffCheck);
	
				btn_1.setEnabled(onOffCheck);
				btn_2.setEnabled(onOffCheck);
				btn_3.setEnabled(onOffCheck);
				btn_4.setEnabled(onOffCheck);
				btn_5.setEnabled(onOffCheck);
				btn_6.setEnabled(onOffCheck);
				btn_7.setEnabled(onOffCheck);
				btn_8.setEnabled(onOffCheck);
				btn_9.setEnabled(onOffCheck);
				btn_0.setEnabled(onOffCheck);
				
				btn_comma.setEnabled(onOffCheck);
				btn_pm.setEnabled(onOffCheck);
				
				btn_plus.setEnabled(onOffCheck);
				btn_minus.setEnabled(onOffCheck);
				btn_multi.setEnabled(onOffCheck);
				btn_divi.setEnabled(onOffCheck);
				btn_eq.setEnabled(onOffCheck);
				
				numberResult="";
				operatorResult="";
				preNum=0;
				num=0;
				resultNum=0;
				label.setText("");
			}else {
				onOffCheck = true;
				btn_ac.setEnabled(onOffCheck);
				btn_back.setEnabled(onOffCheck);
	
				btn_1.setEnabled(onOffCheck);
				btn_2.setEnabled(onOffCheck);
				btn_3.setEnabled(onOffCheck);
				btn_4.setEnabled(onOffCheck);
				btn_5.setEnabled(onOffCheck);
				btn_6.setEnabled(onOffCheck);
				btn_7.setEnabled(onOffCheck);
				btn_8.setEnabled(onOffCheck);
				btn_9.setEnabled(onOffCheck);
				btn_0.setEnabled(onOffCheck);
				
				btn_comma.setEnabled(onOffCheck);
				btn_pm.setEnabled(onOffCheck);
				
				btn_plus.setEnabled(onOffCheck);
				btn_minus.setEnabled(onOffCheck);
				btn_multi.setEnabled(onOffCheck);
				btn_divi.setEnabled(onOffCheck);
				btn_eq.setEnabled(onOffCheck);
				label.setText(numberResult+0);
			}
		});
	}
	private static void savePoint() {
		//연산자가 두번쨰 등장할떄 앞 연산 결과는 prenum에 누적 저장하는 용도
		num = Double.parseDouble(numberResult);
		numberResult="";
		if(operatorResult.length()==1) {
			char c = operatorResult.charAt(0);
			switch(c) {
				case '+':
					preNum=preNum+num;
					break;
				case '-':
					preNum=preNum-num;
					break;
				case '*':
					preNum=preNum*num;
					break;
				case '/':
					preNum=preNum/num;
					break;
			}
			operatorResult="";
			num=0;
		}
	}
	/**
	 * 기본 동작 버튼
	 */
	private static void inputBasic() {
		btn_back.addActionListener((ActionEvent e)->{
			if(numberResult.length()>0) {
				numberResult= numberResult.substring(0,numberResult.length()-1);
				label.setText(numberResult);
			}
		});
		btn_ac.addActionListener((ActionEvent e)->{
			numberResult="";
			operatorResult="";
			preNum=0;
			num=0;
			resultNum=0;
			label.setText("");
		});
		btn_eq.addActionListener((ActionEvent e)->{
			
			if(operatorResult.length()>0) {
				num = Double.parseDouble(numberResult);
				numberResult="";
				checkOper(num);
				String s = (""+resultNum);
				s=s.substring(s.indexOf('.')+1);
				if(s.equals("0")) {
					label.setText(String.format("%,d",Integer.parseInt(((""+resultNum).substring(0,(""+resultNum).length()-2)))));
				}else {
					label.setText(String.format("%,f",Double.parseDouble((""+resultNum))));
				}
				numberResult=""+resultNum;
				preNum=0;
				resultNum=0;
			}
		});
	}
	/**
	 * 
	 * 최종 연산결과 출력
	 */
	private static void checkOper(double num) {
		if(operatorResult.length()==1) {
			char c = operatorResult.charAt(0);
			switch(c) {
				case '+':
					resultNum=preNum+num;
					break;
				case '-':
					resultNum=preNum-num;
					break;
				case '*':
					resultNum=preNum*num;
					break;
				case '/':
					resultNum=preNum/num;
					break;
			}
			operatorResult="";
			num=0;
		}
	}
	/**
	 * 연산 버튼 구현
	 */
	private static void inputOperator() {
		btn_plus.addActionListener((ActionEvent e)->{
			operator("+");
		});
		btn_minus.addActionListener((ActionEvent e)->{
			operator("-");
		});
		btn_divi.addActionListener((ActionEvent e)->{
			operator("/");
		});
		btn_multi.addActionListener((ActionEvent e)->{
			operator("*");
		});
	}
	/**
	 *	연산갯수가 쌓였을 경우 처리
	 */
	private static void operator(String s) {
		if(operatorResult.length()>=1) {
			savePoint();
			operatorResult=s;
			label.setText(operatorResult);
		}else {
			preNum = Double.parseDouble(numberResult);
			numberResult="";
			operatorResult=s;
			label.setText(operatorResult);
		}
	}
	/**
	 * 숫자 버튼 입력
	 */
	private static void inputNumber() {
		btn_1.addActionListener((ActionEvent e)->{
			numberResult+=1;
			label.setText(numberResult);
		});
		btn_2.addActionListener((ActionEvent e)->{
			numberResult+=2;
			label.setText(numberResult);
		});
		btn_3.addActionListener((ActionEvent e)->{
			numberResult+=3;
			label.setText(numberResult);
		});
		
		btn_4.addActionListener((ActionEvent e)->{
			numberResult+=4;
			label.setText(numberResult);
		});
		btn_5.addActionListener((ActionEvent e)->{
			numberResult+=5;
			label.setText(numberResult);
		});
		btn_6.addActionListener((ActionEvent e)->{
			numberResult+=6;
			label.setText(numberResult);
		});
		
		btn_7.addActionListener((ActionEvent e)->{
			numberResult+=7;
			label.setText(numberResult);
		});
		btn_8.addActionListener((ActionEvent e)->{
			numberResult+=8;
			label.setText(numberResult);
		});
		btn_9.addActionListener((ActionEvent e)->{
			numberResult+=9;
			label.setText(numberResult);
		});
		btn_0.addActionListener((ActionEvent e)->{
			numberResult+=0;
			label.setText(numberResult);
		});
		btn_comma.addActionListener((ActionEvent e)->{
			numberResult+='.';
			label.setText(numberResult);
		});
		btn_pm.addActionListener((ActionEvent e)->{
			try {
				if(numberResult.charAt(0)=='-') {
					numberResult=numberResult.substring(1);
					label.setText(numberResult);
				}else {
					numberResult='-'+numberResult;
					label.setText(numberResult);
				}
			}catch(StringIndexOutOfBoundsException e1){
				numberResult='-'+numberResult;
				label.setText(numberResult);
			}
		});
		
	}

}
