/*
 * 	�� ���� ���ǹ�
 * =======================================
 * 		if (���ǹ�) {
 * 			���๮��
 * 		}
 *		else if (���ǹ�) {
 * 			���๮��
 * 		}
 * 		else if (���ǹ�) {
 * 			���๮��
 * 		}
 * 		else (���ǹ�) {                      <=============================== ��������
 * 			���๮��
 * 		} 
 * =======================================  �������ǹ��� �� ����� ó�� (���ǿ� �´� ���� �ϳ��� ����)
 * 
 * 	�� ���� ���ǹ� ������
 * =======================================
 * 		if (���ǹ�) {
 * 			���๮��
 * 		}
 * =======================================
 *		if (���ǹ�) {
 * 			���๮��
 * 		}
 * =======================================
 * 		if (���ǹ�) {
 * 			���๮��
 * 		}
 * =======================================
 * 		if (���ǹ�) {
 * 			���๮��
 * 		} 
 * =======================================  ���� ���ǹ� �������� ������ ������ ������ ����
 */
import java.util.*;
public class �������ǹ� {

	public static void main(String[] args) {
	// 3�� ������ �޾Ƽ� ����, ���, ���� ���ϱ�
		
	// ���� �ʱ�ȭ
		int kor = 0, eng = 0, math = 0;
		int total = 0;
		double avg = 0.0;
		char score = 'A';
	// ���� 3�� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		kor = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		eng = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = scan.nextInt();		
	// ����, ��� ���
		total = kor + eng + math;
		avg = total / 3.0;
	// ��տ� ���� ���� ���
		if (avg >= 90) {
			score = 'A';
		}
		else if (avg >= 80) {
			score = 'B';
		}
		else if (avg >= 70) {
			score = 'C';
		}
		else if (avg >= 60) {
			score = 'D';
		}
		else {
			score = 'F';
		}
	// ȭ�� ���
		System.out.println("==========����==========");
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		System.out.println("���� : " + total);
		System.out.printf("��� : %.2f\n", avg);
		System.out.println("���� : " + score);

	}

}
