/*
 *  ����ڰ� �� �� ���� �Է��ϸ� ������ ���
 */
import java.util.*;
public class �ڹٹ迭 {

	public static void main(String[] args) {
		// �⵵, ��, ���� �޴� ������ �ʿ�
		int year = 0;
		int month = 0;
		int day = 0;
		
		// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("�⵵ �Է� : ");
		year = scan.nextInt();
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		// ����� ���
		System.out.println(year + "�� " + month + "�� " + day + "��");
		
		
		// ���� ���ϱ�
		/*
		 * 	1. �� �⵵������ �� �ϼ�
		 * 		1�� 1�� 1�� ~ 2019�� 12�� 31�ϱ��� ���
		 * 	2. �� �������� �� �ϼ�
		 * 		2020�� 1�� 1�� ~ 2020�� 6�� 30�ϱ��� ���
		 *  3. �Էµ� day���� �� �ϼ�
		 *  ===================
		 *  �� �ϼ� % 7 = ���� ��� ����
		 */
		
		
		
		// 1. �� �⵵������ �� �ϼ�
		// ���� : 4�⸶��, 400�⸶�� ���� / 100�⸶�� ���� ����
		int total = ((year-1) * 365) + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400);
		
		// 2. �� �������� �� �ϼ�
		 /*
		 1�� �Է� => 0
		 2�� �Է� => total + 31
		 3�� �Է� => total + 31 + 28
		 4�� �Է� => ......................
		 */
		int[] lastday = {31, 28, 31, 30, 31, 30,
						 31, 31, 30, 31, 30, 31};
		// 2���� ��� 28�� �Ǵ� 29��
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			lastday[1] = 29;
		}
		else {
			lastday[1] = 28;
		}
		
		
		// ���
		for(int i = 0; i < month-1; i++) {
			total += lastday[i];
		}
		
		// ���� ���ϱ�
		// �迭�� �ƴ϶� switch���� ���� �Ǹ� �ҽ����� ������!
		int week= total % 7;
		char[] strWeek = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		System.out.println(strWeek[week] + "�����Դϴ�");
		/*
		 *  switch (week){
		 *  case 0:
		 *  	week = '��';
		 *  	break;
		 *  case 1:
		 *  ....
		 *  ...
		 *  ..
		 *  .
		 * 	
		 *  }
		 */
		
		
		
	}

}
