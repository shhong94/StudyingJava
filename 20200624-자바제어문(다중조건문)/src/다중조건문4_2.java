/*
 * 	문자를 입력받아
 * 	숫자, 알파벳, 한글, 특수문자
 */
import java.util.*;
public class 다중조건문4_2 {

	public static void main(String[] args) {
	// 변수
		char ch = 'a';
	// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
	// 숫자
		if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "은(는) 숫자입니다");
		}
	// 알파벳
		else if (ch >= 'A' && ch <= 'z') {
			System.out.println(ch + "은(는) 알파벳입니다");
		}
	// 한글
		else if (ch >= '가' && ch <= '힣') {
			System.out.println(ch + "은(는) 한글입니다");
		}
	// 특수문자
		else {
			System.out.println(ch + "은(는) 특수문자입니다");
		}
	}

}
