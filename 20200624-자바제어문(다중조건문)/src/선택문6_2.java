import java.util.*;
public class 선택문6_2 {

	public static void main(String[] args) {
		// 변수
				int user = 0;
				int com = (int)(Math.random()*3);
			// 입력
				Scanner scan = new Scanner(System.in);
				System.out.print("가위(0) 바위(1) 보(2) 중 하나를 입력하세요 : ");
				user = scan.nextInt();
				System.out.println("\n========================================\n");
			
				// 
				
			// 승부 계산
				String[] str = {"가위", "바위", "보"};
				System.out.println("컴퓨터 : " + str[com] + "\n유저: " + str[user]);
				
				switch(com - user) {
				case 2: case -1:
					System.out.println("☆★☆★☆★ 유저 Win! ☆★☆★☆★");
					break;
				case 1: case -2:
					System.out.println("☆★☆★☆★ 컴퓨터 Win! ☆★☆★☆★");
					break;
				default:
					System.out.println("☆★☆★☆★ Draw! ☆★☆★☆★");
					break;
				}
					

	}

}
