/*
 *  ����ڰ� ���� �Է�
 *  12 1 2 �ܿ�
 *  3 4 5 ��
 *  6 7 8 ����
 *  9 10 11 ����
 */
import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
	// ���� �ʱ�ȭ
		int month = 0;
	// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		month = scan.nextInt();
	// ���� 
		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "���� �ܿ��Դϴ�");
		}
		else if (month >= 3 && month <= 5) {
			System.out.println(month + "���� ���Դϴ�");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�");
		}

	}

}
