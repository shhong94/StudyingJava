/*
 * 	���ٿ� ����
 */
import java.util.*;
public class �ݺ����break_continue {

	public static void main(String[] args) {
		// ����
		int user = 0;								// �Է°�
		int com = (int) (Math.random()*100) + 1;	// ����
		int count = 0;								// ī��Ʈ
		// �Է°�
		Scanner scan = new Scanner(System.in);
		
		// �ݺ���
		while(true) {
			// �Է°� �ޱ�
			System.out.print("1~100 ������ ���ڸ� �Է��ϼ��� : ");
			user = scan.nextInt();
			// �Է°��� �������� Ŭ ��
			if(user > com) {
				System.out.println("\nDOWN!\n");
				count = count + 1;
				continue;
			}
			// �Է°��� �������� ���� ��
			else if(user < com) {
				System.out.println("\nUP!\n");
				count = count + 1;
				continue;
			}
			// ������ ��
			else if(user == com) {
				System.out.println("\n�����Դϴ�!");
				System.out.printf("%d�� ���� ���߼̽��ϴ�!\n", count);
				break;
			}
			// �Է°��� 1 �̸��̰ų� 100 �ʰ��� ��
			if(user < 1 || user > 100) {
				System.out.println("�߸��� �����Դϴ�");
				continue;
			}
		}

	}

}
