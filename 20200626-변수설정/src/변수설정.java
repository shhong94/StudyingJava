/*
 * 	�� ��ȭ ������ �����ϴ� ����
 * 
 * ������ ���(2017)����
The Greatest Showman ���� 09 . 9
������/���
�̱�
2017.12.20 ���� 2020.05.21 (�簳��)
 104��, 12���̻������
���� ����Ŭ �׷��̽� �ֿ� �� ���, �� ������
���� 5�� ��������1,667,104�� 
����


����γ���(2019)����
The Aeronauts ���� 08 . 3
���/��庥ó
����, �̱�
2020.06.10 ����
 101��, 12���̻������
���� �� ���� �ֿ� �縮��Ƽ ����, ���� �������
���� 13�� ��������73,938�� 
����
 * 
 */
public class �������� {

	public static void main(String[] args) {
		// ����
		String title = "������ ���(2017)";
		boolean isOpen = true;
		double score = 9.7;
		String nation = "�̱�";
		String genre = "������/���";
		String regdate = "2020.05.21";
		String director = "�� ����";
		String actor = "�縮��Ƽ ����, ���� �������";
		int time = 101;
		int grade = 12;
		int rank = 13;
		int showUser = 73938;
		
		System.out.println("========== ��ȭ ���� ==========");
		System.out.print("��ȭ�� : " + title);
		System.out.println(" " + (isOpen == true?"����":"�̰���"));
		System.out.println(nation + " " + grade + "��");
		System.out.println("�ð� : " + time + "��");
		System.out.println("������ : " + regdate + "����");
		System.out.println("���� : " + director);
		System.out.println("�⿬ : " + actor);
		System.out.println("���� : " + rank);
		System.out.println("���� ���� : " + showUser + "��");
		
		
		title = "����γ���(2019)";
		isOpen = true;
		score = 8.3;
		nation = "����, �̱�";
		genre = "���/��庥ó";
		regdate = "2020.06.10";
		director = "����Ŭ �׷��̽�";
		actor = "�� ���";
		time = 104;
		grade = 12;
		rank = 5;
		showUser = 1667104;
		
		System.out.println("========== ��ȭ ���� ==========");
		System.out.print("��ȭ�� : " + title);
		System.out.println(" " + (isOpen == true?"����":"�̰���"));
		System.out.println(nation + " " + grade + "��");
		System.out.println("�ð� : " + time + "��");
		System.out.println("������ : " + regdate + "����");
		System.out.println("���� : " + director);
		System.out.println("�⿬ : " + actor);
		System.out.println("���� : " + rank);
		System.out.println("���� ���� : " + showUser + "��");
		
	}

}
