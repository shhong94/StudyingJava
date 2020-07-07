/*
 * 	◆ 로그인 처리
 * 
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class 문자열3 extends JFrame implements ActionListener{
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	JLabel poster = new JLabel();
	
// 아이디와 비번 저장	
	final String ID = "admin";
	final String PW = "1234";
			
			
	public 문자열3() {
		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
// 포스터이미지 복사
		String s = "https://movie-phinf.pstatic.net/20200624_189/1592965781317Puv47_JPEG/movie_image.jpg";
		try {
			poster.setIcon(new ImageIcon(new URL(s)));
		}catch(Exception ex) {}
		setLayout(null);
		
// 버튼 크기		
		la1.setBounds(10, 15, 30, 30);
		tf.setBounds(45, 15, 150, 30);
		la2.setBounds(10, 50, 30, 30);
		pf.setBounds(45, 50, 150, 30);
		poster.setBounds(10, 135, 1000, 1000);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10, 90, 195, 35);
		
// 버튼 추가
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
// 윈도우 창 테마
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new 문자열3();
	}
/*
 *  1. 로그인 버튼 클릭시
 *  	① 아이디 길이 체크
 *  	② 비번길이 체크
 *  	③-a 입력완료시
 *  		ㄱ. 아이디와 비번이 맞을 때
 *  		ㄴ. 아이디는 맞으나 비번이 틀릴 때
 *  	③-b 아이디가 틀릴 때
 *  2. 취소버튼 클릭 시
 */

	@Override
	public void actionPerformed(ActionEvent e) {
	// 로그인 버튼 클릭시
		if(e.getSource()==b1) {		
			String id = tf.getText();
		// 입력한 id가 공백을 제거하고도 길이가 1 미만이라면
			if(id.trim().length() < 1) {	
				JOptionPane.showMessageDialog(this, "ID를 입력하세요!");
				tf.requestFocus();
				return;
			}
			
			String pw = String.valueOf(pf.getPassword());
		// 입력한 pw가 공백을 제거하고도 길이가 1 미만이라면
			if(pw.trim().length() < 1) {	
				JOptionPane.showMessageDialog(this, "PASSWORD를 입력하세요!");
				pf.requestFocus();
				return;
			}
		//입력완료시
			if(id.equals(ID)) {		
			// 아이디와 비번이 맞을 때
				if(pw.equals(PW)) {		
					JOptionPane.showMessageDialog(this, id + "님이 로그인 되었습니다");
				}
			// 아이디는 맞으나 비번이 틀릴 때
				else {					
					JOptionPane.showMessageDialog(this, "Password가 틀립니다");
					pf.setText("");
					pf.requestFocus();
				}
			}
		// 아이디가 틀릴 때
			else {							
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다");
				tf.setText("");
				pf.setText("");
				tf.requestFocus();
			}
			
		}
	// 취소 버튼 클릭시
		else if(e.getSource()==b2) {	
			System.exit(0); 			// 정상종료
		}
			
		
	}

}
