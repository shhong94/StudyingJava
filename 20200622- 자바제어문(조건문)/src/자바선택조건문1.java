/*
 * 	선택 조건문 : if ~ else
 * 	◆ 형식
 * 		if (조건문)
 * 		{
 * 			실행문장    <=========================== 조건이 true일 때 수행하는 문장
 * 		}
 * 		else (조건문)
 * 		{
 * 			실행문장    <=========================== 조건이 false일 때 수행하는 문장
 * 		}
 * 
 * 	◆ 쓰임새
 * 		로그인 처리, 아이디 중복체크, 글쓰기(전송/취소), 짝수/홀수, 대문자/소문자
 */
import java.util.Scanner;
public class 자바선택조건문1 {

	public static void main(String[] args) {
		//Scanner를 저장 => 키보드의 입력값이 있는 경우에 수행.
		Scanner scan = new Scanner(System.in);  //System.in 사용자 키보드 입력값을 받는다
												//System.out 모니터에 출력시 사용
		System.out.print("정수를 입력(1~100): ");
		int a = scan.nextInt();  //입력된 값을 받아서 a라는 메모리 공간에 저장
		
		if (a < 1 || a > 100)
		{
			System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
		}
		else
		{
			System.out.println(a + "(이)가 입력되었습니다.");
		}
		
	}

}
