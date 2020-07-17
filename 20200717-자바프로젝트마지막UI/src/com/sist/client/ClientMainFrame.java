package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ������ â
public class ClientMainFrame extends JFrame implements ActionListener{
	//������ ũ�� ����
	// Ŭ�������� ������ ���(������ �ƴ϶� ������ ��)
/*		1. �����ͺ��̽� : ����Ŭ����
 * 		2. ��Ʈ��ũ : IP, port ����
 * 		3. �� : ��Ű���� �� �б�(�ڵ� �α���)
 */
	
	JLabel title = new JLabel("������ & ���� ��õ����Ʈ", JLabel.CENTER);
	MenuForm mf = new MenuForm();
	ChatForm cf = new ChatForm();
	ControllPanel cp = new ControllPanel();
	
	
	public ClientMainFrame() {
		title.setFont(new Font("����ü", Font.BOLD, 55));
		title.setOpaque(true);
		setLayout(null);	// ī�巹�̾ƿ��� ������ ��ü�� �ٲ�°���
		title.setBounds(10, 15,1570, 100);
		add(title);
		// �޴� ��ġ
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		// ä����
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// ���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		// ������ â
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
	}
	
	
	public static void main(String[] args) throws Exception{
//		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mf.b1) {
			cp.card.show(cp, "DF");
		}
		else if(e.getSource() == mf.b2) {
			cp.card.show(cp, "LF");
		}
		
	}

}
