/*
 * 	�� do ~ while
 * 
 * 	�Է¹��� ������ �ش�Ǵ� ������
 */
import java.util.*;
public class �ݺ���2 {

	public static void main(String[] args) {
		// ����
		int i = 9;		// ���� ����
		int user = 0;	// �Է¹��� ��
		
		// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("2~9 ������ ���� �� ���� �Է��ϼ��� : ");
		user = scan.nextInt();
		
		// �ݺ���
		do {
			System.out.printf("%d * %d = %d\n", user, i, (user * i));
			i--;
		} while (i >= 1);

	}

}
