/*
 *  사용자가 정수입력
 *  짝수 홀수 판단하는 메소드
 */
import java.util.*;
public class 자바메소드3응용2 {
	// 정수 입력받는 메소드
	static int userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1개를 입력 : ");
		int input = scan.nextInt();
		return input;
	}
	
	// 홀짝 판단하는 메소드
	static void isOddEven(int input) {
		if(input % 2 == 0) {
			System.out.println(input + "(은)는 짝수입니다");
		}
		else {
			System.out.println(input + "(은)는 홀수입니다");
		}
	}

	public static void main(String[] args) {
		isOddEven(userInput());

	}

}
