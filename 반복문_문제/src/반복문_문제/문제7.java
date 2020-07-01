package 반복문_문제;

import java.util.*;
public class 문제7 {

	public static void main(String[] args) {
		// 변수
		int user = 0;
		
		// 스캐너 
		Scanner scan = new Scanner(System.in);
		
		// 반복문 + 입력값 받기
		for(;;) {
			System.out.print("정수 입력 : ");
			user = scan.nextInt();
			if(user >= 60) {
				System.out.println("합격");
				break;
			}
			else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
// =========================================================
		
		
		// 변수
		int user2 = 0;
		
		// 반복문
		while(true) {
			System.out.print("정수 입력 : ");
			user2 = scan.nextInt();
			if(user2 >= 60) {
				System.out.println("합격");
				break;
			}
			else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}
	}

}
