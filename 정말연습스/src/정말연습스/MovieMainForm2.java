package ����������;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieMainForm2 extends JFrame implements ActionListener{
	// ������ â�� �� �ν��Ͻ� ����
	JMenuBar bar2 = new JMenuBar();
	// �޴� �ȿ� �� ��� ����
	JMenuItem find2 = new JMenuItem("ã��");
	JMenuItem home2 = new JMenuItem("Ȩ");
	JMenuItem exit2 = new JMenuItem("������");
	
	MovieMainForm2() {
		// �޴�����
		JMenu menu = new JMenu("�޴�");
		menu.add(home2);
		menu.add(find2);
		menu.addSeparator();
		menu.add(exit2);
		bar2.add(menu);
		
		// ������ â�� �� ����
		setJMenuBar(bar2);
		// ũ��
		setSize(1500, 1300);
		// ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MovieMainForm2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
