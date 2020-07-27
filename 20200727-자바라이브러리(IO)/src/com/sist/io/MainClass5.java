package com.sist.io;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class MainClass5 extends JFrame implements ActionListener {
	JTextField tf = new JTextField();
	JButton b = new JButton("파일선택");
	
	public MainClass5 () {
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b);
		add("Center", p);
		setSize(450, 250);
		setVisible(true);
		b.addActionListener(this);
		
	}
	
	
	

	public static void main(String[] args) {
		new MainClass5();
		

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			JFileChooser jc = new JFileChooser();
			if(jc.showOpenDialog(this) == jc.APPROVE_OPTION) {
				tf.setText(jc.getSelectedFile().getPath());
				try {				// <=========================================== 파일 카피 (업로드)
					FileInputStream fis = new FileInputStream(tf.getText());
					FileOutputStream fos = new FileOutputStream("c:\\upload\\"
												+ jc.getSelectedFile().getName());
					int i = 0;
					byte[] buffer = new byte[1024];
					while((i = fis.read(buffer, 0, 1024)) != -1) {
						fos.write(buffer, 0, i);
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "파일 업로드 완료");
				} catch (Exception e2) {
					
				}
			}
		}
		
	}

}
