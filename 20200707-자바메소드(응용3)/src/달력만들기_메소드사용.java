import java.util.*;
public class �޷¸����_�޼ҵ��� {

// �Է°� �ޱ�
	static int userInput(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + " �Է� : ");
		int num = scan.nextInt();
		return num;
	}
	
// ���� ���ϱ�
	static int getWeek(int year, int month) {
		// �� �⵵������ ���� �հ�
		int total = (year-1)*365 + (year-1)/4 + (year-1)/400 - (year-1)/100;
		
		for(int i = 1; i < month-1; i++) {
			total = total + lastDays(year, i);
		}
		// �հ�+1, 7�� ���� ������ ������ ����
		total++;
		int week = total % 7;
		
		return week;
	}
// �� ���� ������ ��¥ �����ϴ� �޼ҵ�
	static int lastDays(int year, int month) {
		int[] lastDays = {31, 28, 31, 30, 31, 30,
				  		  31, 31, 30, 31, 30, 31};
		if(isYear(year)) {
			lastDays[1] = 29;
		}
		else {
			lastDays[1] = 28;			
		}
		return lastDays[month-1];
	}
	
// ���� ���
	static boolean isYear(int year) {
		boolean check = false;
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			check = true;
		}
		return check;
	}
	
// �޷� ���
	static void datePrint(int year, int month, int week) {
		int last = lastDays(year, month);
		
		char[] days = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		for(char i : days) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 1; i <= last; i++) {
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
	
// �޼ҵ� ���� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�	
	static void process() {
		int year = userInput("�⵵");
		int month = userInput("��");
		
	// ����
		int week = getWeek(year, month);
	// ���
		datePrint(year, month, week);
	}
	
// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	
	public static void main(String[] args) {
		process();

	}

}
