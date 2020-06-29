/*
 * 	◆ 반복제어문
 * 		1. break
 * 			반복문 종료
 * 			반복문 전체에서 사용 가능(for, while, switch)
 * 		2. continue
 * 			특정부분 제외
 * 			주로 for문에서만 사용
 * 		★ break, continue는 한 개의 반복문만 제어 가능
 * 		★ continue => while문은 조건식으로 이동(무한루프에 걸릴 수 있음)
 * 					  for문은 증가식으로 이동
 */
public class 반복제어문break {

	public static void main(String[] args) {
		
		System.out.println("\n\n============= break 사용 ===============\n");
		// 1~10 출력
		// 5일 때 종료
		
		// 반복문 + break
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");	// 출력문을 if문 아래에 쓰면
			if (i == 5) {				// if문 내의 i는 6이 되야 1~5 출력함
				break;
			}			
		}
		
		System.out.println("\n\n============= continue 사용 ===============\n");
		
		// 반복문 + continue
		// 1~10 홀수만 출력(continue 이용)
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n============= i를 2씩 증가 ===============\n");
		
		// i를 2씩 증가
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n============= 조건문 사용 ===============\n");
		
		// 조건문 사용
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println("\n\n============= 조건문 사용 ===============\n");
		
		
	}

}
