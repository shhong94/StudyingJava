/*
 * 	◆ switch 중첩
 * 		switch(정수) {
 * 		case 1:
 * 			switch(정수) {
 * 			case 'A':
 * 			}
 * 		}
 */	

import java.util.*;
public class 선택문6 {

	public static void main(String[] args) {
	// 변수
		int user = 0;
		int com = (int)(Math.random()*3);
	// 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0) 바위(1) 보(2) 중 하나를 입력하세요 : ");
		user = scan.nextInt();
		System.out.println("\n========================================\n");
		System.out.println("유저 : " + user);
		System.out.println("컴퓨터 : " + com);
		
	// 제어문
		switch(user) {
		case 0: // 가위
			switch(com) {
			case 0:
				System.out.println("비겼습니다");
				break;
			case 1:
				System.out.println("당신이 졌습니다");
				break;
			case 2:
				System.out.println("당신이 이겼습니다");
				break;
			}
			break;
		case 1: // 바위 
			switch(com) {
			case 0:
				System.out.println("당신이 이겼습니다");
				break;
			case 1:
				System.out.println("비겼습니다");
				break;
			case 2:
				System.out.println("당신이 졌습니다");
				break;
			}
			break;
		case 2: // 보
			switch(com) {
			case 0:
				System.out.println("당신이 졌습니다");
				break;
			case 1:
				System.out.println("당신이 이겼습니다");
				break;
			case 2:
				System.out.println("비겼습니다");
				break;
			}
			break;
		}
		

	}

}
