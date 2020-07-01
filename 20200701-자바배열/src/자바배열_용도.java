/*
 * 가위 바위 보
 * 0 가위		1 바위	2 보
 */
import java.util.*;
public class 자바배열_용도 {

	public static void main(String[] args) {
		// 컴퓨터 
		int com = (int)(Math.random()*3);
		// 유저 입력값
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("0(가위) 1(바위) 2(보) 중 하나를 입력 : ");
		user = scan.nextInt();
		
		// 배열 생성
		String[] result = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터 : " + result[com]);
		System.out.println("컴퓨터 : " + result[user]);
		
		
	}

}
