import java.util.Scanner;

/*
 * 		0		1		2		3		4
 * 
 *  ==============================================
 * 		1				2				3				0
 * 	==============================================
 * 				4				5						1	
 * 	==============================================
 * 		6				7				8				2
 * 	==============================================
 * 				9				10						3
 * 	==============================================
 * 		11				12				13				4
 * 	==============================================	
 */

public class 연습 {
// ======================================================================================================= 난수 주입 메소드
	static int[] getRandom() {
		int[] com = new int[3];
		int random = 0;
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
		return com;
	}
	
//=========================================================================================================== 입력받는 메소드
	static int[] userInput() {
		int[] user = new int[3];
		// 입력받기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력하세요 : ");
			int input = scan.nextInt();
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
			break;
		}
		return user;
	}
	
//=========================================================================================================== 힌트 출력 메소드
	static void hint(int[] com, int[] user) {
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
		if(isEnd(s)) {
			System.out.println("정답!!!!!");
			System.exit(0);
		}
		
		System.out.println();
	}
	
//=========================================================================================================== 종료여부확인 메소드
	static boolean isEnd(int s) {
		if(s == 3) {
			return true;
		}
		else {
			return false;
		}
	}

//=========================================================================================================== process 메소드
	static void process() {
		int[] com = getRandom();
		
		while(true) {
			int[] user = userInput();
			hint(com, user);
		}
	}
	
	public static void main(String[] args) {
		process();
	}
}
