/*
 *  ����ڰ� 0, 1, 2�� �Է�
 *  0�̸� ����
 *  1�̸� ����
 *  2�� ��
 *  
 *  Math.random() = 0.0 ~ 0.99 ���
 *  ���⿡ 3�� ���ϸ� 0.0 ~ 0.29 ���
 *  ���⿡ int�� ����ȯ �ϸ� ���� ��µǴ� ������ 0, 1, 2
 *  
 *  �⺻�� �����ʹ� �� ����
 *  ���ڿ��� �� �Ұ�
 *  ��.
 */

import java.util.*;
public class �ڹ����ǹ�_����3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0(����), 1(����), 2(��) �Է� : ");
		int user = scan.nextInt();
		
		// ����
		if (user == 0)
		{
			System.out.println("User : ����");
		}
		if (user == 1)
		{
			System.out.println("User : ����");
		}
		if (user == 2)
		{
			System.out.println("User : ��");
		}
		
		// ��ǻ��
		int com = (int)(Math.random()*3);   // Math.random() = 0.0 ~ 0.99 ���
		
		if (com == 0)
		{
			System.out.println("Com : ����");
		}
		if (com == 1)
		{
			System.out.println("Com : ����");
		}
		if (com == 2)
		{
			System.out.println("Com : ��");
		}
		
		// �ߺ� ���ǹ�
		// ��ǻ�Ͱ� ������ ��
//		if (com == 0)
//		{
//			if (user == 0)
//			{
//				System.out.println("�����ϴ�");
//			}
//			if (user == 1)
//			{
//				System.out.println("������ �̰���ϴ�");
//			}
//			if (user == 2)
//			{
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//			}
//		}	
//		
//		// ��ǻ�Ͱ� ������ ��
//		if (com == 1)
//		{
//			if (user == 0)
//			{
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//			}
//			if (user == 1)
//			{
//				System.out.println("�����ϴ�");
//			}
//			if (user == 2)
//			{
//				System.out.println("������ �̰���ϴ�");
//			}
//		}
//		
//		// ��ǻ�Ͱ� ���� ��
//		if (com == 2)
//		{
//			if (user == 0)
//			{
//				System.out.println("������ �̰���ϴ�");
//			}
//			if (user == 1)
//			{
//				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
//			}
//			if (user == 2)
//			{
//				System.out.println("�����ϴ�");
//			}
//		}
		
	}

}
