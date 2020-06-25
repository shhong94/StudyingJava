/*
 * 업다운 게임
 * 1~100 사이의 난수 발생시키고 
 * 사용자가 난수를 맞추는 게임
 */
import java.util.*;
public class 반복문_for7 {

	public static void main(String[] args) {
		// 컴퓨터가 난수 발생 
//		int win = (int) Math.random()*100 + 1;
//		int user;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("☆★☆★☆★☆★☆★ 1~100 사이의 숫자를 맞추세요 ☆★☆★☆★☆★☆★");
//		System.out.println();
//		user = scan.nextInt();
//		for(;;) {
//			if(user > win) {
//				System.out.println("DOWN");
//			}
//			else if(user < win) {
//				System.out.println("UP");
//			}
//			else {
//				System.out.println("☆★☆★☆★☆★☆★ 정답입니다! ☆★☆★☆★☆★☆★");
//				break;
//			}
//		}
		
	// 난수 발생
		int com = (int) ((Math.random()*100) + 1);
	// 입력 횟수를 세는 변수
		int count = 0;
	// 입력값 받기
		Scanner scan = new Scanner(System.in);
	// 무한루프 시작
		for(;;) {
			System.out.print("1~100 사이의 숫자를 맞추세요 : ");
			int user = scan.nextInt();
			// 잘못 입력했을 때
			if(user < 1 || user > 100) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			// 정상 입력했을 때
			if(com > user) {
				System.out.println("\n더 높은 숫자를 입력하세요");
				System.out.println();
				count += 1;
			}
			else if(com < user) {
				System.out.println("\n더 낮은 숫자를 입력하세요");
				System.out.println();
				count += 1;
			}
			else {
				System.out.println("\n☆★☆★☆★☆★☆★ 정답입니다! ☆★☆★☆★☆★☆★");
				System.out.println(count + "번 만에 맞추셨습니다");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}	

}
