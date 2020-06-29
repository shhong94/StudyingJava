/*
 * 	◆ do ~ while
 * 
 * 	입력받은 정수에 해당되는 구구단
 */
import java.util.*;
public class 반복문2 {

	public static void main(String[] args) {
		// 변수
		int i = 9;		// 루프 변수
		int user = 0;	// 입력받은 값
		
		// 입력값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9 사이의 정수 한 개를 입력하세요 : ");
		user = scan.nextInt();
		
		// 반복문
		do {
			System.out.printf("%d * %d = %d\n", user, i, (user * i));
			i--;
		} while (i >= 1);

	}

}
