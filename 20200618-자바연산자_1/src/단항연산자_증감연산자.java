/*
 *  1. 연산자
 *  	1) 연산자의 종류
 *  	2) 연산 방법
 *  	3) 연산자 우선순위
 */

public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		//전치연산
		int a = 10;
		int b = ++a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 10;
		b = a++ + a++ + a++ + a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
