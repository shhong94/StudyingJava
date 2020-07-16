package com.sist.abs;
/*
 * 	◆ 게시판				◆ 차별요소
 * 	1. 답변형		===> 	답변하기
 * 	2. 댓글형		===> 	댓글달기
 * 	3. 갤러리형	===> 	업로드
 * 	4. 자료실		===> 	업로드, 다운로드
 * 
 * 	◆ 게시판의 공통요소
 * 		1. 글쓰기	   ]===== 게시판별로 기능이 달라서 선언만 함
 * 		2. 내용보기    ]
 * 		3. 수정	}
 * 		4. 삭제	}====== 어느 게시판이나 동일하여 구현까지 함
 * 		5. 찾기	}
 * 
 * 	공통 요소 중에서
 * 	자식클래스마다 기능이 조금씩 다른건 선언만 하고
 * 	자식클래스별로 동일한 기능은 구현까지 함
 */


abstract class Board{
	public abstract void write();		// 글쓰기 선언
	public abstract void content();		// 내용보기 선언
	
	public void update() {					// 수정 구현
		System.out.println("게시물 수정");
	}				
	public void delete() {					// 삭제 구현
		System.out.println("게시물 삭제");
	}				
	public void find() {					// 찾기 구현
		System.out.println("게시물 찾기");
	}				
}

class ReplyBoard extends Board{
	@Override
	public void write() {
		System.out.println("글쓰기");
	}
	@Override
	public void content() {
		System.out.println("내용보기");
	}		
	// Board 클래스의 기능을 재정의 가능
}

class DataBoard extends Board{
	@Override
	public void write() {
		System.out.println("글쓰기 + 업로드");		
	}

	@Override
	public void content() {
		System.out.println("내용보기 + 다운로드");		
	}
}

class GalleryBoard extends Board{

	@Override
	public void write() {
		System.out.println("글쓰기 + 이미지 업로드");
	}

	@Override
	public void content() {
		System.out.println("내용보기 + 이미지 다운로드");
	}
}

class ReplyBoard2 extends Board{

	@Override
	public void write() {
		System.out.println("글쓰기");
	}

	@Override
	public void content() {
		System.out.println("내용보기 + 댓글추가");
	}		
	
}






public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("===== 답변형 =====");
		Board b = new ReplyBoard();
		b.write();
		b.content();
		System.out.println("===== 갤러리형 =====");
		b = new GalleryBoard();
		b.write();
		b.content();
		System.out.println("===== 자료실 =====");
		b = new DataBoard();
		b.write();
		b.content();
		System.out.println("===== 댓글형 =====");
		b = new ReplyBoard2();
		b.write();
		b.content();

	}

}
