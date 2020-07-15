package com.sist.client;

import com.sist.common.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecipeMainForm extends JFrame implements ActionListener {
	// 화면 레이아웃
	CardLayout card = new CardLayout();
	Login login = new Login();
	JoinForm join = new JoinForm();
	RecipeManager rm = new RecipeManager();
	
// 생성자 ============================================================================ 생성자
	public RecipeMainForm() {
		setLayout(card);
		
		add("RM", rm);
		
		add("LOGIN", login);
		add("JOIN", join);

		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// X표를 누르면 윈도우를 완전히 끄는 명령어
		
		login.b2.addActionListener(this);			// 클릭하면 로그인 화면으로 이동
		join.b3.addActionListener(this);			// 클릭하면 회원가입 화면으로 이동
	}
	
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainForm();
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {	// 로그인 / 회원가입 버튼 클릭 이벤트
		if(e.getSource() == login.b2) {				// e.getSource() : 마우스 클릭
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource() == join.b3) {
			card.show(getContentPane(), "LOGIN");
		}
		
	}

}
