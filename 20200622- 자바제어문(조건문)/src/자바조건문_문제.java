/*
 * 	1. if~else
 * 		������ �Է¹޾Ƽ� 
 * 		¦������ Ȧ������ Ȯ���ϴ�.
 * 		ex) "10�� ¦����" or "11�� Ȧ����"
 * 
 * 	2. ���� 3���� �Է¹޾Ƽ�
 * 		����, ���, ���� ���ϱ�
 * 		60 �̻��� D
 * 		70 �̻��� C
 * 		80 �̻��� B
 * 		90 �̻��� A
 * 		�������� F
 * 
 * 		���� 80
 * 		���� 80
 * 		���� 80
 * 
 * 		ex) ����: 240
 * 			��� : 80.0
 * 			���� : B
 */

import java.util.*;
public class �ڹ����ǹ�_���� {

	public static void main(String[] args) {
		// 1�� ����
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		System.out.print("���� �Է� : ");
		a = scan.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println(a + "��(��) ¦����");
		}
		else
		{
			System.out.println(a + "��(��) Ȧ����");
		}
		
		

		

		
	}

}
