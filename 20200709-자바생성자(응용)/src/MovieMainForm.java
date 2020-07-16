import javax.swing.*;		// 윈도우 관련						}
import javax.swing.border.LineBorder;

import java.awt.*;			// 레이아웃(화면배치)				}- 자바에서 지원하는 윈도우의 모든 기능
import java.awt.event.*;	// 버튼, 텍스트 등의 이벤트 관련		}
import java.net.URL;

public class MovieMainForm extends JFrame implements ActionListener, MouseListener{		// 자바에서 상속은 한개만 가능(단일 상속)
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
	
	
	int curpage = 1; 		// 현재페이지 변수 초기화
	int totalpage = 194;	// 최종페이지 변수 초기화
	
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
		setSize(1600, 900);
		
		// 윈도우 창 띄우기 true
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this);	// 이전 버튼
		ml.b2.addActionListener(this);	// 다음 버튼
		
		// 포스터 읽어오는 메소드 실행
		moviePrint(1);
		
		// 마우스 이벤트를 사용하겠다고 선언
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				ml.movie[i][j].addMouseListener(this);
			}
		}
	}
	
	// 포스터 읽어오는 메소드
	void moviePrint(int page) {
		MovieVO[] movies = MovieManager.movieListData(page);
		int k = 0;
		for(MovieVO vo : movies) {
			try {
				// 포스터 읽어오기
				URL url = new URL(vo.poster);
				Image img = getImage(new ImageIcon(url), ml.movie[0][0].getWidth(), ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
			}catch(Exception ex) {}
		}
		// 페이지 표시
		ml.pLa.setText(curpage + " page / " + totalpage + " pages");
	}
	
	// 이미지 축소 메소드
	static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
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
		else if(e.getSource() == exit) {
			System.exit(0);
		}
		else if(e.getSource() == ml.b1) {
			if(curpage > 1) {
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource() == ml.b2) {
			if(curpage < totalpage) {
				curpage++;
				moviePrint(curpage);
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {		// 마우스 꾹 누르고 드래그
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {		// 드래그 후 놨을 때
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {		// 마우스를 위에 올렷을 때
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				if(e.getSource() == ml.movie[i][j]) {
					LineBorder line = new LineBorder(Color.yellow, 5);
					ml.movie[i][j].setBorder(line);
				}
			}
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {			// 마우스 치웟을 때
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}
