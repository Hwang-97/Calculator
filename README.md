๐งฎGUI Calculator๐งฎ

![image](https://user-images.githubusercontent.com/85034286/145671002-960d9f30-f7be-4f44-afe3-9f2e48bdd27b.png)

>  Swing์ ์ด์ฉํด์ ๊ตฌํํ GUI ๊ณ์ฐ๊ธฐ ํ๋ก์ ํธ ์๋๋ค. <br />

<br />

# ๐ Table Of Contents
* [๐ Introduction](#-introduction)
* [๐ Detail](#-detail)
* [๐ก Review](#-review)

<br />
<br />
<br />



# ๐ Introduction
### 1. ํ๋ก์ ํธ ๊ฐ์
* GUI๋ฅผ ํ์ฉํ ํ๋ก์ ํธ๋ฅผ ์งํํด ๋ณด๊ณ ์ถ์ด์ ธ ํด๋น ํ๋ก์ ํธ๋ฅผ ์งํํ๊ฒ ๋์์ต๋๋ค.
* ํด๋น ํ๋ก์ ํธ๋ ๊ณต๋ถ ๋ชฉ์ ์ด ๊ฐํ ํ๋ก์ ํธ๋ก์จ ๋จผ์  swing์ ๊ธฐ์ด๋ฅผ ๊ณต๋ถํ๊ณ  WindowBuilder๋ฅผ ์ฌ์ฉํ์ฌ ๊ตฌํํ์์ต๋๋ค.
<br />

### 2. ๊ฐ๋ฐ ํ๊ฒฝ
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">  
* ์์ JAVA ํ๋ก์ ํธ ์๋๋ค.
* ๊ฐ๋ฐ ํด๋ก๋ WindowBuilder์ ๋์์ ๋ฐ์ ์์ฑ๋๋ฅผ ๋์์ต๋๋ค.
* GitHub๋ฅผ ํ์ฉํ์ฌ ํ์ ๊ด๋ฆฌ๋ฅผ ํ์ต๋๋ค.
<br />

### 3. ํ๋ก์ ํธ ๋ด์ฉ
![image](https://user-images.githubusercontent.com/85034286/145671002-960d9f30-f7be-4f44-afe3-9f2e48bdd27b.png)
#### 3-1. ๊ธฐ๋ณธ ๊ธฐ๋ฅ์ On/Off ๊ธฐ๋ฅ ์ถ๊ฐ
* ํด๋น ํ๋ก์ ํธ๋ Java์ ๊ธฐ๋ฅ์ค Swing์ ์ด์ฉํ GUI ๊ณ์ฐ๊ธฐ ์๋๋ค.
* ํ ๊ณ์ฐ๊ธฐ ๊ธฐ๋ฅ์ ์จ ์คํ ๊ธฐ๋ฅ์ ์ถ๊ฐ๋ก ๊ตฌํํ์์ต๋๋ค.

#### 3-2. exe ํ์ผ์ ์์ด์ฝ ์ถ๊ฐ
* ๊ธฐ๋ฅ์ ๋ชจ๋ ๊ตฌํํ ๋ค exe ํ์ผ๋ก ์ถ์ถํ์์ต๋๋ค.
* exeํ์ผ์ ์์ด์ฝ์ ๋ฑ๋กํ๊ธฐ์ํ์ฌ url๊ธฐ๋ฅ์ ์ถ๊ฐ๋ก ์ฌ์ฏํ์์ต๋๋ค. EX ) class.getClassLoader().getResource("calculator.png");

<br />
<br />
<br />

# ๐ Detail
### 1. ์ฃผ์ ์ฝ๋
* ๋ชจ๋  ๋ฒํผ์ ์ ์ธํ๋ ๋ฉ์๋ ์๋๋ค.
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
* ๊ณ์ฐ๊ธฐ์ ์ ์ ๋ฒํผ ํด๋ฆญ์ ๋ชจ๋  ๋ฒํผ์ ๋นํ์ฑํ ํ๋ ๋ฉ์๋ ์๋๋ค.
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
* ์ฐ์ฐ ๊ธฐํธ๋ฅผ ๊ตฌ๋ณํ๋ ๋ฉ์๋๋ฅผ ์์ฑํ ๋ค ํด๋น ๋ฉ์๋๋ฅผ ์ฌ์ฉํ๋ฉฐ ์ฐ์ฐ์ ์คํํ๋ ๋ฉ์๋ ์๋๋ค.
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
* ๋ฒํผ ํด๋ฆญ์ ์ด๋ฒคํธ๋ฅผ์ธ์ํด ๋ผ๋ฒจ์ ์๋ ฅํ๋ ๋ฉ์๋ ์๋๋ค.
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

# ๐ก Review
### 1. ํ๊ธฐ
* ํด๋น ํ๋ก์ ํธ๋ฅผ ์งํํ๋ฉฐ ํด์ ์ฌ์ฉ๋ ์ข์ง๋ง ์ฝ๋๋ฅผ ์ดํด ํ๊ณ  ์ฌ์ฉํ๋ ค๋ฉด ๊ธฐ์ด๋ฅผ ๋ค์ง๊ณ  ํด์ ์ฌ์ฉํด์ผ ํจ๊ณผ์ ์ด๋ผ๋๊ฒ์ ๋ชธ์ ๋๋ผ๊ฒ ๋์์ต๋๋ค.

<br />
<br />

### 2. ์ฝ๋ ๋ฆฌ๋ทฐ
* ์ฝ๋์ static ์ด ๋ถํ์ํ๊ฒ ๋ง์ ์์ ํ๋ฉด ๋ ํจ์จ์ ์ธ ์ฝ๋๊ฐ ์์ค๋ ๊ฒ ๊ฐ์ต๋๋ค.

<br />
<br />
<br />
