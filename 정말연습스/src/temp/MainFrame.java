package temp;

import java.awt.Font;

import javax.swing.*;

import UI.MenuForm;

public class MainFrame extends JFrame{
	// ����
	JLabel title = new JLabel("��ȭ ���� & ��õ ���α׷�", JLabel.CENTER);
	MenuForm mf = new MenuForm();
	
	
	public MainFrame() {
		
		// Ÿ��Ʋ
		title.setFont(new Font("����ü", Font.BOLD, 55));
		title.setOpaque(true);
		setLayout(null);
		title.setBounds(10, 15,1570, 100);
		add(title);
		
		// �޴���
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		
		// â ��ġ
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//============================== �޴������� �����߰� ��Ʈ���гκ��� �����ϸ� ��
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
