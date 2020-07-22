package com.sist.exception;
/*
 * 	◆ 예외 회피
 * 		1. 목적
 * 			에러 예측이 가능하게 함
 * 			개발자로 하여금 각자 프로그램에 맞게 처리하도록 유도
 *		2. 형식
 *			메소드() throws 예측한예외클래스(순서없이 나열가능)
 *			=> 해당하는 메소드에서 예외 처리
 */
public class MainClass {
	public int div(int a, int b) throws ArithmeticException {
		return a / b;
	}
	
	public static void main(String[] args) {
		MainClass m = new MainClass();
		System.out.println(m.div(2, 0));	// <=========== 런타임 예외는 생략가능
	}

}
