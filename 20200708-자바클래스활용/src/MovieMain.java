import java.util.*;
import java.awt.*;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;

						// 윈도우창 			버튼눌렀을때
public class MovieMain extends JFrame implements ActionListener{
	// 멤버변수 초기화(버튼)
	JButton b1, b2, b3, b4, b5;
	// 그림출력
	// JLabel la = new JLabel();
	// MovieVO 클래스를 배열로 저장
	static MovieVO[] movies = new MovieVO[20];
	// 패널 생성
	JPanel pan = new JPanel();
	
	
	MovieMain(){
		// 인스턴스 생성
		b1 = new JButton("현재상영영화");
		b2 = new JButton("개봉예정영화");
		b3 = new JButton("박스오피스(주간)");
		b4 = new JButton("박스오피스(월간)");
		b5 = new JButton("박스오피스(연간)");
		// 버튼을 나란히 배치
		JPanel p = new JPanel();
		p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
		// 윈도우에 p 올리기
		add(p);
		setLayout(null);
		// 버튼 xy좌표 및 폭 높이
		p.setBounds(10, 15, 780, 35);
		// 그림 xy좌표 및 폭 높이
		pan.setBounds(10, 60, 1280, 900);
		// 그림 예외처리
		try {
			URL url = new URL("https://t1.daumcdn.net/movie/1ecf78cedbf976cde900300dd46f563393c1d73b");
			//la.setIcon(new ImageIcon(getImage(new ImageIcon(url), 250, 350)));
		}catch (Exception ex) {}
		// 윈도우창에 패널 추가
		add(pan);
		setSize(1300, 1000);
		try {
			movieData(1);
			imagePrint();
		}catch(Exception ex) {}
		// 출력:트루
		setVisible(true);
		
		// 메뉴 버튼을 눌렀을 때
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	// 이미지 축소 툴
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
// 포스터 출력하는 메소드
	void imagePrint() throws Exception{
		pan.setLayout(new GridLayout(4, 5, 8, 8));
		for(MovieVO vo : movies) {
			URL url = new URL(vo.poster);
			pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url), 250, 280))));
		}
	}
	
// 포스터 긁어오는 메소드
	static void movieData(int no) throws Exception{
		String url = "";
		switch(no) {
		case 1:		// 현재상영영화
			url = "https://movie.daum.net/premovie/released";
			break;
		case 2:		// 개봉예정영화
			url = "https://movie.daum.net/premovie/scheduled";
			break;
		case 3:		// 박스오피스 주간
			url = "https://movie.daum.net/boxoffice/weekly";
			break;
		case 4:		// 박스오피스 월간
			url = "https://movie.daum.net/boxoffice/monthly";
			break;
		case 5:		// 박스오피스 연간
			url = "https://movie.daum.net/boxoffice/yearly";
			break;
		}
/*	이미지 주소
 * <div class="info_movie"><span class="thumb_movie bg_noimage">
 * <img src="//img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2" class="img_g" alt="" onload="noImageOnLoad($(this))">
 */
		Document doc = Jsoup.connect(url).get();
		// 위 주소에서 이미지 가져오기
		Elements image = doc.select("div.info_movie span.thumb_movie img.img_g");
		for(int i = 0; i < 20; i++) {
			movies[i] = new MovieVO();
			String temp = image.get(i).attr("src");		// 이미지 주소를 가져올 땐 src, 일반 태그는 text
			movies[i].poster = temp.substring(temp.indexOf("=")+1); 
		}
	}
	public static void main(String[] args) throws Exception{
		// 윈도우 창 테마
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMain();

	}

// 버튼 눌렀을 때 처리하는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {		// 현재상영영화
			try {
				movieData(1);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b2) {	// 개봉예정영화
			try {
				movieData(2);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b3) { 	// 박스오피스 주간
			try {				movieData(3);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b4) {	// 박스오피스 월간
			try {
				movieData(4);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b5) {	// 박스오피스 연간
			try {
				movieData(5);
				imagePrint();
			}catch(Exception ex) {}
		}
		
	}

}
