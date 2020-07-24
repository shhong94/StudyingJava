package com.sist.back;

import java.util.*;

// VO 입출력 클래스
public class BoardManager {
	private static ArrayList<BoardVO> list = new ArrayList<BoardVO>();		// 게시판 데이터는 모두가 공유해야 하므로 static
	
	// 게시물 번호 자동 증가(게시물번호는 개발자 측에서 입력해야줘야 하기 때문에) (오라클의 시퀀스랑 같은 개념)
	public int sequence() {
		int max = 0;
		
		for(BoardVO vo : list) {
			if(max < vo.getNo()) {
				max = vo.getNo();
			}
		}
		
		return max + 1;
	}
	
	// 추가
	public void insert(BoardVO vo) {
		vo.setRegdate(new Date()); 		// 오늘 날짜
		vo.setNo(sequence()); 			// 게시물 번호 				============> 이 두개는 사용자가 아니라 개발자 측에서 자동 입력되도록 조치해야 함
		list.add(vo);
	}
	
	// 목록 출력
	public ArrayList<BoardVO> select() {
		return list;
	}

}
