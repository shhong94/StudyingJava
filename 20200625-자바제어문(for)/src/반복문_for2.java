/*
 * 	2~9 사용자가 입력하여 
 * 	구구단 출력
 */
import java.util.*;
public class 반복문_for2 {

	public static void main(String[] args) {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2와 9 사이의 정수를 한 개 입력하세요 : ");
		input = scan.nextInt();
		
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, (input * i));
		}

	}

}
