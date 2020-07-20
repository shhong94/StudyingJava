package com.sist.exception;
/*
 * 	◆ 예외처리의 형식
 * 		1. 하나씩만 처리
 * 				NumberFormatException
 * 				ArrayIndexOutOfBoundsException
 * 				NullPointerException
 * 				IOException
 * 				SQLException
 * 		2. 여러개 처리
 * 				RuntimeException
 * 				Exception
 * 				Throwable
 * 
 * 	◆ 예외처리 생략
 * 		1. 원래 자바의 모든 코드에는 예외처리가 생략되어있음
 * 			(특별한 경우에는 예외처리를 직접 해야 함. if문으로 주로 처리)
 * 		2. 반드시 예외처리 해야 하는 경우
 * 			IO, 쓰레드, 네트워크, 데이터베이스....
 * 		
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		try {
			String num1 = JOptionPane.showInputDialog("첫번째 정수 입력 :");
			String num2 = JOptionPane.showInputDialog("두번째 정수 입력 :");
		// 배열에 첨부
			int[] arr = new int[2];
		// 문자열을 정수로 변환
			arr[0] = Integer.parseInt(num1);
			arr[1] = Integer.parseInt(num2);
			
			int result = arr[0]/arr[1];
			System.out.println("result =" + result);
		}
//		catch(NumberFormatException e) {
//			System.out.println("정수만 입력");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열범위 초과");
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없음");
//		}
		catch(RuntimeException e) {
//			System.out.println(e.getMessage());		// 통으로 잡으면 어디서 에러났는지 모르므로
			e.printStackTrace();
		}											// e.getMessage() 메소드 사용
		System.out.println("프로그램 종료");
	}
}
