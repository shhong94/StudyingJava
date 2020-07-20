package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			System.out.println("정수 저장 int i = 10");
			System.out.println("정수 저장 int j = 0");
			System.out.println(10/0);				// catch로 이동
			System.out.println("/결과값 출력 : " + (10/10) ); // 출력못함
		} catch (Exception e) {
			// 실행과정에서 에러 발생을 대비
			System.out.println("나누기 문제 발생(/zero");
		} finally {
			System.out.println("다시 입력하세요");	// 무조건 수행
		}
		System.out.println("프로그램 종료");

	}

}
