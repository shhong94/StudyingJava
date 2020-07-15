package com.sist.client;

import com.sist.common.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecipeMainForm extends JFrame implements ActionListener {
	// ȭ�� ���̾ƿ�
	CardLayout card = new CardLayout();
	Login login = new Login();
	JoinForm join = new JoinForm();
	RecipeManager rm = new RecipeManager();
	
// ������ ============================================================================ ������
	public RecipeMainForm() {
		setLayout(card);
		
		add("RM", rm);
		
		add("LOGIN", login);
		add("JOIN", join);

		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// Xǥ�� ������ �����츦 ������ ���� ��ɾ�
		
		login.b2.addActionListener(this);			// Ŭ���ϸ� �α��� ȭ������ �̵�
		join.b3.addActionListener(this);			// Ŭ���ϸ� ȸ������ ȭ������ �̵�
	}
	
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainForm();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {	// �α��� / ȸ������ ��ư Ŭ�� �̺�Ʈ
		if(e.getSource() == login.b2) {				// e.getSource() : ���콺 Ŭ��
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource() == join.b3) {
			card.show(getContentPane(), "LOGIN");
		}
		
	}

}
