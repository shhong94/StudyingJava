/*
 *  �������
 */

import java.util.*;

// �л� Ŭ����
class Student{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}

public class MainClass3 {

	static void process() {
		Student[] std = new Student[3];		// Student Ŭ���� �迭
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			std[i] = new Student();		// Ŭ������ �ʱⰪ�� null(�ּҾ���)�̱� ������ �����ڸ� ���� �޸𸮿� ��������� �������� ������ ���� ���� (���� �޸� �Ҵ�)
			
			System.out.print("�̸� �Է� : ");
			std[i].name = scan.next();
			
			System.out.print("�������� �Է� : ");
			std[i].kor = scan.nextInt();
			System.out.print("�������� �Է� : ");
			std[i].eng = scan.nextInt();
			System.out.print("�������� �Է� : ");
			std[i].math = scan.nextInt();
			
			std[i].total = std[i].kor + std[i].eng + std[i].math;
			std[i].avg = std[i].total / 3.0;
		}
		
		// ���
		for(Student s : std) {
			System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math + " " + s.total + " " + s.avg);
		}
	}
	public static void main(String[] args) {
		process();

	}

}
