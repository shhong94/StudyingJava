// �� ���� ������ ��¥ ���
// 6 �Է� => 30 ���

// 31, 28, 31, 30, 31, 30
// 31, 31, 30, 31, 30, 31

// 31�� : 1 3 5 7 8 10 12
// 30�� : 4 6 9 11
// 28�� : 2

import java.util.*;
public class �������ǹ�2 {

	public static void main(String[] args) {
	// ����
		int month = 0;
	//����� �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("********���� �ϼ� ���********\n");
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		month = scan.nextInt();
	// �ϼ� ��� (������ ����)
		if (month == 2) {
			System.out.println(month +"���� 28�ϱ��� �ֽ��ϴ�");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month +"���� 30�ϱ��� �ֽ��ϴ�");
		}
		else {
			System.out.println(month +"���� 31�ϱ��� �ֽ��ϴ�");
		}
	}

}

// 