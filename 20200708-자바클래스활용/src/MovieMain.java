import java.util.*;
import java.awt.*;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;

						// ������â 			��ư��������
public class MovieMain extends JFrame implements ActionListener{
	// ������� �ʱ�ȭ(��ư)
	JButton b1, b2, b3, b4, b5;
	// �׸����
	// JLabel la = new JLabel();
	// MovieVO Ŭ������ �迭�� ����
	static MovieVO[] movies = new MovieVO[20];
	// �г� ����
	JPanel pan = new JPanel();
	
	
	MovieMain(){
		// �ν��Ͻ� ����
		b1 = new JButton("����󿵿�ȭ");
		b2 = new JButton("����������ȭ");
		b3 = new JButton("�ڽ����ǽ�(�ְ�)");
		b4 = new JButton("�ڽ����ǽ�(����)");
		b5 = new JButton("�ڽ����ǽ�(����)");
		// ��ư�� ������ ��ġ
		JPanel p = new JPanel();
		p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
		// �����쿡 p �ø���
		add(p);
		setLayout(null);
		// ��ư xy��ǥ �� �� ����
		p.setBounds(10, 15, 780, 35);
		// �׸� xy��ǥ �� �� ����
		pan.setBounds(10, 60, 1280, 900);
		// �׸� ����ó��
		try {
			URL url = new URL("https://t1.daumcdn.net/movie/1ecf78cedbf976cde900300dd46f563393c1d73b");
			//la.setIcon(new ImageIcon(getImage(new ImageIcon(url), 250, 350)));
		}catch (Exception ex) {}
		// ������â�� �г� �߰�
		add(pan);
		setSize(1300, 1000);
		try {
			movieData(1);
			imagePrint();
		}catch(Exception ex) {}
		// ���:Ʈ��
		setVisible(true);
		
		// �޴� ��ư�� ������ ��
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	// �̹��� ��� ��
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
// ������ ����ϴ� �޼ҵ�
	void imagePrint() throws Exception{
		pan.setLayout(new GridLayout(4, 5, 8, 8));
		for(MovieVO vo : movies) {
			URL url = new URL(vo.poster);
			pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url), 250, 280))));
		}
	}
	
// ������ �ܾ���� �޼ҵ�
	static void movieData(int no) throws Exception{
		String url = "";
		switch(no) {
		case 1:		// ����󿵿�ȭ
			url = "https://movie.daum.net/premovie/released";
			break;
		case 2:		// ����������ȭ
			url = "https://movie.daum.net/premovie/scheduled";
			break;
		case 3:		// �ڽ����ǽ� �ְ�
			url = "https://movie.daum.net/boxoffice/weekly";
			break;
		case 4:		// �ڽ����ǽ� ����
			url = "https://movie.daum.net/boxoffice/monthly";
			break;
		case 5:		// �ڽ����ǽ� ����
			url = "https://movie.daum.net/boxoffice/yearly";
			break;
		}
/*	�̹��� �ּ�
 * <div class="info_movie"><span class="thumb_movie bg_noimage">
 * <img src="//img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2" class="img_g" alt="" onload="noImageOnLoad($(this))">
 */
		Document doc = Jsoup.connect(url).get();
		// �� �ּҿ��� �̹��� ��������
		Elements image = doc.select("div.info_movie span.thumb_movie img.img_g");
		for(int i = 0; i < 20; i++) {
			movies[i] = new MovieVO();
			String temp = image.get(i).attr("src");		// �̹��� �ּҸ� ������ �� src, �Ϲ� �±״� text
			movies[i].poster = temp.substring(temp.indexOf("=")+1); 
		}
	}
	public static void main(String[] args) throws Exception{
		// ������ â �׸�
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMain();

	}

// ��ư ������ �� ó���ϴ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {		// ����󿵿�ȭ
			try {
				movieData(1);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b2) {	// ����������ȭ
			try {
				movieData(2);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b3) { 	// �ڽ����ǽ� �ְ�
			try {				movieData(3);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b4) {	// �ڽ����ǽ� ����
			try {
				movieData(4);
				imagePrint();
			}catch(Exception ex) {}
		}
		else if(e.getSource() == b5) {	// �ڽ����ǽ� ����
			try {
				movieData(5);
				imagePrint();
			}catch(Exception ex) {}
		}
		
	}

}
