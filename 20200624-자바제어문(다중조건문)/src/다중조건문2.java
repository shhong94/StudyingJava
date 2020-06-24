// 각 달의 마지막 날짜 출력
// 6 입력 => 30 출력

// 31, 28, 31, 30, 31, 30
// 31, 31, 30, 31, 30, 31

// 31일 : 1 3 5 7 8 10 12
// 30일 : 4 6 9 11
// 28일 : 2

import java.util.*;
public class 다중조건문2 {

	public static void main(String[] args) {
	// 변수
		int month = 0;
	//사용자 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("********월별 일수 계산********\n");
		System.out.print("원하는 월을 입력하세요 : ");
		month = scan.nextInt();
	// 일수 계산 (가독성 중점)
		if (month == 2) {
			System.out.println(month +"월은 28일까지 있습니다");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month +"월은 30일까지 있습니다");
		}
		else {
			System.out.println(month +"월은 31일까지 있습니다");
		}
	}

}

// 