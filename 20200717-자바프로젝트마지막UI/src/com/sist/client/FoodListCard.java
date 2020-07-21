package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.data.FoodHouseVO;

public class FoodListCard extends JPanel {
	JLabel posterLa = new JLabel();	// 포스터
	JLabel la1, la2, la3;		// 제목, 평점, 주소
	JTextPane ta;				// 후기
	public FoodListCard(FoodHouseVO vo) {	// 매개변수 여러개면 클래스로 묶어서 ㄱㄱ
//		posterLa.setOpaque(true);
//		posterLa.setBackground(Color.black);
		
		try {
			URL url = new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url), 200, 200);
			posterLa.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		
		la1 = new JLabel(vo.getTitle());
		la2 = new JLabel(String.valueOf(vo.getScore()));
		la2.setForeground(Color.orange);		// 글자 색 설정
		la3 = new JLabel(vo.getAddress());
		// ta.setText(vo.getReview());
		ta = new JTextPane();
		ta.setText(vo.getReview());
		
		setLayout(null);
		posterLa.setBounds(10, 15, 200, 200);
		la1.setBounds(215, 15, 350, 30);
		la2.setBounds(570, 15, 60, 30);
		la3.setBounds(215, 50, 415, 30);
		ta.setBounds(215, 85, 415, 130);
		
		add(posterLa);
		add(la1);
		add(la2);
		add(la3);
		add(ta);
	}


	
	
}
