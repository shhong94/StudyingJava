/*
 * 	1. 난수 저장하는 배열, answer 저장하는 배열
 * 	2. 입력값 받는 변수
 * 	3. 입력값을 받기
 * 	4. while 무한루프
 * 		① 중복 체크
 * 		② 범위 체크
 * 		③ 비교(2중for문 활용하여 난수배열, answer배열 인덱스 비교)
 * 				a. 숫자만 같은지
 * 				b. 숫자와 인덱스가 같은지
 * 		④ 출력
 * 
 * 	중복체크
 * 	1. 난수를 최종 저장할 배열
 * 	2. 임시저장할 변수
 * 	3. 불린true 중복ㅇㅇ false 중복 ㄴㄴ
 * 	4. while(체크)
 * 			변수에 난수 임시저장 및 종료
 * 			조건문(난수배열의 인덱스값과 난수 변수가 같을 경우) 불린값 true, break
 * 		
 */
import java.util.*;
public class 연습_숫자야구 {

	public static void main(String[] args) {
		// 난수를 저장하는 배열
		int[] arr = new int[3];
		// 난수 임시저장할 변수
		int random = 0;
		// 입력값을 저장할 배열
		int[] user = new int[3];
		// 입력값을 임시저장할 변수
		int input = 0;
		
		
	// 1. 난수 주입(중복체크)
		boolean check = false;
		for(int i = 0; i < 3; i++) {
			check = true;
			while(check) {
				random = (int)(Math.random()*9)+1;
				check = false;
				for(int j = 0; j < i; j++) {
					if(arr[j] == random) {
						check = true;
						break;
					}
				}
			}
			arr[i] = random;
		}
		
// 난수배열 출력
		for(int i : arr) {
			System.out.println(i + " ");
		}
		
		Scanner scan = new Scanner(System.in);

	// while 루프
		while(true) {
			// 2. 입력값 받기
			System.out.print("3자리 정수를 입력하세요 : ");
			input = scan.nextInt();
			// 3. 범위 체크
			if(input < 100 || input > 999) {
				System.out.println("100과 999사이의 정수를 입력하세요");
				continue;
			}
			// 4. 중복 체크
			user[0] = input / 100;
			user[1] = (input%100) / 10;
			user[2] = input % 10;
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("중복된 숫자를 입력할 수 없습니다.");
				continue;
			}
			
			// 5. 비교
			int s = 0;
			int b = 0;
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(arr[i] == user[j]) {
						if(i == j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			
			// 힌트 출력
			System.out.println("=========== 힌트 ===========");
			System.out.print("S : ");
			for(int i = 0; i < s; i++) {
				System.out.print("●");	
			}
			System.out.println();
			System.out.print("B : ");
			for(int i = 0; i < b; i++) {
				System.out.print("●");	
			}	
			System.out.println();
			
			// 종료
			if(s == 3) {
				System.out.println("정답입니다!");
				break;
			}
			
		}
		
		

	}

}
