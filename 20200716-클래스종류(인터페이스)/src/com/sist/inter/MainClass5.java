package com.sist.inter;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame{
	JTable table;				// 테이블 모양만
	DefaultTableModel model;	// 테이블 내 데이터 제어
	public MainClass5() {
		String[] col = {"", "이름", "성별", "주소"};
		Object[][] row = new Object[0][4];	// 데이터가 몇줄일지 모르니 행은 일단 0으로 설정
		
		// 데이터 편집이 안되도록 DefaultTableModel 내의 메소드를 재정의 해야 함.
		// 이미 JFrame을 상속받은 상태이니 재정의가 안될 것 같지만, 생성자를 생성하여 재정의 가능.
		model = new DefaultTableModel(row, col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		table = new JTable(model);
		table.setRowHeight(100);
		JScrollPane js = new JScrollPane(table);
		
		// 윈도우에 추가
		add("Center", js);
		setSize(350, 450);
		
		// 데이터 추가
		Object[] data = {new ImageIcon("c:\\javaDev\\a.png"), "홍길동", "남자", 'a'};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainClass5();
	}
}
