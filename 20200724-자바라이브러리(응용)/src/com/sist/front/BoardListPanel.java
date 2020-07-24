package com.sist.front;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

// 게시판 목록 화면
public class BoardListPanel extends JPanel {
	JButton b;
	JTable table;
	DefaultTableModel model;
	TableColumn column;
	
	public BoardListPanel() {
		// 테이블 생성
		b = new JButton("새 글");
		String[] col = {"번호", "제목", "이름", "작성일", "조회수"};
		String[][] row = new String[0][5];
		
		// 모델 재정의 (익명의 클래스)
		model = new DefaultTableModel(row, col){
			public boolean isCellEditable(int r, int c) {
				return false;
			}
		};
		
		table = new JTable(model);
		table.getTableHeader().setBackground(Color.orange);
		table.setShowVerticalLines(false);			// 테이블 가로줄 없애기
		table.setShowGrid(false);					// 테두리 아예 없애기
		table.setRowHeight(35);						// Row 높이
		table.setSelectionForeground(Color.white);	// 선택한 글자색 흰색으로
		table.setSelectionBackground(Color.GRAY);
		table.getTableHeader().setReorderingAllowed(false);		// 컬럼이 이동 못하게 설정
		
		JScrollPane js = new JScrollPane(table);
		js.getViewport().setBackground(Color.white);
		
		// 배치
		setLayout(null);
		b.setBounds(10, 15, 100, 30);
		js.setBounds(10, 50, 600, 380);
		add(b);
		add(js);
		
		// 테이블 컬럼 갖고오기
		for(int i = 0; i < 5; i++) {
			column = table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			if(i == 0) {	// 게시물 번호
				column.setPreferredWidth(30);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i == 1) {	// 제목
				column.setPreferredWidth(400);
				render.setHorizontalAlignment(JLabel.LEFT);
			}
			else if(i == 2) {	// 이름
				column.setPreferredWidth(60);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i == 3) {	// 작성일
				column.setPreferredWidth(80);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i == 4) {	// 조회수
				column.setPreferredWidth(40);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(render);
			
		}
		
		// 출력
//		String[] data = {"1", "ArrayList 연습", "홍홍홍", "2020-07-28", "0"};
//		model.addRow(data);
		
	
	}
}
