import javax.swing.*;		// 윈도우 관련						}
import java.awt.*;			// 레이아웃(화면배치)				}- 자바에서 지원하는 윈도우의 모든 기능
import java.awt.event.*;	// 버튼, 텍스트 등의 이벤트 관련		}

public class MovieMainForm extends JFrame implements ActionListener{		// 자바에서 상속은 한개만 가능(단일 상속)
	// 윈도우 창의 바 인스턴스 생성
	JMenuBar bar = new JMenuBar();
	// 메뉴바 안에 들어갈 목록 생성
	JMenuItem home = new JMenuItem("Home");
	JMenuItem find = new JMenuItem("찾기");
	JMenuItem exit = new JMenuItem("종료");
	
	// 화면을 뒤에 감췄다가 버튼 클릭시 화면을 보여줌(화면전환에 필요)
	CardLayout card = new CardLayout();
	MovieList ml = new MovieList();
	MovieDetail md = new MovieDetail();
	MovieFind mf = new MovieFind();
	
	// 프로그램 실행하면 "자동으로" 윈도우를 띄우기 위해 생성자 사용
	MovieMainForm () {
		// 메뉴 설정
		JMenu menu = new JMenu("메뉴");
		menu.add(home);			// 메뉴 안에 목록 넣기
		menu.add(find);
		menu.addSeparator();	// 메뉴 구분선
		menu.add(exit);
		bar.add(menu);			// 바에 메뉴 추가
		
		// 레이아웃 설정
		setLayout(card);
		add("ML", ml);
		add("MD", md);
		add("MF", mf);
		
		// 윈도우 창에 메뉴바 설정
		setJMenuBar(bar);		
		
		// 윈도우 크기 설정
		setSize(1300, 1000);
		
		// 윈도우 창 띄우기 true
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();	// 생성자는 반드시 new를 붙여야 할당됨 

	}

	// 메뉴를 눌렀을 때 화면 전환
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource() == find) {
			card.show(getContentPane(), "MF");
		}
		if(e.getSource() == exit) {
			System.exit(0);
		}
		
	}

}
