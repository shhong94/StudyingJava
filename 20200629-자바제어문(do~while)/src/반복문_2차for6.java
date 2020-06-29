import java.util.*;
public class 반복문_2차for6 {

	public static void main(String[] args) {
		// 사용자가 입력한 갯수만큼 별 출력
		
//		int user = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("1~10 사이의 정수를 입력 : ");
//		user = scan.nextInt();
//		
//		for(int b = 1; b <= user; b++) {
//			for(int c = 1; c <= user + 1 - b; c++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5; b++) {
				if(a == b) {
					System.out.printf("[%d,%d]", a, b);
				}
				else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
	}

}
