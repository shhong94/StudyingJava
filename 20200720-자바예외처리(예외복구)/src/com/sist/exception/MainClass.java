package com.sist.exception;
/* 
 * 	◆ 예외처리
 * 		1. 자바의 모든 소스에는 예외처리가 있음
 * 		프로그램 실행과정시 오작동 / 비정상적으로 종료 => 에러
 */
public class MainClass {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;	// 에러이므로 catch로 이동
			System.out.println("c = " + c);		// 실행 안되는 문장
		}
		catch(Exception e) {
			System.out.println("에러발생");
		}
		System.out.println("프로그램 정상 종료");
	
//		int a = 10;
//		int b = 0;
//		int c = a/b;
//		System.out.println("c = " + c);
//		System.out.println("정상적으로 프로그램 종료");

	}
}
