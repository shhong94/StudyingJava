/*
 * 	���ù�
 * 	switch(����, ����, ���ڿ�) {
 * 		case ������:   <================================ �����ݷ�;�� �ƴ϶� �ݷ�:�� ���� ��.
 * 			ó������										������(��)�� �ߺ����� �ʾƾ� ��.
 * 			break; 	 <================================  break;�� �ִ� ��������� ����.
 * 		case ������:
 * 			ó������
 * 		case ������:
 * 			ó������
 * 	}
 */
import java.util.*;
public class ���ù� {

	public static void main(String[] args) {
		int select = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����(1~5) : ");
		select = scan.nextInt();
		
		switch (select) {
		case 1:
		case 2:
			System.out.println("1~2�� �Է�");
			break;
		case 3:
			System.out.println("3�� �Է�");
			break;
		case 4:
			System.out.println("4�� �Է�");
			break;
		case 5:
			System.out.println("5�� �Է�");
			break;
		default:
			System.out.println("1~5�� ������ �Է��ϼ���");	
		}

	}

}
