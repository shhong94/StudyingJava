/*
 * 	�� �迭�� �� ����
 * 		1. ���� ����
 * 		2. Scanner���
 * 		3. ������ �̿�
 * 		4. file �б�
 * 		5. web���� �о ����
 * 		6. ����Ŭ
 */
import java.util.*;
public class �迭������ {

	public static void main(String[] args) {
		// �л� 3���� ��������
		// ���� ���� �������� �Է¹ް� ���� ��� ���� ���
		
		// ����
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		// ���� ��� ���� ���
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		
		// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		
		// �� ������ �Է¹ް� ����, ��� ���ϱ�
		for(int i = 0; i <3; i++) {
			System.out.printf("%d��° ���� ���� �Է� : ", i+1);
			kor[i] = scan.nextInt();
		
			System.out.printf("%d��° ���� ���� �Է� : ", i+1);
			eng[i] = scan.nextInt();
			
			System.out.printf("%d��° ���� ���� �Է� : ", i+1);
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}
		
		// �������
		for(int i = 0; i < 3; i++) {
			char c = 'A';
			switch(total[i] / 30) {
			case 10:
			case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			default:
				c = 'F';
				break;
			}
			score[i] = c;
		}
		//��� ���
		for(int i = 0; i < 3; i++) {
			rank[i] = 1;
			for(int j = 0; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-3s%6s\n", "����", "����", "����", "����", "���", "����", "���");
		// �Էµ� ���� ���
		for(int i = 0; i < 3; i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%5d\n", kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}
		
	}

}
