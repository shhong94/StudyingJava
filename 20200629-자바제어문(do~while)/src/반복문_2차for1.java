/*
 * 	◆ 중첩 for문
 * 		1. 형식
 * 			for(초기값; 조건식; 증가식) {			<======== 세로 출력(열 수)
 * 				for(초기값; 조건식; 증가식) {		<======== 가로 출력(오 수)
 * 					반복수행문장
 * 				}
 * 			}
 * 		2. 실행순서
 * 			① 1차 초기값
 * 			② 1차 초기값
 * 			③ ★ 2차 for문 전체 ★
 * 			④ 1차 증가식
 */
public class 반복문_2차for1 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
		

	}

}
