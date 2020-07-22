package com.sist.lang;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

// toString()

public class MainClass4 extends JFrame implements MouseListener{
	JTable table;
	DefaultTableModel model;
	public MainClass4() {
		String[] col = {"이름", "나이", "주소"};
		String[][] row = new String[0][3];
		
		model = new DefaultTableModel(row, col) {
			public boolean isCellEditable(int r, int c) {
				return false;
			}
		};
	table = new JTable(model);					// 
	JScrollPane js = new JScrollPane(table);
	
	add("Center", js);
	
	for(int i = 0 ;i < 10; i++) {
		String[] data = {"홍홍홍"+(i+1), "30", "서울"};
		model.addRow(data);
	}
	setSize(350, 400);
	setVisible(true);
	
	table.addMouseListener(this);
	}
	
	
	public static void main(String[] args) {
		new MainClass4();

	}


	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == table) {
			if(e.getClickCount() == 2) {
				int row = table.getSelectedRow();	// 사용자가 어떤 행을 누를지 몰라서 getSelectedRow() 사용.
				String name = model.getValueAt(row, 0).toString();
				String age = model.getValueAt(row, 1).toString();
				String addr = model.getValueAt(row, 2).toString();
				String data = "이름 : " + name +"\n"
							+ "나이  : " + age + "\n"
							+ "주소 : " + addr + "\n";
				JOptionPane.showMessageDialog(this, data);
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
