/*
 * 	사용자가 년도를 입력하면 윤년 여부 출력	
 */
import java.util.*;
public class 자바메소드1응용2 {
	
	// 연도 입력 메소드
		static int userInput() {
			Scanner scan = new Scanner(System.in);
			System.out.print("연도를 입력하시오 : ");
			int year = scan.nextInt();
			return year;
		}
	
	// 윤년 여부 확인 메소드
//		static boolean isLeapYear(int year) {
//			boolean check = false;
//			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
//				check = true;
//			}
//			else {
//				check = false;
//			}
//			return check;
//		}
		
		static void isLeapYear(int year) {
			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println("윤년입니다");
			}
			else {
				System.out.println("윤년이 아닙니다");
			}
		}
		
		
	
	
	public static void main(String[] args) {
		

	}

}
