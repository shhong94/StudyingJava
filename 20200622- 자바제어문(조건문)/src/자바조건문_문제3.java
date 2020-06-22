/*
 *  사용자가 0, 1, 2를 입력
 *  0이면 가위
 *  1이면 바위
 *  2면 보
 *  
 *  Math.random() = 0.0 ~ 0.99 출력
 *  여기에 3을 곱하면 0.0 ~ 0.29 출력
 *  여기에 int로 형변환 하면 최종 출력되는 난수는 0, 1, 2
 *  
 *  기본형 데이터는 비교 가능
 *  문자열은 비교 불가
 *  가.
 */

import java.util.*;
public class 자바조건문_문제3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0(가위), 1(바위), 2(보) 입력 : ");
		int user = scan.nextInt();
		
		// 유저
		if (user == 0)
		{
			System.out.println("User : 가위");
		}
		if (user == 1)
		{
			System.out.println("User : 바위");
		}
		if (user == 2)
		{
			System.out.println("User : 보");
		}
		
		// 컴퓨터
		int com = (int)(Math.random()*3);   // Math.random() = 0.0 ~ 0.99 출력
		
		if (com == 0)
		{
			System.out.println("Com : 가위");
		}
		if (com == 1)
		{
			System.out.println("Com : 바위");
		}
		if (com == 2)
		{
			System.out.println("Com : 보");
		}
		
		// 중복 조건문
		// 컴퓨터가 가위일 때
//		if (com == 0)
//		{
//			if (user == 0)
//			{
//				System.out.println("비겼습니다");
//			}
//			if (user == 1)
//			{
//				System.out.println("유저가 이겼습니다");
//			}
//			if (user == 2)
//			{
//				System.out.println("컴퓨터가 이겼습니다");
//			}
//		}	
//		
//		// 컴퓨터가 바위일 때
//		if (com == 1)
//		{
//			if (user == 0)
//			{
//				System.out.println("컴퓨터가 이겼습니다");
//			}
//			if (user == 1)
//			{
//				System.out.println("비겼습니다");
//			}
//			if (user == 2)
//			{
//				System.out.println("유저가 이겼습니다");
//			}
//		}
//		
//		// 컴퓨터가 보일 때
//		if (com == 2)
//		{
//			if (user == 0)
//			{
//				System.out.println("유저가 이겼습니다");
//			}
//			if (user == 1)
//			{
//				System.out.println("컴퓨터가 이겼습니다");
//			}
//			if (user == 2)
//			{
//				System.out.println("비겼습니다");
//			}
//		}
		
	}

}
