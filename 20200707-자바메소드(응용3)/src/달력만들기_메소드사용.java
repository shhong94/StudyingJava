import java.util.*;
public class 달력만들기_메소드사용 {

// 입력값 받기
	static int userInput(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + " 입력 : ");
		int num = scan.nextInt();
		return num;
	}
	
// 요일 구하기
	static int getWeek(int year, int month) {
		// 전 년도까지의 요일 합계
		int total = (year-1)*365 + (year-1)/4 + (year-1)/400 - (year-1)/100;
		
		for(int i = 1; i < month-1; i++) {
			total = total + lastDays(year, i);
		}
		// 합계+1, 7로 나눈 나머지 변수에 저장
		total++;
		int week = total % 7;
		
		return week;
	}
// 각 달의 마지막 날짜 리턴하는 메소드
	static int lastDays(int year, int month) {
		int[] lastDays = {31, 28, 31, 30, 31, 30,
				  		  31, 31, 30, 31, 30, 31};
		if(isYear(year)) {
			lastDays[1] = 29;
		}
		else {
			lastDays[1] = 28;			
		}
		return lastDays[month-1];
	}
	
// 윤달 계산
	static boolean isYear(int year) {
		boolean check = false;
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			check = true;
		}
		return check;
	}
	
// 달력 출력
	static void datePrint(int year, int month, int week) {
		int last = lastDays(year, month);
		
		char[] days = {'일', '월', '화', '수', '목', '금', '토'};
		for(char i : days) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 1; i <= last; i++) {
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
	
// 메소드 조립 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★	
	static void process() {
		int year = userInput("년도");
		int month = userInput("월");
		
	// 요일
		int week = getWeek(year, month);
	// 출력
		datePrint(year, month, week);
	}
	
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	public static void main(String[] args) {
		process();

	}

}
