package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// �׸��� ���̾ƿ� ����
public class PuzzleGame extends JFrame implements ActionListener{
	JButton b1, b2;
	JButton[][] pan = new JButton[3][3];
	int[][] panCount = new int[3][3];
	int bRow = 0;
	int bCol = 0;
	
	public PuzzleGame() {
		b1 = new JButton("����");
		b2 = new JButton("����");
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		add("South", p);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 3, 5, 5));
		int k = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				pan[i][j] = new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("����ü", Font.BOLD, 50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;
			}
		}
		add("Center", p2);
		
		getRand();
		display();
		
		setSize(350, 400);
		setVisible(true);
		
		b1.addActionListener(this);  		// �̺�Ʈ ���
	}
	
	// 0~8 �����߻� (�ߺ�üũ) ���� ���常 �ϰ� �Ѱ��� ���� ������ void
	public void getRand() {
		int[] com = new int[9];
		int su = 0;
		boolean check = false;
		for(int i = 0; i < 9; i++) {
			check = true;
			while(check) {
				su = (int)(Math.random()*9);
				check = false;
				for(int j = 0; j < i; j++) {
					if(com[j] == su) {
						check = true;
						break;
					}
				}
			}
			com[i] = su;
			panCount[i/3][i%3] = su;		// panCount �迭�� ���� ����
			
			if(su == 8) {
				bRow = i/3;
				bCol = i%3;
			}
  		}
	}
	// ������ ��ġ�ϴ� �޼ҵ�
	public void display() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == bRow && j == bCol) {		// ������ ��ȣ�� �������� �ٲ�
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else {
					pan[i][j].setText(String.valueOf(panCount[i][j] + 1));	// ������ 0~8�̱� ������ 1�� ���ؾ� 1~9�� ��
					pan[i][j].setEnabled(true);
				}
			}
		}
	}
	
	// ���Ῡ�� Ȯ�� �޼ҵ�
	public boolean isEnd() {
		int k = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(panCount[i][j] != k) {
					return false;
				}
				k++;
			}
		}
		return true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			getRand();
			display();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(e.getSource() == pan[i][j]) {
					panCount[bRow][bCol] = panCount[i][j];	// panCount[bRow][bCol]�� ����, panCount[i][j]�� Ŭ���� ����.
					panCount[i][j] = 8;						// ���� ��ġ�� �ڹٲ� ��.
					bRow = i;
					bCol = j;
					display();
					if(isEnd()) {
						JOptionPane.showMessageDialog(this, "Game Over!");
						System.exit(0);
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new PuzzleGame();
	}
}
