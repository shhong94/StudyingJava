package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 윈도우 창
public class ClientMainFrame extends JFrame implements ActionListener, MouseListener{
	//윈도우 크기 결정
	// 클래스에서 생성자 사용(선언이 아니라 구현할 떄)
/*		1. 데이터베이스 : 오라클연결
 * 		2. 네트워크 : IP, port 세팅
 * 		3. 웹 : 쿠키에서 값 읽기(자동 로그인)
 */
	
	JLabel title = new JLabel("영화 예매 & 추천 프로그램", JLabel.CENTER);
	MenuForm mf = new MenuForm();
	ChatForm cf = new ChatForm();
	ControllPanel cp;		// ????????????????????????????????????????????????????????????????????
	int curpage = 1;		// 현재 페이지
	int totalpage = 16;		// 총 페이지
	
	
	public ClientMainFrame() {
		cp = new ControllPanel(this);	// ????????????????????????????????????????????????????????????????????
										// 새로운 창이 아니라 현재 실행 중인 윈도우 창을 전송??
		
		title.setFont(new Font("굴림체", Font.BOLD, 55));
		title.setOpaque(true);
		setLayout(null);	// 카드레이아웃은 페이지 전체가 바뀌는거임
		title.setBounds(10, 15,1570, 100);
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 400);
		add(mf);
		// 채팅폼
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		// 윈도우 창
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);	// 이전버튼
		cp.ff.b2.addActionListener(this);	// 다음버튼
		
		cp.df.b2.addActionListener(this); 	// 목록
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
	
		for(int i = 0; i < 10; i++) {		// 포스터
			cp.ff.mc[i].addMouseListener(this);
		}
	
	}
	
	
	
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}
	static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mf.b1) {
			cp.card.show(cp, "FF");		// cp 위에 "FF"를 올려라
		}
		else if(e.getSource() == mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource() == cp.df.b2) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource() == cp.ff.b1) {	// 이전 버튼
			if (curpage > 1)
				curpage --;
				cp.ff.p.removeAll();			// JPanel의 모든 기능 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();				// JPanel의 원래 기능으로 재배치
		
		}
		else if(e.getSource() == cp.ff.b2) {	{	// 다음 버튼
			if(curpage < totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
			
		}
		else if(e.getSource() == cp.lf.b1) {
			cp.lf.movieAllData(1);
		}
		else if(e.getSource() == cp.lf.b2) {
			cp.lf.movieAllData(2);		
				}
		else if(e.getSource() == cp.lf.b3) {
			cp.lf.movieAllData(3);
		}
		else if(e.getSource() == cp.lf.b4) {
			cp.lf.movieAllData(4);
		}
		else if(e.getSource() == cp.lf.b5) {
			cp.lf.movieAllData(5);
		}
		
		
		
	}


// 포스터 클릭시 이벤트 구현 ===========================================================================================

	@Override
	public void mouseClicked(MouseEvent e) {
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == cp.ff.mc[i]) {
				if(e.getClickCount() == 2) {
					int a = (i+1)+((curpage*10)-10);	// 포스터 번호 계산
//					JOptionPane.showMessageDialog(this, "mno = " + a);
					cp.df.detailPrint(a);
					cp.card.show(cp,"DF");
					break;
				}
			}
		}
		
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
