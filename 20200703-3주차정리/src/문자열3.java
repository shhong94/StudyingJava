/*
 * 	�� �α��� ó��
 * 
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class ���ڿ�3 extends JFrame implements ActionListener{
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	JLabel poster = new JLabel();
	
// ���̵�� ��� ����	
	final String ID = "admin";
	final String PW = "1234";
			
			
	public ���ڿ�3() {
		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("�α���");
		b2 = new JButton("���");
// �������̹��� ����
		String s = "https://movie-phinf.pstatic.net/20200624_189/1592965781317Puv47_JPEG/movie_image.jpg";
		try {
			poster.setIcon(new ImageIcon(new URL(s)));
		}catch(Exception ex) {}
		setLayout(null);
		
// ��ư ũ��		
		la1.setBounds(10, 15, 30, 30);
		tf.setBounds(45, 15, 150, 30);
		la2.setBounds(10, 50, 30, 30);
		pf.setBounds(45, 50, 150, 30);
		poster.setBounds(10, 135, 1000, 1000);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10, 90, 195, 35);
		
// ��ư �߰�
		add(poster);
		add(la1);add(tf);
		add(la2);add(pf);
		add(p);
		setSize(1024, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	
	public static void main(String[] args) throws Exception{
// ������ â �׸�
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ���ڿ�3();
	}
/*
 *  1. �α��� ��ư Ŭ����
 *  	�� ���̵� ���� üũ
 *  	�� ������� üũ
 *  	��-a �Է¿Ϸ��
 *  		��. ���̵�� ����� ���� ��
 *  		��. ���̵�� ������ ����� Ʋ�� ��
 *  	��-b ���̵� Ʋ�� ��
 *  2. ��ҹ�ư Ŭ�� ��
 */

	@Override
	public void actionPerformed(ActionEvent e) {
	// �α��� ��ư Ŭ����
		if(e.getSource()==b1) {		
			String id = tf.getText();
		// �Է��� id�� ������ �����ϰ� ���̰� 1 �̸��̶��
			if(id.trim().length() < 1) {	
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���!");
				tf.requestFocus();
				return;
			}
			
			String pw = String.valueOf(pf.getPassword());
		// �Է��� pw�� ������ �����ϰ� ���̰� 1 �̸��̶��
			if(pw.trim().length() < 1) {	
				JOptionPane.showMessageDialog(this, "PASSWORD�� �Է��ϼ���!");
				pf.requestFocus();
				return;
			}
		//�Է¿Ϸ��
			if(id.equals(ID)) {		
			// ���̵�� ����� ���� ��
				if(pw.equals(PW)) {		
					JOptionPane.showMessageDialog(this, id + "���� �α��� �Ǿ����ϴ�");
				}
			// ���̵�� ������ ����� Ʋ�� ��
				else {					
					JOptionPane.showMessageDialog(this, "Password�� Ʋ���ϴ�");
					pf.setText("");
					pf.requestFocus();
				}
			}
		// ���̵� Ʋ�� ��
			else {							
				JOptionPane.showMessageDialog(this, "ID�� �������� �ʽ��ϴ�");
				tf.setText("");
				pf.setText("");
				tf.requestFocus();
			}
			
		}
	// ��� ��ư Ŭ����
		else if(e.getSource()==b2) {	
			System.exit(0); 			// ��������
		}
			
		
	}

}
