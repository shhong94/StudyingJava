/*
 * 	�� �ڹٿ��� �����ϴ� ���
 * 		1. ���ǹ�, ���ù�
 * 			�� ���� ���ǹ� (if)
 * 			�� ���� ���ǹ� (if~else) : �α��� ó��, ID �ߺ�üũ
 * 			�� ���� ���ǹ� (if~else if~else)
 * 				�� ���� else������ ���� ����
 * 			�� ���ù� (switch~case)
 * 
 * 		2. �ݺ���
 * 			�� �ݺ� Ƚ���� ������ ��� (for)
 * 			�� �ݺ� ȸ���� �������� ���� ��� (while)
 * 			�� �ݵ�� �� �� �̻� ������ ��� (do~while)
 * 
 * 		3. �ݺ����
 * 			�� break : �ݺ��� ����
 * 			�� continue : Ư�� �κ��� ����
 */

import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// ���� 2��, char 1��(+, -, *, /)
		
		int a, b, c;
		// a, b => ����ڰ� �Է�
		// c => ���� ��� ����
		char op = '+';
		Scanner scan = new Scanner(System.in);
		
		// ����� �Է°� �ޱ�
		System.out.print("ù ��° ���� �Է� : ");
		a = scan.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		b = scan.nextInt();
		
		// Scanner�� char�� �޾Ƽ� ó���� �� ����. ���ڿ��� ��ȯ�ؾ� ��.
		// System.in�� ����ó���� �ݵ�� �ؾ� ��.
		System.out.println("������(+, -, *, /) : ");
		op = scan.next().charAt(0);
		
		if (op == '+') 
		{
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}
		if (op == '-') 
		{
			System.out.printf("%d - %d = %d\n", a, b, a - b);
		}
		if (op == '*') 
		{
			System.out.printf("%d * %d = %d\n", a, b, a * b);
		}
		if (op == '/') 
		{
			// ���� ó��
			if (b == 0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else
				System.out.printf("%d / %d = %.2f\n", a, b, a / (double)b);
		}
	}

}
