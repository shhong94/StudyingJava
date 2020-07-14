package com.sist.client;

import javax.swing.*;
import java.awt.*;

// �α��� â ������. (â ���°� MainForm����)
public class Login extends JPanel {
	
	// login���� ���(private)
	private Image back;			// ���ȭ��
	private JLabel la1, la2;	// ���̵�, ��� ��
	
	// MainForm���� ���(public)
	JTextField tf;		// ���̵��Է�
	JPasswordField pf;	// ����Է�
	JButton b1, b2;		// ��ư �ΰ�
	
	public Login() {
		// �̹��� ���� �б�
		back = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		// ���̵� �Է�â
		setLayout(null); 	// ��������� ��ġ
		la1 = new JLabel("���̵�", JLabel.RIGHT);
		la1.setBounds(745, 775, 80, 30);
		tf = new JTextField();
		tf.setBounds(830, 775, 150, 30);
		
		add(la1);add(tf);	// ���̵� �Է�â �߰�
		
		// ��й�ȣ �Է�â
		setLayout(null); 	
		la2 = new JLabel("��й�ȣ", JLabel.RIGHT);
		la2.setBounds(745, 810, 80, 30);
		pf = new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		
		add(la2);add(pf);	// ��й�ȣ �Է�â �߰�
		
		// �α��� �� ��� ��ư
		b1 = new JButton("�α���");
		b2 = new JButton("ȸ������");
		JPanel p = new JPanel();	
		p.add(b1);					// JPanel div �ȿ� ��ư 2���� ������ �ڵ����� ��� ����
		p.add(b2);
		p.setOpaque(false); 			// ��� ����
		p.setBounds(745, 850, 235, 35);
		
		add(p);				// JPanel�� ���ִ� ��ư 2�� �߰�
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
	
}
