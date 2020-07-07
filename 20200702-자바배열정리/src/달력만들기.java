/*
 * 	년, 월 입력값 받기
 */
import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
	// 변수
		int year = 0, month = 0;
		Scanner scan = new Scanner(System.in);
		
		
	// 입력값 받기
		System.out.print("연도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.println();
		
		
	// 일 ~ 월 출력
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토",};
		System.out.println(year + "년도 " + month + "월");
		
		for(String week : strWeek) {
			System.out.print(week + "\t");
		}
		
		
		// 요일 구하기
/*		1. 전년도까지의 일 수의 합
 * 		2. 전 달까지의 일 수의 합
 * 		3. 1 더하기 (입력한 월의 달력은 1일부터 출력되므로)	
 */
		
	// 1. 전년도까지의 합
		int total = ((year-1)*365) + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
	// 2. 전 달까지의 합
		// 2-1. 각 월별 요일수 배열
		int[] lastDay = {31, 28, 31, 30, 31, 30,
						 31, 31, 30, 31, 30, 31};
		// 2-2.	윤년에 따른 2월 요일 수 조건문
		if((year) % 4 == 0 && (year) % 100 != 0 || ((year) % 400 == 0)) {
			lastDay[1] = 29;
		}
		else {
			lastDay[1] = 28;
		}
		// 2-3. 전 달의 합 계산
		for(int i = 0; i < month-1; i++) {
			total += lastDay[i];
		}
		
	// 3. 입력한 월의 1일자의 요일
		total++;	// 전 달까지의 합에 1 더하기
		int week = total % 7; // week는 입력받은 월의 요일(0은 일요일 ~ 6은 토요일)
		
	// 달력 출력
		System.out.println();
		for(int i = 1; i <=lastDay[month-1]; i++) {
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
