/*
 * 	���ڸ� �Է¹޾�
 * 	����, ���ĺ�, �ѱ�, Ư������
 */
import java.util.*;
public class �������ǹ�4_2 {

	public static void main(String[] args) {
	// ����
		char ch = 'a';
	// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		ch = scan.next().charAt(0);
	// ����
		if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "��(��) �����Դϴ�");
		}
	// ���ĺ�
		else if (ch >= 'A' && ch <= 'z') {
			System.out.println(ch + "��(��) ���ĺ��Դϴ�");
		}
	// �ѱ�
		else if (ch >= '��' && ch <= '�R') {
			System.out.println(ch + "��(��) �ѱ��Դϴ�");
		}
	// Ư������
		else {
			System.out.println(ch + "��(��) Ư�������Դϴ�");
		}
	}

}
