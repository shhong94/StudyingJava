package com.sist.client;

import javax.swing.*;
import java.awt.*;

// 로그인 창 설정만. (창 띄우는건 MainForm에서)
public class Login extends JPanel {
	
	// login에서 사용(private)
	private Image back;			// 배경화면
	private JLabel la1, la2;	// 아이디, 비번 라벨
	
	// MainForm에서 사용(public)
	JTextField tf;		// 아이디입력
	JPasswordField pf;	// 비번입력
	JButton b1, b2;		// 버튼 두개
	
	public Login() {
		// 이미지 정보 읽기
		back = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		// 아이디 입력창
		setLayout(null); 	// 사용자정의 배치
		la1 = new JLabel("아이디", JLabel.RIGHT);
		la1.setBounds(745, 775, 80, 30);
		tf = new JTextField();
		tf.setBounds(830, 775, 150, 30);
		
		add(la1);add(tf);	// 아이디 입력창 추가
		
		// 비밀번호 입력창
		setLayout(null); 	
		la2 = new JLabel("비밀번호", JLabel.RIGHT);
		la2.setBounds(745, 810, 80, 30);
		pf = new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		
		add(la2);add(pf);	// 비밀번호 입력창 추가
		
		// 로그인 및 취소 버튼
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		JPanel p = new JPanel();	
		p.add(b1);					// JPanel div 안에 버튼 2개를 넣으면 자동으로 가운데 정렬
		p.add(b2);
		p.setOpaque(false); 			// 배경 투명
		p.setBounds(745, 850, 235, 35);
		
		add(p);				// JPanel에 들어가있는 버튼 2개 추가
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
	
}
