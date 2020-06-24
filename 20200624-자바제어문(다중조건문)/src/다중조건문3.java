/*	사칙연산
 *  변수 : 정수 2개, 연산자(+ - * /)
 */
import java.util.*;
public class 다중조건문3 {

	public static void main(String[] args) {
	// 변수 초기화
		int a = 0, b = 0;
		char op = '+';
	// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("연산자를 입력하세요 (+ - * /) : ");
		op = scan.next().charAt(0);
		
		if (op == '+') {
			System.out.printf("%d + %d = %d", a, b, (a + b));
		}
		else if (op == '-') {
			System.out.printf("%d - %d = %d", a, b, (a - b));
		}
		else if (op == '*') {
			System.out.printf("%d * %d = %d", a, b, (a * b));
		}
		else if (op == '/') {
			if (b == 0) {
				System.out.printf("0으로 나눌 수 없습니다");
			}
			else {
				System.out.printf("%d / %d = %.2f\n", a, b, (a / (double)b));
			}
				
		}
		else {
			System.out.println("잘못된 연산자 입력입니다");
		}
		
	}

}
