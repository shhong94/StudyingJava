/*
 * 	�� ���������� �ٸ� �޼ҵ忡�� ����� ���� �Ű������� �̿��Ͽ� ����
 */
import java.util.*;
public class �޷¸����_��������� {
	
	
	
// ==================================================================================== ����	
	public static void main(String[] args) {
	// ������ �� �Է¹ޱ�	
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int year = scan.nextInt();
		System.out.print("�� �Է� : ");
		int month = scan.nextInt();
		System.out.println(year + "�⵵" + month + "��");
		
	// ���� ���
		char[] days = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		for(char i : days) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		
	// �� �⵵������ ���� �հ�
		int total = (year-1)*365 + (year-1)/4 + (year-1)/400 - (year-1)/100;
	// �� �ޱ����� ��
		int[] lastDays = {31, 28, 31, 30, 31, 30,
						  31, 31, 30, 31, 30, 31};
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			lastDays[1] = 29;
		}
		else {
			lastDays[1] = 28;
		}
		for(int i = 0; i < month-1; i++) {
			total = total + lastDays[i];
		}
	// �հ�+1, 7�� ���� ������ ������ ����
		total++;
		int week = total % 7;
		
	// ���
		for(int i = 1; i <= lastDays[month-1]; i++) {
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
