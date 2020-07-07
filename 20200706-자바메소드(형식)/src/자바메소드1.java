/*
 * 	◆ 메소드
 * 		1. 자동으로 메모리에 저장 (static)				<============== 정적 메소드
 * 		2. 프로그래머가 메모리를 할당하고 저장 (new생성자)	<==============	인스턴스 메소드
 * 		3. 메소드의 선언부만 사용						<==============	추상 메소드
 * 
 * 	◆ 메소드의 형태
 * 		1. 선언부 (메모리에 저장 안 됨)
 * 		2. 구현부 (메모리에 저장 됨)
 * 
 * 	◆ 메소드의 특징
 * 		1. 리턴값이 여러개일 경우 배열 또는 클래스로 리턴 가능
 * 		2. 매개변수는 3개 초과를 권장하지 않음
 * 				( ex = 10명의 국어점수의 평균을 구하는 메소드 작성 시, 10개의 매개변수가 아니라 배열로 묶어서 매개변수로 사용 가능)
 * 		3. return 결과값이 없는 경우에는 생략 가능(main 메소드...)
 * 
 * 	◆ 주의사항
 * 		1. 결과값을 무슨 타입으로?
 * 		2. 사용자로부터 어떤 값을 받아야?
 */

// 사용자로부터 정수 1개 입력받고
// 해당 구구단을 출력
// 결과값 O, 매개변수 O => 구구단을 묶어서 넘겨줌
// 결과값  X, 매개변수  O => 메소드 안에서 출력
import java.util.*;
public class 자바메소드1 {
	
	
	// 결과값 O, 매개변수 O
	static String multiTable1 (int num) {
 		String multi1 = "";
		for(int i = 1; i <= 9; i++) {
			multi1 += num + " * " + i + " = " + (num * i) + "\n";
		}
		
		return multi1;			// 메소드 multiTable1의 결과값을 받는 변수가 메인클래스에 있어야 출력이 가능
								/*
								 *	Stirng 변수 = multiTable1(num);
								 *	System.out.println(변수);
								 * 	
								 */
	}
	
	
	
// 결과값  X, 매개변수  O
	static void multiTable2 (int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		String multi1 = multiTable1(num);
//		System.out.println(multi1);
		for(int i = 2; i <= 9; i++) {
			String a = multiTable1(i);
			System.out.println(a);
		}
		
		
		
		

	}

}
