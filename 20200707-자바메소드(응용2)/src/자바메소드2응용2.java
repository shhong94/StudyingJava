/*
 * 	���� ���� ����������
 * 	1. ����
 * 	2. ���
 * 	3. ����
 */
import java.util.*;
public class �ڹٸ޼ҵ�2����2 {
	
	// ���� �Է¹޴� �޼ҵ� (3�� ȣ��)
	static int userInput(String subject) {
		Scanner scan = new Scanner(System.in);
		System.out.print(subject + "������ �Է� : ");
		int score = scan.nextInt();
		return score;
	}
	
	// ���� ����ϴ� �޼ҵ�
	static int total(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	// ��� �޼ҵ�
	static void avg(int total) {
		System.out.printf("��� : %.2f\n", total/3.0);
	}
	
	// ���� �޼ҵ� (���ϰ� char)
//	static char grade(int total) {
//		char grade = 'a';
//		switch(total / 3) {
//		case 100:
//		case 90:
//			grade = 'A';
//			break;
//		case 80:
//			grade = 'B';
//			break;
//		case 70:
//			grade = 'C';
//			break;
//		case 60:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
//		return grade;
//	}
	
	// ���� �޼ҵ� (void)
	static void grade(int total) {
		char grade = 'a';
		if(total / 3.0 >= 90) {
			grade = 'A';
		}
		else if(total / 3.0 >= 80) {
			grade = 'B';
		}
		else if(total / 3.0 >= 70) {
			grade = 'C';
		}
		else if(total / 3.0 >= 60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("���� : " + grade);
	}

	public static void main(String[] args) {
		int kor = userInput("����");
		int eng = userInput("����");
		int math = userInput("����");
		int total = total(kor, eng, math);
		
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		
		System.out.println("���� : " + total);
		avg(total);
		grade(total);
		
		
	}

}
