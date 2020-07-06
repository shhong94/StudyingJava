import java.util.*;
public class ����_�޷¸����_�޼ҵ� {
	// Ŭ���� ����
	static int year = 0;
	static int month = 0;

	static void inputYearMonth() {
		
		
		// ���� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		year = scan.nextInt();
		System.out.print("�� �Է� : ");
		month = scan.nextInt();

		
		// ���� ��� ���� ���
		System.out.printf("%d�⵵ %d��\n", year, month);
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		for(int i = 0; i < days.length; i++) {
			System.out.print(days[i] + "\t");
		}
		System.out.println();
	}
	
	
	static void print() {
		// �� �⵵������ ��
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
		
		// �հ迡 1 ���ϰ� 7�� ���� �������� ������ ����
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
	
	
	
	public static void main(String[] args) {
		inputYearMonth();
		print();

	}

}
