/*
 *  사용자가 정수 입력
 *  12 1 2 겨울
 *  3 4 5 봄
 *  6 7 8 여름
 *  9 10 11 가을
 */
import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
	// 변수 초기화
		int month = 0;
	// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 월을 입력하세요 : ");
		month = scan.nextInt();
	// 계절 
		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월은 겨울입니다");
		}
		else if (month >= 3 && month <= 5) {
			System.out.println(month + "월은 봄입니다");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println(month + "월은 여름입니다");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println(month + "월은 가을입니다");
		}
		else {
			System.out.println("잘못된 월을 입력하였습니다");
		}

	}

}
