/*
 * 	◆ 자바에서 지원하는 제어문
 * 		1. 조건문, 선택문
 * 			① 단일 조건문 (if)
 * 			② 선택 조건문 (if~else) : 로그인 처리, ID 중복체크
 * 			③ 다중 조건문 (if~else if~else)
 * 				맨 끝의 else문장은 생략 가능
 * 			④ 선택문 (switch~case)
 * 
 * 		2. 반복문
 * 			① 반복 횟수가 지정된 경우 (for)
 * 			② 반복 회수가 지정되지 않은 경우 (while)
 * 			③ 반드시 한 번 이상 수행할 경우 (do~while)
 * 
 * 		3. 반복제어문
 * 			① break : 반복을 종료
 * 			② continue : 특정 부분을 제외
 */

import java.util.*;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// 정수 2개, char 1개(+, -, *, /)
		
		int a, b, c;
		// a, b => 사용자가 입력
		// c => 연산 결과 저장
		char op = '+';
		Scanner scan = new Scanner(System.in);
		
		// 사용자 입력값 받기
		System.out.print("첫 번째 정수 입력 : ");
		a = scan.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		b = scan.nextInt();
		
		// Scanner는 char를 받아서 처리할 수 없음. 문자열로 변환해야 함.
		// System.in은 예외처리를 반드시 해야 함.
		System.out.println("연산자(+, -, *, /) : ");
		op = scan.next().charAt(0);
		
		if (op == '+') 
		{
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}
		if (op == '-') 
		{
			System.out.printf("%d - %d = %d\n", a, b, a - b);
		}
		if (op == '*') 
		{
			System.out.printf("%d * %d = %d\n", a, b, a * b);
		}
		if (op == '/') 
		{
			// 오류 처리
			if (b == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
				System.out.printf("%d / %d = %.2f\n", a, b, a / (double)b);
		}
	}

}
