package com.sist.string;
/*
 * 	◆valueOf()
 * 		모든 데이터형을 문자열로
 * 
 */

import java.awt.*;
import javax.swing.*;
public class MainClass3 extends JFrame{
	JTextField tf = new JTextField();
	JLabel la = new JLabel();
	
	public MainClass3() {
		tf.setText(String.valueOf(10));
		la.setText(String.valueOf(10.5));
		add("North", tf);
		add("South", la);
		setSize(350, 200);
		setVisible(true);
		
		
		
	}

	
	
	public static void main(String[] args) {
		new MainClass3();
	}
}
