/*
 * 	��, �� �Է°� �ޱ�
 */
import java.util.*;
public class �޷¸���� {

	public static void main(String[] args) {
	// ����
		int year = 0, month = 0;
		Scanner scan = new Scanner(System.in);
		
		
	// �Է°� �ޱ�
		System.out.print("���� �Է� : ");
		year = scan.nextInt();
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.println();
		
		
	// �� ~ �� ���
		String[] strWeek = {"��", "��", "ȭ", "��", "��", "��", "��",};
		System.out.println(year + "�⵵ " + month + "��");
		
		for(String week : strWeek) {
			System.out.print(week + "\t");
		}
		
		
		// ���� ���ϱ�
/*		1. ���⵵������ �� ���� ��
 * 		2. �� �ޱ����� �� ���� ��
 * 		3. 1 ���ϱ� (�Է��� ���� �޷��� 1�Ϻ��� ��µǹǷ�)	
 */
		
	// 1. ���⵵������ ��
		int total = ((year-1)*365) + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
	// 2. �� �ޱ����� ��
		// 2-1. �� ���� ���ϼ� �迭
		int[] lastDay = {31, 28, 31, 30, 31, 30,
						 31, 31, 30, 31, 30, 31};
		// 2-2.	���⿡ ���� 2�� ���� �� ���ǹ�
		if((year) % 4 == 0 && (year) % 100 != 0 || ((year) % 400 == 0)) {
			lastDay[1] = 29;
		}
		else {
			lastDay[1] = 28;
		}
		// 2-3. �� ���� �� ���
		for(int i = 0; i < month-1; i++) {
			total += lastDay[i];
		}
		
	// 3. �Է��� ���� 1������ ����
		total++;	// �� �ޱ����� �տ� 1 ���ϱ�
		int week = total % 7; // week�� �Է¹��� ���� ����(0�� �Ͽ��� ~ 6�� �����)
		
	// �޷� ���
		System.out.println();
		for(int i = 1; i <=lastDay[month-1]; i++) {
			if(i == 1) {
				for(int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if(week > 6) {
				week = 0;
				System.out.println();
			}
		}
	}	

}
