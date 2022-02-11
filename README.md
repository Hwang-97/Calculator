🧮GUI Calculator🧮

![image](https://user-images.githubusercontent.com/85034286/145671002-960d9f30-f7be-4f44-afe3-9f2e48bdd27b.png)

>  Swing을 이용해서 구현한 GUI 계산기 프로젝트 입니다. <br />

<br />

# 📌 Table Of Contents
* [📖 Introduction](#-introduction)
* [🔎 Detail](#-detail)
* [💡 Review](#-review)

<br />
<br />
<br />



# 📖 Introduction
### 1. 프로젝트 개요
* GUI를 활용한 프로젝트를 진행해 보고싶어져 해당 프로젝트를 진행하게 되었습니다.
* 해당 프로젝트는 공부 목적이 강한 프로젝트로써 먼저 swing의 기초를 공부하고 WindowBuilder를 사용하여 구현하였습니다.
<br />

### 2. 개발 환경
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">  
* 순수 JAVA 프로젝트 입니다.
* 개발 툴로는 WindowBuilder의 도움을 받아 완성도를 높였습니다.
* GitHub를 활용하여 형상 관리를 했습니다.
<br />

### 3. 프로젝트 내용
![image](https://user-images.githubusercontent.com/85034286/145671002-960d9f30-f7be-4f44-afe3-9f2e48bdd27b.png)
#### 3-1. 기본 기능에 On/Off 기능 추가
* 해당 프로젝트는 Java의 기능중 Swing을 이용한 GUI 계산기 입니다.
* 타 계산기 기능에 온 오프 기능을 추가로 구현하였습니다.

#### 3-2. exe 파일에 아이콘 추가
* 기능을 모두 구현한 뒤 exe 파일로 추출하였습니다.
* exe파일에 아이콘을 등록하기위하여 url기능을 추가로 사욯하였습니다. EX ) class.getClassLoader().getResource("calculator.png");

<br />
<br />
<br />

# 🔎 Detail
### 1. 주요 코드
* 모든 버튼을 선언하는 메소드 입니다.
    ```java
    private void initialize() {
		URL imageURL = CalculatorGUI.class.getClassLoader().getResource("calculator.png");
		ImageIcon img = new ImageIcon(imageURL);
		
		frame = new JFrame();
		frame.setBackground(new Color (128,128,128));
		frame.setBounds(100, 100, 365, 526);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		frame.setTitle("Calculator");
		frame.setIconImage(img.getImage());
		
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
    ...
    ```
* 계산기의 전원 버튼 클릭시 모든 버튼을 비활성화 하는 메소드 입니다.
    ```java
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
        ...
    ```
* 연산 기호를 구별하는 메소드를 생성한 뒤 해당 메소드를 사용하며 연산을 실행하는 메소드 입니다.
    ```java
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
    ```
* 버튼 클릭시 이벤트를인식해 라벨에 입력하는 메소드 입니다.
  ```
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
		...
  ```
    
<br />
<br />
<br />

# 💡 Review
### 1. 후기
* 해당 프로젝트를 진행하며 툴의 사용도 좋지만 코드를 이해 하고 사용하려면 기초를 다지고 툴을 사용해야 효과적이라는것을 몸소 느끼게 되었습니다.

<br />
<br />

### 2. 코드 리뷰
* 코드에 static 이 불필요하게 많아 수정하면 더 효율적인 코드가 완설될것 같습니다.

<br />
<br />
<br />
