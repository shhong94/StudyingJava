package com.sist.inter;
/*
 * 	◆ 자바에서 지원하는 인터페이스
 * 		1. 윈도우 (javax.swing)
 * 			ActionListener			버튼, 메뉴, text에서 엔터
 * 				actionPerformed()
 * 			MouseListener			마우스 관련 전체
 * 				mouseClicked()
 * 				mouseReleased()
 * 				mousePressed()
 * 				mouseEntered()
 * 				mouseExited()
 * 			MouseMotionListener		마우스 관련 JTable, JTree, JLabel
 * 				mouseMoved()
 * 				mouseDragged()
 * 			KeyListener				키보드 관련
 * 				keyPressed()
 * 				keyReleased()
 * 				keyTyped()
 * 			FocusListener			포커스?관련
 * 				focusLost()
 * 				focusGained()
 * 			ItemListener			콤보박스, J리스트 등
 * 				Combobox, JList
 * 				itemStateChanged()
 * 		2. 데이터베이스 연결
 * 			Connection
 * 			Statement
 * 			ResultSet
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


													// ☆★☆★ 다중상속스 ☆★☆★
public class MainClass2 extends JFrame implements ActionListener, MouseListener, ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	
	public MainClass2() {
		b1 = new JButton("클릭");
		tf = new JTextField();
		la = new JLabel(new ImageIcon("c:\\javaDev\\air.jpg"));
		box = new JComboBox();
		box.addItem("홍홍홍");
		box.addItem("이이이");
		box.addItem("박박박");
		
		add("North", box);
		add("West", b1);
		add("Center", la);
		add("South", tf);
		
		setSize(450, 500);
		setVisible(true);
		
		// 이벤트 등록
		// b1버튼 클릭시 actionPerformed 뿐만 아니라 mouseClicked 에서도 이벤트가 가능. 둘 중 하나를 정해야 함.
		b1.addActionListener(this);	// this는 자신(MainClass2). MainClass2 안에 actionPerformed가 있음
		tf.addActionListener(this);
		la.addMouseListener(this);
		box.addItemListener(this);
	}
	

	public static void main(String[] args) {
		new MainClass2();
	}
	
	
	


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == la) {
			if(e.getClickCount() == 2) {	// 더블클릭
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
			}
		}
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "벝흔클릭"); // this : 출력위치(MainClass2)
		}
		else if(e.getSource() == tf) {
			String msg = tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == box) {
			String name = (String)box.getSelectedItem();
			JOptionPane.showMessageDialog(this, name);
		}
		
	}

}
