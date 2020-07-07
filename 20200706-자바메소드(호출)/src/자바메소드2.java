/*
 * 	사칙연산
 */

import java.util.*;
public class 자바메소드2 {
	
	static int plus(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multi(int a, int b) {
		return a * b;
	}
	
												// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	static void div(int a, int b) {				// 출력시에 경우의 수가 있다면 메소드 내에서 출력하는 것이 편함
		if(b == 0) {
			System.out.println("0으로 나눌 수 없다");
		}
		else {
			System.out.printf("%d / %d = %.2f\n", a, b, (double)a/b);
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
	// 연산자 받는 변수
		System.out.print("연산자 입력 (+, -, *, /): ");
		String op = scan.next();
		
	// 덧셈, 뺄셈, 곱셈 메소드의 결과값 받는 변수
		int result = 0;
		
		
	// 메소드 호출
		switch(op) {
		case "+":
			result = plus(a, b);
			System.out.printf("%d + %d = %d\n", a, b, result);
			break;
		case "-":
			result = minus(a, b);
			System.out.printf("%d - %d = %d\n", a, b, result);
			break;
		case "*":
			result = multi(a, b);
			System.out.printf("%d * %d = %d\n", a, b, result);
			break;
	// void 메소드는 결과값을 받지 않아도 됨
		case "/":
			div(a, b);
			break;
		default:
			System.out.println("올바른 연산자를 입력");
			break;
		}

	}

}
