/*
 * 	◆ 숫자야구
 * 		1. 
 */
import java.util.*;
public class 자바배열_용도2 {

	public static void main(String[] args) {
		// 배열 생성
		int[] com = {3, 6, 9};
		// 사용자 입력값 저장
		int[] user = new int[3];
		
		// 입력 받기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력 : ");
			int input = scan.nextInt();
		// 잘못 입력시	1
			if(input < 100 || input > 999) {
				System.out.println("잘못 입력!");
				continue;
			}
		// 잘못 입력시 2 (중복된 수 입력시)
			user[0] = input / 100;			// 123 / 100 = 1
			user[1] = (input % 100) / 10;	// 123 % 100 = 23 / 10 = 2
			user[2] = input % 10;			// 123 % 10 = 3
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복된 수는 입력 불가!");
				continue;
			}
			
		// user com 비교
			// 스트라이크, 볼
			int s = 0;
			int b = 0;
			// com 인덱스와 user 인덱스를 하나씩 비교
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					// com 인덱스 내의 숫자와 user 인덱스내의 숫자가 일치할 때
					if(com[i] == user[j]) {
						// com 인덱스 내의 숫자와 user 인덱스 내의 숫자가 일치하고
						// 각 인덱스 순서도 일치할 때
						if(i == j) {
							s++;
						}
						// com 인덱스 내의 숫자와 user 인덱스 내의 숫자가 일치하고
						// 각 인덱스 순서는 일치하지 않을 때
						else {
							b++;
						}
					}
				}
			}	
			
			// 결과값 출력
			System.out.println("========== 결과 ==========");
			System.out.print("S : ");
			for(int i = 0; i < s; i++) {
				System.out.print("●");
			}
			System.out.print("\nB : ");
			for(int i = 0; i < b; i++) {
				System.out.print("●");
			}
			System.out.println("\n===========================");
			
			// while문 종료
			if(s == 3) {
				System.out.println("정답입니다!\n게임을 종료합니다");
				break;
			}
		}
		
	
		
		

	}

}
