/*
 * 	�� ���ھ߱�
 * 		1. 
 */
import java.util.*;
public class �ڹٹ迭_�뵵2 {

	public static void main(String[] args) {
		// �迭 ����
		int[] com = {3, 6, 9};
		// ����� �Է°� ����
		int[] user = new int[3];
		
		// �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ������ �Է� : ");
			int input = scan.nextInt();
		// �߸� �Է½�	1
			if(input < 100 || input > 999) {
				System.out.println("�߸� �Է�!");
				continue;
			}
		// �߸� �Է½� 2 (�ߺ��� �� �Է½�)
			user[0] = input / 100;			// 123 / 100 = 1
			user[1] = (input % 100) / 10;	// 123 % 100 = 23 / 10 = 2
			user[2] = input % 10;			// 123 % 10 = 3
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("�ߺ��� ���� �Է� �Ұ�!");
				continue;
			}
			
		// user com ��
			// ��Ʈ����ũ, ��
			int s = 0;
			int b = 0;
			// com �ε����� user �ε����� �ϳ��� ��
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					// com �ε��� ���� ���ڿ� user �ε������� ���ڰ� ��ġ�� ��
					if(com[i] == user[j]) {
						// com �ε��� ���� ���ڿ� user �ε��� ���� ���ڰ� ��ġ�ϰ�
						// �� �ε��� ������ ��ġ�� ��
						if(i == j) {
							s++;
						}
						// com �ε��� ���� ���ڿ� user �ε��� ���� ���ڰ� ��ġ�ϰ�
						// �� �ε��� ������ ��ġ���� ���� ��
						else {
							b++;
						}
					}
				}
			}	
			
			// ����� ���
			System.out.println("========== ��� ==========");
			System.out.print("S : ");
			for(int i = 0; i < s; i++) {
				System.out.print("��");
			}
			System.out.print("\nB : ");
			for(int i = 0; i < b; i++) {
				System.out.print("��");
			}
			System.out.println("\n===========================");
			
			// while�� ����
			if(s == 3) {
				System.out.println("�����Դϴ�!\n������ �����մϴ�");
				break;
			}
		}
		
	
		
		

	}

}
