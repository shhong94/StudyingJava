package UI;

import java.awt.*;
import javax.swing.*;

// 화면 바꿔주는 클래스
public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
	ListForm lf = new ListForm();
	DetailForm df = new DetailForm();
	MovieForm ff;						// ????????????????????????????????????????????????????????????????????
	ClientMainFrame c;					// ????????????????????????????????????????????????????????????????????
	
	public ControllPanel(ClientMainFrame c) {
		this.c = c;						// 멤버변수 c와 생성자 매개변수 c를 같게?
		ff = new MovieForm(c);			// ????????????????????????????????????????????????????????????????????
		setLayout(card);
		add("FF", ff);
		add("LF", lf);
		add("DF", df);
	}
}
