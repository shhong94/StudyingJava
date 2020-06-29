/*
 * 1. 변수
 * 2. 데이터형
 * 3. 연산자
 * 4. 제어문
 * ===========
 * 5. 데이터를 묶어서 사용(배열, 클래스)
 * 6. 명령문을 묶어서 사용(메소드)
 * ===========
 * 7. 데이터 + 명령문(객체지향 프로그램)
 * 8. 종료하지 않는 프로그램 제작(예외처리)
 * 9. 자바에서 제공하는 기능
 * 10. 자바에서 제공하는 기능
 * 11. 조립 (사용자정의 + 라이브러리)
 */
public class 기본문법정리 {

	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++) {
			for(int c = 5; c >= 6-a; c--) {
				System.out.print("*");
			}
			for(int b = 1; b <= a-1; b++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
