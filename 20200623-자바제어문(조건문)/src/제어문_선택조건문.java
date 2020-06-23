/*
 * 	◆ 선택 조건문
 * 		if(조건문)
 * 		{
 * 			조건문이 true일 때 수행하는 문장
 * 		}
 *  	else
 * 		{
 * 			조건문이 false일 때 수행하는 문장
 * 		}
 * 
 * 	◆ 문자열은 !=, ==를 사용하지 않음.
 * 		equals(), !equals() 사용. (equals는 참조형 데이터 주소 내의 데이터값을 '직접' 비교할 때 사용)
 * 		!=, ==는 데이터값이 저장되어 있는 주소를 비교할 때 사용
 */
import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// 문자 1개를 입력받아서 알파벳 여부 확인
		
		Scanner scan = new Scanner(System.in);
		
		char a = '0';
		
		System.out.print("1의 자리 숫자 1개를 입력하세요 : ");
		a = scan.next().charAt(0);  // charAt(0) : "ABC" 중에서 0번째인 A 출력.
				
		if (a >= '0' && a <= '9') {
			System.out.println(a + "은(는) 숫자가 맞습니다.");
		}
		else {
			System.out.println(a + "은(는) 문자입니다.");
		}
		// 정수면 정수라고, 나머지는 문자라고 출력
	}

}
