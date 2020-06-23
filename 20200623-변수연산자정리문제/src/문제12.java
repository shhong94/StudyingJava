/*
 * 	풀이 순서
 *  변수 선언 => 연산 처리 => 처리결과 출력
 */

import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {

		// 변수 선언하여 메모리에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 두개를 입력하세요 : ");
		int a = scan.nextInt();	// 사용자가 입력한 값을 변수에 대입
		int b = scan.nextInt();	// 사용자가 입력한 값을 변수에 대입
		
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
	}

}
