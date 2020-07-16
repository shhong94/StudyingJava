package com.sist.abs;
/*
 * 	◆ 클래스의 종류
 * 		1. 추상클래스					}- 서로 다른 클래스를 연결하여 사용
 * 		2. 인터페이스(추상클래스를 확장)	}
 * 			주된 사용 용도
 * 				① 기능이 여러개로 나눠지는 경우(버튼기능이 로그민, 취소, 시작, 종료로 분화)
 * 				② 여러 개의 클래스를 한개의 클래스로 제어할 때
 * 		3. 내부클래스
 * 				① 멤버클래스
 * 				② 익명클래스
 *
 *			추상클래스 				인터페이스
 *	==============================================
 *			 단일 상속					다중 상속
 *	==============================================
 *			구현된, 구현안 된		구현안된 메소드만 갖고잇음
 *			메소드 有
 *	==============================================
 *								기능추가시 모든 클래스가 에러
 *	==============================================
 *
 * 
 * 	◆ 클래스의 특성
 * 		1. 결합성 : 한 클래스를 수정하면 다른 클래스가 영향가는 정도
 * 					결합성이 낮을수록 유지보수에 용이
 * 		2. 응집성 : 한 개의 기능을 수행할 수 있는 능력(메소드와 관련)
 * 		
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implements MouseListener {


	public static void main(String[] args) {
		

	}
	
	// mouserListener 의 기능 하나만 필요해도 메소드를 전부 선언 / 구현해야됨

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
