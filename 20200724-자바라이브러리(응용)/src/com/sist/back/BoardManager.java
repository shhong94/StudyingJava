package com.sist.back;

import java.util.*;

// VO ����� Ŭ����
public class BoardManager {
	private static ArrayList<BoardVO> list = new ArrayList<BoardVO>();		// �Խ��� �����ʹ� ��ΰ� �����ؾ� �ϹǷ� static
	
	// �Խù� ��ȣ �ڵ� ����(�Խù���ȣ�� ������ ������ �Է��ؾ���� �ϱ� ������) (����Ŭ�� �������� ���� ����)
	public int sequence() {
		int max = 0;
		
		for(BoardVO vo : list) {
			if(max < vo.getNo()) {
				max = vo.getNo();
			}
		}
		
		return max + 1;
	}
	
	// �߰�
	public void insert(BoardVO vo) {
		vo.setRegdate(new Date()); 		// ���� ��¥
		vo.setNo(sequence()); 			// �Խù� ��ȣ 				============> �� �ΰ��� ����ڰ� �ƴ϶� ������ ������ �ڵ� �Էµǵ��� ��ġ�ؾ� ��
		list.add(vo);
	}
	
	// ��� ���
	public ArrayList<BoardVO> select() {
		return list;
	}

}
