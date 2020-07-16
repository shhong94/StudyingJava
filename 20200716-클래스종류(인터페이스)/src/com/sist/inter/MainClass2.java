package com.sist.inter;
/*
 * 	�� �ڹٿ��� �����ϴ� �������̽�
 * 		1. ������ (javax.swing)
 * 			ActionListener			��ư, �޴�, text���� ����
 * 				actionPerformed()
 * 			MouseListener			���콺 ���� ��ü
 * 				mouseClicked()
 * 				mouseReleased()
 * 				mousePressed()
 * 				mouseEntered()
 * 				mouseExited()
 * 			MouseMotionListener		���콺 ���� JTable, JTree, JLabel
 * 				mouseMoved()
 * 				mouseDragged()
 * 			KeyListener				Ű���� ����
 * 				keyPressed()
 * 				keyReleased()
 * 				keyTyped()
 * 			FocusListener			��Ŀ��?����
 * 				focusLost()
 * 				focusGained()
 * 			ItemListener			�޺��ڽ�, J����Ʈ ��
 * 				Combobox, JList
 * 				itemStateChanged()
 * 		2. �����ͺ��̽� ����
 * 			Connection
 * 			Statement
 * 			ResultSet
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


													// �١ڡ١� ���߻�ӽ� �١ڡ١�
public class MainClass2 extends JFrame implements ActionListener, MouseListener, ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	
	public MainClass2() {
		b1 = new JButton("Ŭ��");
		tf = new JTextField();
		la = new JLabel(new ImageIcon("c:\\javaDev\\air.jpg"));
		box = new JComboBox();
		box.addItem("ȫȫȫ");
		box.addItem("������");
		box.addItem("�ڹڹ�");
		
		add("North", box);
		add("West", b1);
		add("Center", la);
		add("South", tf);
		
		setSize(450, 500);
		setVisible(true);
		
		// �̺�Ʈ ���
		// b1��ư Ŭ���� actionPerformed �Ӹ� �ƴ϶� mouseClicked ������ �̺�Ʈ�� ����. �� �� �ϳ��� ���ؾ� ��.
		b1.addActionListener(this);	// this�� �ڽ�(MainClass2). MainClass2 �ȿ� actionPerformed�� ����
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
			if(e.getClickCount() == 2) {	// ����Ŭ��
				JOptionPane.showMessageDialog(this, "�󼼺���� �̵�");
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
			JOptionPane.showMessageDialog(this, "����Ŭ��"); // this : �����ġ(MainClass2)
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
