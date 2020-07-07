/*
 * 	◆ 지역변수를 다른 메소드에서 사용할 떄는 매개변수를 이용하여 전송
 */
import java.util.*;
public class 달력만들기_절차적언어 {
	
	
	
// ==================================================================================== 메인	
	public static void main(String[] args) {
	// 연도와 월 입력받기	
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		System.out.println(year + "년도" + month + "월");
		
	// 요일 출력
		char[] days = {'일', '월', '화', '수', '목', '금', '토'};
		for(char i : days) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		
	// 전 년도까지의 요일 합계
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
	// 합계+1, 7로 나눈 나머지 변수에 저장
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
