/*
 *  1. 난수 저장하는 배열, 임시저장하는 변수
 *  2. 입력받은 값 저장하는 배열, 임시저장하는 변수
 *  3. 난수주입(중복체크)
 *  	불린true 중복 false 중복아님
 *  4. 입력받기
 *  5. 비교
 *  	① 변수 s, b 초기화
 *  	② for문 s 및 b만큼 반복
 *  6. 종료
 *  7. process
 */
import java.util.*;
public class 숫자야구_절차적언어 {

	public static void main(String[] args) {
		// 난수 저장하는 배열, 임시저장하는 변수
		int[] com = new int[3];
		int random = 0;
		// 입력받은 값 저장하는 배열, 임시저장하는 변수
		int[] user = new int[3];
		int input = 0;
		
		// 난수 중복체크
		boolean check = false;
		for(int i = 0; i < com.length; i++) {
			check = true;
			while(check) {
				random = (int)(Math.random()*9)+1;
				check = false;
				for(int j = 0; j < i; j++) {
					if(random == com[j]) {
						check = true;
						break;
					}
				}
			}
			com[i] = random;
		}
		for(int i = 0; i < com.length; i++) {
			System.out.println(com[i]);
		}
		
		// 입력받기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력하세요 : ");
			input = scan.nextInt();
			// 범위체크
			if(input < 100 || input > 999) {
				System.out.println("100과 999사이의 정수를 입력하세요");
				continue;
			}
			// 중복체크
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("숫자는 중복되게 입력할 수 없습니다");
				continue;
			}
			
			// 비교
			int s = 0;
			int b = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(com[i] == user[j]) {
						if(i == j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			System.out.println("================= 힌트 =================");
			System.out.print("S : ");
			for(int i = 0; i < s; i++) {
				System.out.print("★");
			}
			System.out.println();
			System.out.print("B : ");
			for(int i = 0; i < b; i++) {
				System.out.print("★");
			}
			System.out.println();
			
			if(s == 3) {
				System.out.println("☆★☆★☆★☆★☆★☆★ 정답 ☆★☆★☆★☆★☆★☆★");
				break;
			}
		}
		
		
	}

}
