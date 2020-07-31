package UI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.data.*;
import java.net.*;

// 영화찾기
public class ListForm extends JPanel implements MouseListener {
	JButton b1, b2, b3, b4, b5, b6;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MovieDetailForm mdf = new MovieDetailForm();
	
	public ListForm() {
		setLayout(null);
		b1 = new JButton("현재상영영화");
		b2 = new JButton("개봉예정영화");
		b3 = new JButton("박스오피스(주간)");
		b4 = new JButton("박스오피스(월간)");
		b5 = new JButton("박스오피스(연간)");
		b6 = new JButton("검색");
		tf = new JTextField(20);
		JPanel p = new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
		p.setBounds(10, 25, 900, 35);
		add(p);
		String[] col = {"번호", "", "제목", "감독", "장르", "등급",};
		Object[][] row = new Object[0][6];		// 이미지도 갖고오므로 데이터형을 Object로 해야 됨
		
	// 메소드 오버라이딩
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		// 이미지 첨부
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		movieAllData(1);
		js.setBounds(10, 70, 700, 550);
		add(js);
		
		mdf.setBounds(715, 70, 800, 650);
		add(mdf);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	}
	
	public void movieAllData(int cno) {
		// 데이터 가져오기
		MovieManager m = new MovieManager();
		ArrayList<MovieVO> list = m.movieAllData(cno);
		// 테이블 한번 지우기(마지막부터 지우기)
		for(int i = model.getRowCount()-1; i >= 0; i--) {
			model.removeRow(i);
		}
		// 데이터출력
		for(MovieVO vo : list) {
			try {
				URL url = new URL(vo.getPoster());				// 이미지 가져오기
				Image img = ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data = {
						vo.getMno(),
						new ImageIcon(img),
						vo.getTitle(),
						vo.getDirector(),
						vo.getGenre(),
						vo.getGrade()
				};
				model.addRow(data);
			}
			catch(Exception e) {
				System.out.println(e.getStackTrace());
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == table) {
			if(e.getClickCount() == 2) {
				int row = table.getSelectedRow();
				String mno = model.getValueAt(row, 0).toString();
				mdf.detailPrint(Integer.parseInt(mno));
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
