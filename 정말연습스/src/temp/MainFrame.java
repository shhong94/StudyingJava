package temp;

import java.awt.Font;

import javax.swing.*;

import UI.MenuForm;

public class MainFrame extends JFrame{
	// 변수
	JLabel title = new JLabel("영화 예매 & 추천 프로그램", JLabel.CENTER);
	MenuForm mf = new MenuForm();
	
	
	public MainFrame() {
		
		// 타이틀
		title.setFont(new Font("굴림체", Font.BOLD, 55));
		title.setOpaque(true);
		setLayout(null);
		title.setBounds(10, 15,1570, 100);
		add(title);
		
		// 메뉴폼
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		
		// 창 배치
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//============================== 메뉴폼까지 복붙했고 컨트롤패널부터 시작하면 됨
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
