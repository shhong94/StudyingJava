/*
 * 	1. ���� ���ǹ��� �������� ����ص� 
 * 		ó������ ���������� ����ȴ�. 
 * 
 * 	2. {}�� ������ ���� ���๮���� 1���� ����̴�.
 */
public class �ڹٴ������ǹ�2 {

	public static void main(String[] args) {
		int a = 15;
		// 3�� ���, 5�� ���, 7�� ���
		// �������ǹ� ������ (�� ������ ������ ����)
		if (a % 3 == 0)
			System.out.println(a + "�� 3�� ����Դϴ�.");
		if (a % 5 == 0)
			System.out.println(a + "�� 5�� ����Դϴ�.");
		if (a % 7 == 0)
			System.out.println(a + "�� 7�� ����Դϴ�.");
		
		// �������ǹ� (��ü�� �� ���� ����)
		if (a % 3 == 0)
			System.out.println(a + "�� 3�� ����Դϴ�!");
		else if (a % 5 == 0)
			System.out.println(a + "�� 5�� ����Դϴ�!");
		else if (a % 7 == 0)
			System.out.println(a + "�� 7�� ����Դϴ�!");
	}

}
