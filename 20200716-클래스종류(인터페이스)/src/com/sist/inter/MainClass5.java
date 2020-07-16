package com.sist.inter;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame{
	JTable table;				// ���̺� ��縸
	DefaultTableModel model;	// ���̺� �� ������ ����
	public MainClass5() {
		String[] col = {"", "�̸�", "����", "�ּ�"};
		Object[][] row = new Object[0][4];	// �����Ͱ� �������� �𸣴� ���� �ϴ� 0���� ����
		
		// ������ ������ �ȵǵ��� DefaultTableModel ���� �޼ҵ带 ������ �ؾ� ��.
		// �̹� JFrame�� ��ӹ��� �����̴� �����ǰ� �ȵ� �� ������, �����ڸ� �����Ͽ� ������ ����.
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
		
		// �����쿡 �߰�
		add("Center", js);
		setSize(350, 450);
		
		// ������ �߰�
		Object[] data = {new ImageIcon("c:\\javaDev\\a.png"), "ȫ�浿", "����", 'a'};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainClass5();
	}
}
