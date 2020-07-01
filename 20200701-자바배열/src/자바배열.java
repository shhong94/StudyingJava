/*
 *  사용자가 년 월 일을 입력하면 요일을 출력
 */
import java.util.*;
public class 자바배열 {

	public static void main(String[] args) {
		// 년도, 월, 일을 받는 변수가 필요
		int year = 0;
		int month = 0;
		int day = 0;
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.print("일 입력 : ");
		day = scan.nextInt();
		
		// 년월일 출력
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		
		// 요일 구하기
		/*
		 * 	1. 전 년도까지의 총 일수
		 * 		1년 1월 1일 ~ 2019년 12월 31일까지 계산
		 * 	2. 전 월까지의 총 일수
		 * 		2020년 1월 1일 ~ 2020년 6월 30일까지 계산
		 *  3. 입력된 day까지 총 일수
		 *  ===================
		 *  총 일수 % 7 = 요일 계산 가능
		 */
		
		
		
		// 1. 전 년도까지의 총 일수
		// 윤년 : 4년마다, 400년마다 윤년 / 100년마다 윤년 제외
		int total = ((year-1) * 365) + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400);
		
		// 2. 전 월까지의 총 일수
		 /*
		 1월 입력 => 0
		 2월 입력 => total + 31
		 3월 입력 => total + 31 + 28
		 4월 입력 => ......................
		 */
		int[] lastday = {31, 28, 31, 30, 31, 30,
						 31, 31, 30, 31, 30, 31};
		// 2월일 경우 28일 또는 29일
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;
		}
		
		
		// 계산
		for(int i = 0; i < month-1; i++) {
			total += lastday[i];
		}
		
		// 요일 구하기
		// 배열이 아니라 switch문을 쓰게 되면 소스량이 많아짐!
		int week= total % 7;
		char[] strWeek = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.println(strWeek[week] + "요일입니다");
		/*
		 *  switch (week){
		 *  case 0:
		 *  	week = '일';
		 *  	break;
		 *  case 1:
		 *  ....
		 *  ...
		 *  ..
		 *  .
		 * 	
		 *  }
		 */
		
		
		
	}

}
