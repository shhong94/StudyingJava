/*
 * 	업다운 게임
 */
import java.util.*;
public class 반복제어문break_continue {

	public static void main(String[] args) {
		// 변수
		int user = 0;								// 입력값
		int com = (int) (Math.random()*100) + 1;	// 난수
		int count = 0;								// 카운트
		// 입력값
		Scanner scan = new Scanner(System.in);
		
		// 반복문
		while(true) {
			// 입력값 받기
			System.out.print("1~100 사이의 숫자를 입력하세요 : ");
			user = scan.nextInt();
			// 입력값이 난수보다 클 때
			if(user > com) {
				System.out.println("\nDOWN!\n");
				count = count + 1;
				continue;
			}
			// 입력값이 난수보다 작을 때
			else if(user < com) {
				System.out.println("\nUP!\n");
				count = count + 1;
				continue;
			}
			// 정답일 때
			else if(user == com) {
				System.out.println("\n정답입니다!");
				System.out.printf("%d번 만에 맞추셨습니다!\n", count);
				break;
			}
			// 입력값이 1 미만이거나 100 초과일 때
			if(user < 1 || user > 100) {
				System.out.println("잘못된 숫자입니다");
				continue;
			}
		}

	}

}
