/*
 * 	�� Ŭ����
 * 		1. ������ ���� ����
 * 			������ ����� �������� ���� �����͸� ���� (�ѿ켼Ʈ���� �ѿ� ������ ���ߵ�)
 * 					  ================= >> �߻�ȭ
 * 		2. ���� ����
 * 			�� �ν��Ͻ����� : new ����� ������ ���� �����
 * 			�� Ŭ�������� : ����Ǵ� �޸𸮰� �Ѱ��̸� �������� ���� (��������) static
 * 			�� �������� : �������� / �Ű����� (�޼ҵ� ȣ�� �ÿ� �޸𸮿� ����, �޼ҵ� ����� �޸𸮿��� �����)
 * 
 * 		3. ������
 * 			�� �ν��Ͻ� ������ �ʱⰪ �ο�
 * 			�� ���� �κп� �ʿ� (��� �̿�, ���� �б�...)
 * 			�� ���� ����(�����Ϸ��� �⺻ ������ �߰�)			
 * 
 * 		4. �޼ҵ�
 * 			�� ����� + ������ �̾�� ����
 * 			�� �ν��Ͻ� �޼ҵ� : Ŭ�������� ���� ����ϴ� �޼ҵ�
 * 			�� Ŭ���� �޼ҵ�	: ��� Ŭ���� �������� ��� (static)
 * 			�� �߻�޼ҵ� : ����θ� ����
 * 
 */

class Student{
	String name;
	String subject;
	int year;
	static String school;
}


public class MainClass {

	public static void main(String[] args) {
		// static ���� ���
		Student.school = "SIST";
		Student s = new Student(); // name, subject, year �������� ���� ����
		s.name = "�ƹ���";
		s.subject = "��������";
		s.year = 3;
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);

		
	}

}
