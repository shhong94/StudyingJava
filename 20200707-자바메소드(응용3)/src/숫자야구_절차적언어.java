/*
 *  1. ���� �����ϴ� �迭, �ӽ������ϴ� ����
 *  2. �Է¹��� �� �����ϴ� �迭, �ӽ������ϴ� ����
 *  3. ��������(�ߺ�üũ)
 *  	�Ҹ�true �ߺ� false �ߺ��ƴ�
 *  4. �Է¹ޱ�
 *  5. ��
 *  	�� ���� s, b �ʱ�ȭ
 *  	�� for�� s �� b��ŭ �ݺ�
 *  6. ����
 *  7. process
 */
import java.util.*;
public class ���ھ߱�_��������� {

	public static void main(String[] args) {
		// ���� �����ϴ� �迭, �ӽ������ϴ� ����
		int[] com = new int[3];
		int random = 0;
		// �Է¹��� �� �����ϴ� �迭, �ӽ������ϴ� ����
		int[] user = new int[3];
		int input = 0;
		
		// ���� �ߺ�üũ
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
		for(int i = 0; i < com.length; i++) {
			System.out.println(com[i]);
		}
		
		// �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ������ �Է��ϼ��� : ");
			input = scan.nextInt();
			// ����üũ
			if(input < 100 || input > 999) {
				System.out.println("100�� 999������ ������ �Է��ϼ���");
				continue;
			}
			// �ߺ�üũ
			user[0] = input / 100;
			user[1] = (input % 100) / 10;
			user[2] = input % 10;
			if(user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("���ڴ� �ߺ��ǰ� �Է��� �� �����ϴ�");
				continue;
			}
			
			// ��
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
			System.out.println("================= ��Ʈ =================");
			System.out.print("S : ");
			for(int i = 0; i < s; i++) {
				System.out.print("��");
			}
			System.out.println();
			System.out.print("B : ");
			for(int i = 0; i < b; i++) {
				System.out.print("��");
			}
			System.out.println();
			
			if(s == 3) {
				System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١� ���� �١ڡ١ڡ١ڡ١ڡ١ڡ١�");
				break;
			}
		}
		
		
	}

}
