/*
 * 	�� switch ��ø
 * 		switch(����) {
 * 		case 1:
 * 			switch(����) {
 * 			case 'A':
 * 			}
 * 		}
 */	

import java.util.*;
public class ���ù�6 {

	public static void main(String[] args) {
	// ����
		int user = 0;
		int com = (int)(Math.random()*3);
	// �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("����(0) ����(1) ��(2) �� �ϳ��� �Է��ϼ��� : ");
		user = scan.nextInt();
		System.out.println("\n========================================\n");
		System.out.println("���� : " + user);
		System.out.println("��ǻ�� : " + com);
		
	// ���
		switch(user) {
		case 0: // ����
			switch(com) {
			case 0:
				System.out.println("�����ϴ�");
				break;
			case 1:
				System.out.println("����� �����ϴ�");
				break;
			case 2:
				System.out.println("����� �̰���ϴ�");
				break;
			}
			break;
		case 1: // ���� 
			switch(com) {
			case 0:
				System.out.println("����� �̰���ϴ�");
				break;
			case 1:
				System.out.println("�����ϴ�");
				break;
			case 2:
				System.out.println("����� �����ϴ�");
				break;
			}
			break;
		case 2: // ��
			switch(com) {
			case 0:
				System.out.println("����� �����ϴ�");
				break;
			case 1:
				System.out.println("����� �̰���ϴ�");
				break;
			case 2:
				System.out.println("�����ϴ�");
				break;
			}
			break;
		}
		

	}

}
