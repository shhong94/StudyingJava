import java.util.*;
public class �ݺ���_2��for6 {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ������ŭ �� ���
		
//		int user = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("1~10 ������ ������ �Է� : ");
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
