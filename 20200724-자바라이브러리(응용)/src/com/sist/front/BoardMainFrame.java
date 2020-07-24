package com.sist.front;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;		// ArrayList를 갖고 있는 BoardManager 가져오기
import java.text.*;			// SimpleDataFormat 원하는 모양으로 출력하는 클래스

// 메인화면
public class BoardMainFrame extends JFrame implements ActionListener {
	BoardListPanel bp = new BoardListPanel();
	BoardInsertPanel bi = new BoardInsertPanel();
	JTabbedPane tp = new JTabbedPane();		// 탭 초기화
	
	// 프로그램 연결 => ArrayList를 갖고 있는 BoardManager 가져오기
	BoardManager bm = new BoardManager();
	
	
	public BoardMainFrame () {
		
		tp.addTab("게시판 목록", bp);		// 탭 
		tp.addTab("글쓰기", bi);			// 탭
		tp.setTabPlacement(tp.BOTTOM);
//		tp.setSelectedIndex(1); 		// 처음 화면이 글쓰기 화면으로
		add("Center", tp);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bp.b.addActionListener(this);	// 새글
		bi.b1.addActionListener(this);	// 글쓰기
		bi.b2.addActionListener(this);	// 취소
	}
	
	public static void main(String[] args) {
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bp.b) {		// 새 글 버튼 클릭
			// 글쓰기 화면으로 이동
			tp.setSelectedIndex(1);
		}
		else if(e.getSource() == bi.b1) {		// 글쓰기 버튼 클릭
			// ArrayList에 저장
			// 입력한 데이터 읽어오기
			String name = bi.tf1.getText();
			String subject = bi.tf2.getText();
			String content = bi.ta.getText();
			String pwd = String.valueOf(bi.pf.getPassword());	// getPassword()는 char 배열로 이루어져 있기 때문에 문자열로 형변환 필요.
			BoardVO vo = new BoardVO();		// 위 데이터를 BoardVO 형식으로 묶기
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo);					// 묶은 데이터를 insert()
			listPrint();
			tp.setSelectedIndex(0);			// 게시판 목록으로 이동
			
			
		}
		else if(e.getSource() == bi.b2) {		// 취소 버튼 클릭
			// 목록으로 이동
			tp.setSelectedIndex(0);
		}
		
	}
	
	// 새 글을 작성하고 테이블에 데이터를 새로 출력하는 메소드 ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	public void listPrint() {
	// ArrayList 받아오기
		ArrayList<BoardVO> list = bm.select();
	// 테이블에 출력 (테이블 지운 후 출력)
		// 1. 테이블 지우기 (중복 출력 방지)
		for(int i = bp.model.getRowCount()-1; i>= 0; i--) {		// 마지막 글부터 0번까지 지우기 (마지막부터 지워야 전부 지워짐)
			bp.model.removeRow(i);
		}
		// 2. 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		// 날짜를 원하는 형식으로 출력	(MM : 월,    mm : 분)
		for(BoardVO vo : list) {
			String[] data = {
					String.valueOf(vo.getNo()),		// 정수형을 문자열로 변환
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),				// SimpleDateFormat 클래스 이용하여 원하는 형식으로 날짜 출력
					String.valueOf(vo.getHit())		// 정수형을 문자열로 변환
			};
			bp.model.addRow(data);
		}
	}
}
