import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class MovieFind extends JPanel{
	JLabel la = new JLabel("영화 검색", JLabel.CENTER);
	JLabel la2 = new JLabel("Search");
	JTextField tf = new JTextField();	// 검색창
	JTable table;						// 테이블모양으로 출력	1
	DefaultTableModel model;			// 데이터 입력			2
	TableColumn column;					// 테이블의 컬럼
	
	MovieFind() {
		setLayout(null);
		la.setFont(new Font("굴림체", Font.BOLD, 45));
		la.setBounds(10, 15, 1260, 50);
		add(la);							// "영화 검색"
		
		la2.setBounds(100, 75, 100, 35);	// "Search"
		add(la2);
		tf.setBounds(205, 75, 300, 35);		// 검색창
		add(tf);
		
		String[] col = {"순위", "영화명", "감독", "장르", "출연"};	// 테이블 메뉴
		String[][] row = new String[0][5];						// 테이블에 데이터 저장하는 곳
		
		model = new DefaultTableModel(row, col);
		table = new JTable(model);
		table.setRowHeight(40);									// 테이블 높이
		table.getTableHeader().setReorderingAllowed(false);		// 테이블 헤더 고정
		JScrollPane js = new JScrollPane(table);			// 스크롤바
		
		// 영화찾기
		MovieVO[] movies = MovieManager.movieFindData(1);
		for(MovieVO vo : movies) {
			String[] temp = {
				String.valueOf(vo.mno),
				vo.title,
				vo.director,
				vo.genre,
				vo.actor
			};
			model.addRow(temp);
		}
		
		js.setBounds(10, 120, 1260, 750);		// 스크롤바 설정
		add(js);
		
		// column의 크기 지정
		for(int i = 0; i < 5; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i == 0) {
				column.setPreferredWidth(50);
			}
			else if(i == 1) {
				column.setPreferredWidth(250);
			}
			else if(i == 2) {
				column.setPreferredWidth(220);
			}
			else if(i == 3) {
				column.setPreferredWidth(150);
			}
			else if(i == 4) {
				column.setPreferredWidth(450);
			}
			
		}
		
	}
}
