package �ݺ���_����;

import java.util.*;
public class ����7 {

	public static void main(String[] args) {
		// ����
		int user = 0;
		
		// ��ĳ�� 
		Scanner scan = new Scanner(System.in);
		
		// �ݺ��� + �Է°� �ޱ�
		for(;;) {
			System.out.print("���� �Է� : ");
			user = scan.nextInt();
			if(user >= 60) {
				System.out.println("�հ�");
				break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
// =========================================================
		
		
		// ����
		int user2 = 0;
		
		// �ݺ���
		while(true) {
			System.out.print("���� �Է� : ");
			user2 = scan.nextInt();
			if(user2 >= 60) {
				System.out.println("�հ�");
				break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		}
	}

}
