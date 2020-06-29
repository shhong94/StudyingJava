/*
 * 	◆ do ~ while
 * 		1. 형식
 * 			int i = 1;
 * 			do {
 * 				System.out.print(i + " ");
 * 				i++;
 * 			} while(i <= 5);
 */

public class 반복문 {

	public static void main(String[] args) {
		// 초기값
		int i = 1;
		// 실행문장 + 증감식
		do {
			System.out.print(i);	// 실행문장
			i++;					// 증감식
		} while(i <= 5);			// 조건식

		System.out.println("\n ============================ \n");
		
		
		i = 1;
		while(i <= 10) {
			if (i == 5) {		// i가 5일 때 i++실행하고 바로 컨티뉴(아랫줄 출력명령문은 건너뜀)
				i++;
				continue;
			}
			System.out.print(i);
			i++;
		}
	
	}

}
