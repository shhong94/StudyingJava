package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();			// ���̾ƿ� : ī��
	PageOnShow pos = new PageOnShow();			// ����󿵿�ȭ ������
	PageScheduled ps = new PageScheduled();		// ����������ȭ ������
	PageRank pr = new PageRank();				// ������ ������
	DetailedPage dp = new DetailedPage();		// ��������
	Reserve rs = new Reserve();					// �����ϱ� ������
	Review rv = new Review();					// ���� �ı� ������
	
	public ControllPanel() {
		setBackground(Color.yellow);
		setOpaque(true);
		setLayout(card);
		add("POS", pos);
		
	}
}
