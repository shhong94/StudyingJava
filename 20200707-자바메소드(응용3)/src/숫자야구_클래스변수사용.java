import java.util.Scanner;

public class 숫자야구_클래스변수사용 {
// 클래스 변수 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆ 클래스 변수
	static int[] com = new int[3];
	static int random = 0;
	static int[] user = new int[3];
	static int input = 0;
	static int s = 0;
	static int b = 0;
	
// 난수주입하는 변수 =================================================================================================== 난수주입하는 변수
	
	static int[] getRandom() {
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
	
// 입력받고 오류체크하는 메소드 ======================================================================================= 입력받고 오류체크하는 메소드
	static int[] userInput() {
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
			break;
		
		}
		return user;
	}
	
// 비교 및 힌트 출력하는 메소드 ==================================================================================== 비교 및 힌트 출력하는 메소드
	static void hint() {
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
		
		if (isEnd() == true) {
			System.out.println("★☆★☆★☆★☆★☆★☆★☆ 정답 ★☆★☆★☆★☆★☆★☆★☆");
			System.exit(0);
		}
	}
	
// 종료여부 확인하는 메소드 ====================================================================================== 종료여부 확인하는 메소드
	static boolean isEnd() {
		boolean check = false;
		if(s == 3) {
			check = true;
		}
		else {
			check = false;
		}
		return check;
	}
	
// 프로세스 ================================================================================================= 프로세스
	static void process() {
		int[] com = getRandom();
		
		while(true) {
			int[] user = userInput();
			hint();
		}
	
	}
	
	public static void main(String[] args) {
		process();

	}

}
