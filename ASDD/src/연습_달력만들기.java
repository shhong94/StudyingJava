/*
 *  1. 연월 입력받을 변수
 *  2. 연월 입력받기
 *  3. 연월 출력 및 요일 출력
 *  4. 전달까지의 합 
 *  	① 전년도까지의 합(4년마다 윤년, 400년마다 윤년, 100년마다 제외)
 *  	② 전달까지의 합(월별 요일수 배열 생성, 윤년 고려하여 2월 요일 설정)
 *  	③ 합계에 1 더하고 7로 나눈 나머지를 week 변수에 저장
 *  5. 출력
 *  	① i가 1일때 week만큼 공백 주기
 *  	② 날짜 출력
 *  	③ week가 6 초과일 때 week를 0으로 초기화 및 줄바꿈 실행
 */
import java.util.*;
public class 연습_달력만들기 {

	public static void main(String[] args) {
		// 연월 입력받을 변수
		int year = 0;
		int month = 0;
		
		// 연월 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();

		
		// 연월 출력 요일 출력
		System.out.printf("%d년도 %d월\n", year, month);
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		for(int i = 0; i < days.length; i++) {
			System.out.print(days[i] + "\t");
		}
		System.out.println();
		
		// 전 년도까지의 합
		int total = (year-1)*365 + (year-1)/4 + (year-1)/400 - (year-1)/100;
		
		// 전 달까지의 합
		int[] lastDays = {31, 28, 31, 30, 31, 30,
						 31, 31, 30, 31, 30, 31};
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			lastDays[1] = 29;
		}
		else {
			lastDays[1] = 28;
		}
		for(int i = 0; i < month-1; i++) {
			total = total + lastDays[i];
		}
		
		// 합계에 1 더하고 7로 나눈 나머지를 변수에 저장
		total++;
		int week = total % 7;
		
		// 출력
		for(int i = 1; i <= lastDays[month-1]; i++) {
			if(i == 1) {
				for(int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if(week > 6) {
				week = 0;
				System.out.println();
			}
		}
	}

}
