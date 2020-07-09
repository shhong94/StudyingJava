package 정말연습스;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieMainForm2 extends JFrame implements ActionListener{
	// 윈도우 창의 바 인스턴스 생성
	JMenuBar bar2 = new JMenuBar();
	// 메뉴 안에 들어갈 목록 생성
	JMenuItem find2 = new JMenuItem("찾기");
	JMenuItem home2 = new JMenuItem("홈");
	JMenuItem exit2 = new JMenuItem("나가기");
	
	MovieMainForm2() {
		// 메뉴설정
		JMenu menu = new JMenu("메뉴");
		menu.add(home2);
		menu.add(find2);
		menu.addSeparator();
		menu.add(exit2);
		bar2.add(menu);
		
		// 윈도우 창에 바 설정
		setJMenuBar(bar2);
		// 크기
		setSize(1500, 1300);
		// 띄우기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MovieMainForm2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
