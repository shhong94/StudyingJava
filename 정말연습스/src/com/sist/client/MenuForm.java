package com.sist.client;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

// ��� �޴���
public class MenuForm extends JPanel{
	JButton home, pageOnShow, pageScheduled, pageRank, reserve;
	
	public MenuForm() {
		setBackground(Color.gray);
		home = new JButton("Ȩ");
		home.setFont(new Font("����ü",Font.BOLD,30));
		
		pageOnShow = new JButton("�����");
		pageOnShow.setFont(new Font("����ü",Font.BOLD,30));
		
		pageScheduled = new JButton("��������");
		pageScheduled.setFont(new Font("����ü",Font.BOLD,30));
		
		pageRank = new JButton("������");
		pageRank.setFont(new Font("����ü",Font.BOLD,30));
		
		
		reserve = new JButton("�����ϱ�");
		reserve.setFont(new Font("����ü",Font.BOLD,30));
				
		
		// ���̾ƿ� : �׸���
		setLayout(new GridLayout(1, 4, 1, 10));
		// JPanel�� �߰�
		// �޴���ư
		add(home);
		add(pageOnShow);
		add(pageScheduled);
		add(pageRank);
		
		
	}
	
}
