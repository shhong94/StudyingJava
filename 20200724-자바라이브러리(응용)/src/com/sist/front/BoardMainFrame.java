package com.sist.front;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;		// ArrayList�� ���� �ִ� BoardManager ��������
import java.text.*;			// SimpleDataFormat ���ϴ� ������� ����ϴ� Ŭ����

// ����ȭ��
public class BoardMainFrame extends JFrame implements ActionListener {
	BoardListPanel bp = new BoardListPanel();
	BoardInsertPanel bi = new BoardInsertPanel();
	JTabbedPane tp = new JTabbedPane();		// �� �ʱ�ȭ
	
	// ���α׷� ���� => ArrayList�� ���� �ִ� BoardManager ��������
	BoardManager bm = new BoardManager();
	
	
	public BoardMainFrame () {
		
		tp.addTab("�Խ��� ���", bp);		// �� 
		tp.addTab("�۾���", bi);			// ��
		tp.setTabPlacement(tp.BOTTOM);
//		tp.setSelectedIndex(1); 		// ó�� ȭ���� �۾��� ȭ������
		add("Center", tp);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bp.b.addActionListener(this);	// ����
		bi.b1.addActionListener(this);	// �۾���
		bi.b2.addActionListener(this);	// ���
	}
	
	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bp.b) {		// �� �� ��ư Ŭ��
			// �۾��� ȭ������ �̵�
			tp.setSelectedIndex(1);
		}
		else if(e.getSource() == bi.b1) {		// �۾��� ��ư Ŭ��
			// ArrayList�� ����
			// �Է��� ������ �о����
			String name = bi.tf1.getText();
			String subject = bi.tf2.getText();
			String content = bi.ta.getText();
			String pwd = String.valueOf(bi.pf.getPassword());	// getPassword()�� char �迭�� �̷���� �ֱ� ������ ���ڿ��� ����ȯ �ʿ�.
			BoardVO vo = new BoardVO();		// �� �����͸� BoardVO �������� ����
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo);					// ���� �����͸� insert()
			listPrint();
			tp.setSelectedIndex(0);			// �Խ��� ������� �̵�
			
			
		}
		else if(e.getSource() == bi.b2) {		// ��� ��ư Ŭ��
			// ������� �̵�
			tp.setSelectedIndex(0);
		}
		
	}
	
	// �� ���� �ۼ��ϰ� ���̺� �����͸� ���� ����ϴ� �޼ҵ� �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
	public void listPrint() {
	// ArrayList �޾ƿ���
		ArrayList<BoardVO> list = bm.select();
	// ���̺� ��� (���̺� ���� �� ���)
		// 1. ���̺� ����� (�ߺ� ��� ����)
		for(int i = bp.model.getRowCount()-1; i>= 0; i--) {		// ������ �ۺ��� 0������ ����� (���������� ������ ���� ������)
			bp.model.removeRow(i);
		}
		// 2. ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		// ��¥�� ���ϴ� �������� ���	(MM : ��,    mm : ��)
		for(BoardVO vo : list) {
			String[] data = {
					String.valueOf(vo.getNo()),		// �������� ���ڿ��� ��ȯ
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),				// SimpleDateFormat Ŭ���� �̿��Ͽ� ���ϴ� �������� ��¥ ���
					String.valueOf(vo.getHit())		// �������� ���ڿ��� ��ȯ
			};
			bp.model.addRow(data);
		}
	}
}
