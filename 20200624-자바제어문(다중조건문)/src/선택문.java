/*
 * 	선택문
 * 	switch(정수, 문자, 문자열) {
 * 		case 정수값:   <================================ 세미콜론;이 아니라 콜론:을 찍어야 함.
 * 			처리문장										정수값(라벨)은 중복되지 않아야 함.
 * 			break; 	 <================================  break;가 있는 문장까지만 수행.
 * 		case 정수값:
 * 			처리문장
 * 		case 정수값:
 * 			처리문장
 * 	}
 */
import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		int select = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수(1~5) : ");
		select = scan.nextInt();
		
		switch (select) {
		case 1:
		case 2:
			System.out.println("1~2번 입력");
			break;
		case 3:
			System.out.println("3번 입력");
			break;
		case 4:
			System.out.println("4번 입력");
			break;
		case 5:
			System.out.println("5번 입력");
			break;
		default:
			System.out.println("1~5번 까지만 입력하세요");	
		}

	}

}
