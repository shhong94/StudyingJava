/*
 * 두개의 정수를 받아서
 * 최대값, 최소값 
 * 
 */
import java.util.*;
public class 자바조건문_문제4 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수 두 개를 입력하세요 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int max, min;
//		
//		if (a > b)
//		{
//			max = a;
//			min = b;
//		}
//		else
//		{
//			max = b;
//			min = a;
//		}
//		
//		System.out.println("max : " + max);
//		System.out.println("min : " + min);
		
		// 정수를 입력 받아 절대값을 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 한 개를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num >= 0)
		{
			num = num;
		}	
		else
		{
			num = num * (-1);
		}
		
		System.out.println(num);
	}

}
