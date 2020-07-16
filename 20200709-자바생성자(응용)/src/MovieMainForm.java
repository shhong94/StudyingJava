import javax.swing.*;		// ������ ����						}
import javax.swing.border.LineBorder;

import java.awt.*;			// ���̾ƿ�(ȭ���ġ)				}- �ڹٿ��� �����ϴ� �������� ��� ���
import java.awt.event.*;	// ��ư, �ؽ�Ʈ ���� �̺�Ʈ ����		}
import java.net.URL;

public class MovieMainForm extends JFrame implements ActionListener, MouseListener{		// �ڹٿ��� ����� �Ѱ��� ����(���� ���)
	// ������ â�� �� �ν��Ͻ� ����
	JMenuBar bar = new JMenuBar();
	// �޴��� �ȿ� �� ��� ����
	JMenuItem home = new JMenuItem("Home");
	JMenuItem find = new JMenuItem("ã��");
	JMenuItem exit = new JMenuItem("����");
	
	// ȭ���� �ڿ� ����ٰ� ��ư Ŭ���� ȭ���� ������(ȭ����ȯ�� �ʿ�)
	CardLayout card = new CardLayout();
	MovieList ml = new MovieList();
	MovieDetail md = new MovieDetail();
	MovieFind mf = new MovieFind();
	
	
	int curpage = 1; 		// ���������� ���� �ʱ�ȭ
	int totalpage = 194;	// ���������� ���� �ʱ�ȭ
	
	// ���α׷� �����ϸ� "�ڵ�����" �����츦 ���� ���� ������ ���
	MovieMainForm () {
		// �޴� ����
		JMenu menu = new JMenu("�޴�");
		menu.add(home);			// �޴� �ȿ� ��� �ֱ�
		menu.add(find);
		menu.addSeparator();	// �޴� ���м�
		menu.add(exit);
		bar.add(menu);			// �ٿ� �޴� �߰�
		
		// ���̾ƿ� ����
		setLayout(card);
		add("ML", ml);
		add("MD", md);
		add("MF", mf);
		
		// ������ â�� �޴��� ����
		setJMenuBar(bar);		
		
		// ������ ũ�� ����
		setSize(1600, 900);
		
		// ������ â ���� true
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this);	// ���� ��ư
		ml.b2.addActionListener(this);	// ���� ��ư
		
		// ������ �о���� �޼ҵ� ����
		moviePrint(1);
		
		// ���콺 �̺�Ʈ�� ����ϰڴٰ� ����
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				ml.movie[i][j].addMouseListener(this);
			}
		}
	}
	
	// ������ �о���� �޼ҵ�
	void moviePrint(int page) {
		MovieVO[] movies = MovieManager.movieListData(page);
		int k = 0;
		for(MovieVO vo : movies) {
			try {
				// ������ �о����
				URL url = new URL(vo.poster);
				Image img = getImage(new ImageIcon(url), ml.movie[0][0].getWidth(), ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
			}catch(Exception ex) {}
		}
		// ������ ǥ��
		ml.pLa.setText(curpage + " page / " + totalpage + " pages");
	}
	
	// �̹��� ��� �޼ҵ�
	static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();	// �����ڴ� �ݵ�� new�� �ٿ��� �Ҵ�� 

	}

	// �޴��� ������ �� ȭ�� ��ȯ
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
	public void mousePressed(MouseEvent e) {		// ���콺 �� ������ �巡��
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {		// �巡�� �� ���� ��
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {		// ���콺�� ���� �÷��� ��
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
	public void mouseExited(MouseEvent e) {			// ���콺 ġ�m�� ��
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}
