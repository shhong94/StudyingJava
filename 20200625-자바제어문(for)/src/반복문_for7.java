/*
 * ���ٿ� ����
 * 1~100 ������ ���� �߻���Ű�� 
 * ����ڰ� ������ ���ߴ� ����
 */
import java.util.*;
public class �ݺ���_for7 {

	public static void main(String[] args) {
		// ��ǻ�Ͱ� ���� �߻� 
//		int win = (int) Math.random()*100 + 1;
//		int user;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١� 1~100 ������ ���ڸ� ���߼��� �١ڡ١ڡ١ڡ١ڡ١�");
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
//				System.out.println("�١ڡ١ڡ١ڡ١ڡ١� �����Դϴ�! �١ڡ١ڡ١ڡ١ڡ١�");
//				break;
//			}
//		}
		
	// ���� �߻�
		int com = (int) ((Math.random()*100) + 1);
	// �Է� Ƚ���� ���� ����
		int count = 0;
	// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
	// ���ѷ��� ����
		for(;;) {
			System.out.print("1~100 ������ ���ڸ� ���߼��� : ");
			int user = scan.nextInt();
			// �߸� �Է����� ��
			if(user < 1 || user > 100) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}
			// ���� �Է����� ��
			if(com > user) {
				System.out.println("\n�� ���� ���ڸ� �Է��ϼ���");
				System.out.println();
				count += 1;
			}
			else if(com < user) {
				System.out.println("\n�� ���� ���ڸ� �Է��ϼ���");
				System.out.println();
				count += 1;
			}
			else {
				System.out.println("\n�١ڡ١ڡ١ڡ١ڡ١� �����Դϴ�! �١ڡ١ڡ١ڡ١ڡ١�");
				System.out.println(count + "�� ���� ���߼̽��ϴ�");
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�");
	}	

}
