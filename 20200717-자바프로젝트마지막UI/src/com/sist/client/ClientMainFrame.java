package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 윈도우 창
public class ClientMainFrame extends JFrame implements ActionListener{
	//윈도우 크기 결정
	// 클래스에서 생성자 사용(선언이 아니라 구현할 떄)
/*		1. 데이터베이스 : 오라클연결
 * 		2. 네트워크 : IP, port 세팅
 * 		3. 웹 : 쿠키에서 값 읽기(자동 로그인)
 */
	
	JLabel title = new JLabel("레시피 & 맛집 추천사이트", JLabel.CENTER);
	MenuForm mf = new MenuForm();
	ChatForm cf = new ChatForm();
	ControllPanel cp = new ControllPanel();
	
	
	public ClientMainFrame() {
		title.setFont(new Font("굴림체", Font.BOLD, 55));
		title.setOpaque(true);
		setLayout(null);	// 카드레이아웃은 페이지 전체가 바뀌는거임
		title.setBounds(10, 15,1570, 100);
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		// 채팅폼
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		// 윈도우 창
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
