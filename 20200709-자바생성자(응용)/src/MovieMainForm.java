import javax.swing.*;		// ������ ����						}
import java.awt.*;			// ���̾ƿ�(ȭ���ġ)				}- �ڹٿ��� �����ϴ� �������� ��� ���
import java.awt.event.*;	// ��ư, �ؽ�Ʈ ���� �̺�Ʈ ����		}

public class MovieMainForm extends JFrame implements ActionListener{		// �ڹٿ��� ����� �Ѱ��� ����(���� ���)
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
		setSize(1300, 1000);
		
		// ������ â ���� true
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
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
		if(e.getSource() == exit) {
			System.exit(0);
		}
		
	}

}
