import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Calculator1 implements ActionListener {
	JFrame jf;
	JTextField t1;
	JButton [] number=new JButton[10] ;
JButton[] function=new JButton[9];
JButton b1,b2,b3,b4;
JButton b5,b6,b7,b8,b9;
JPanel panel;
Font ff=new Font("Ink Free",Font.BOLD,30);
double num1=0,num2=0,num3=0;
double result;
char operator;

	public Calculator1() {
		jf=new JFrame("Shavez Calculator");
		jf.setLayout(null);
	
		jf.	setSize(420, 500);
		jf.	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	t1=new JTextField();
	t1.setBounds(50, 25,300, 50);
	t1.setFont(ff);
	t1.setEditable(false);
	jf.add(t1);
	jf.setVisible(true);
		b1=new JButton("+");
b2=new JButton("-");
	b3=new JButton("*");
	b4=new JButton("/");
	b5=new JButton(".");
	b6=new JButton("=");
	b7=new JButton("delete");
	b8=new JButton("clear");
	b9=new JButton("(-)");
	function[0]=b1;
	function[1]=b2;
	function[2]=b3;
	function[3]=b4;
	function[4]=b5;
	function[5]=b6;
	function[6]=b7;
	function[7]=b8;
	function[8]=b9;
	for(int i=0;i<9;i++) {
		function[i].addActionListener(this);
		function[i].setFont(ff);
		function[i].setFocusable(false);
	}
	for(int i=0;i<10;i++) {
		number[i]=new JButton(String.valueOf(i));
		number[i].addActionListener(this);
		number[i].setFont(ff);
		number[i].setFocusable(false);
	}
	b7.setBounds(50, 400, 120, 40);
	jf.add(b7);
	b8.setBounds(170, 400, 105, 40);
	jf.add(b8);
	b9.setBounds(275, 400, 75, 40);
	
	panel=new JPanel();
	panel.setBounds(50,100,300,280);
	panel.setLayout(new GridLayout(4,4,10,10));
	panel.setBackground(Color.LIGHT_GRAY);

	panel.add(number[1]);
	panel.add(number[2]);
	panel.add(number[3]);
	panel.add(b1);
	panel.add(number[4]);
	panel.add(number[5]);
	panel.add(number[6]);
	panel.add(b2);
	panel.add(number[7]);
	panel.add(number[8]);
	panel.add(number[9]);
	panel.add(b3);
	panel.add(b5);
	panel.add(number[0]);
	panel.add(b4);
	panel.add(b6);
	jf.add(panel);
	jf.add(b9);

	}
	class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int a=Integer.parseInt(t1.getText());
		
		}
		
	}
	public static void main(String[] args) {

Calculator1 sw=new Calculator1();


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0;i<10;i++) {
			if(e.getSource()==number[i]) {
				t1.setText(t1.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==b5) {
		t1.setText(t1.getText().concat("."));
		}
		if(e.getSource()==b1) {
	num1=Double.parseDouble(t1.getText());
	operator='+';
	t1.setText("");
			
			}
		if(e.getSource()==b2) {
			num1=Double.parseDouble(t1.getText());
			operator='-';
			t1.setText("");
					
					}
		if(e.getSource()==b3) {
			num1=Double.parseDouble(t1.getText());
			operator='*';
			t1.setText("");
					
					}
		if(e.getSource()==b4) {
			num1=Double.parseDouble(t1.getText());
			operator='/';
			t1.setText("");
					
					}
		if(e.getSource()==b6) {
			num2=Double.parseDouble(t1.getText());
			switch(operator) {
			case'+':
			 result = num1+num2;
				break;
			case'-':
				 result = num1-num2;
				break;

			case'*':
				 result = num1*num2;
				break;

			case'/':
				result = num1/num2;
				break;

			}
			t1.setText(String.valueOf(result));
					num1=result;
					}
		if(e.getSource()==b8) {
			t1.setText("");
					
					}
		if(e.getSource()==b7) {
			String s= t1.getText();
			t1.setText("");
			for(int i=0;i<s.length()-1;i++) {
			t1.setText(t1.getText()+s.charAt(i));	
			}
		}
			if(e.getSource()==b9) {
		double  temp=Double.parseDouble(t1.getText());
		temp*=-1;
		
		
				t1.setText(String.valueOf(temp));	
				}
					
					}
	}


