package com.sist.abs;

/*
 *  ◆ 추상클래스
 *  	미완성이라서 new를 사용하여 메모리 할당 불가
 *  	항상 상속내린 후 하위클래스에서 구현
 *  	기본 틀이 존재
 *  	제시만 함(구현내용이 프로그램마다 다를 수 있음)
 *  
 *   (예)
 *  	1. 게시판을 만들어라
 *  	2. 게시판을 만드는데 글쓰기 내용보기 수정 삭제 기능을 만들어라  <== 추상클래스 (구체적인 기능 제시)
 *  
 *   (예)
 *   	영화관
 *   		영화목록, 예매, 상세보기, 이벤트 등
 *   			===> CGV, 메가박스, 롯데시네마
 *  
 */

abstract class 도형{
	public abstract void draw();	// 미구현 메소드 (모든 자식클래스들이 구현해야됨)
	public void color() {			// 구현된 메소드
		System.out.println("검정색으로 그림을 그린다");	// 자식클래스에서 도형 그리는 메소드 구현 이후
	}												// 부모클래스에서 검정색이라는 디폴트 설정
}

class 삼각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
		
	}
}


class 원 extends 도형{

	@Override
	public void draw() {
		System.out.println("원을 그린다");
		
	}

	@Override
	public void color() {					// 재정의
		System.out.println("빨간색으로 그림을 그린다");
	}
	
	
}
class 사각형 extends 도형{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		도형 g = new 삼각형();		// 구현된 자식클래스를 이용해 메모리 할당
		g.color();
		g.draw();
		
		g = new 사각형();
		g.color();
		g.draw();
		
		g = new 원();
		g.color();
		g.draw();
//============================== 도형 클래스 하나로 삼각형, 사각형, 원 클래스를 제어
//								 여러 클래스들을 하나의 클래스로 제어

	}

}
