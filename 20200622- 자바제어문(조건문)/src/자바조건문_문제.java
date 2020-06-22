/*
 * 	1. if~else
 * 		정수를 입력받아서 
 * 		짝수인지 홀수인지 확인하는.
 * 		ex) "10은 짝수다" or "11은 홀수다"
 * 
 * 	2. 정수 3개를 입력받아서
 * 		총점, 평균, 학점 구하기
 * 		60 이상은 D
 * 		70 이상은 C
 * 		80 이상은 B
 * 		90 이상은 A
 * 		나머지는 F
 * 
 * 		국어 80
 * 		영어 80
 * 		수학 80
 * 
 * 		ex) 총점: 240
 * 			평균 : 80.0
 * 			학점 : B
 */

import java.util.*;
public class 자바조건문_문제 {

	public static void main(String[] args) {
		// 1번 문제
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("정수 입력 : ");
		a = scan.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println(a + "은(는) 짝수다");
		}
		else
		{
			System.out.println(a + "은(는) 홀수다");
		}
		
		

		

		
	}

}
