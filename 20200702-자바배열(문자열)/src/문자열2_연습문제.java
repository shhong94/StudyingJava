import java.util.*;
public class ���ڿ�2_�������� {

	public static void main(String[] args) {		
		// �迭
		String[] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};
		// �Է¹��� ����
		String input;
		
		
		while(true) {
			// �Ҹ����� while�� ������ �ξ�� ������ ���ư� ������ false�� �ʱ�ȭ��.
			// while�� �ٱ��� �ΰ� �Ǹ� if (bCheck == false) ���ǹ��� ������� ���� ���� ����.
			boolean bCheck = false;
			
			// ���� �̸� �Է¹ޱ�
			Scanner scan = new Scanner(System.in);
			System.out.print("���� �̸��� �Է��ϼ��� : ");
			input = scan.nextLine();
			
			if(input.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			for(int i = 0; i < course.length; i++) {
				if(course[i].contains(input)) {
					bCheck = true;
					System.out.println("���� �̸� : " + course[i]);
					System.out.printf("%s�� ������ %d", course[i], score[i]);
					System.out.println();
				}
				// ���°����� ����� ���ǹ��� for�� �ȿ� �ְ� �Ǹ� �ش� ������ course.length ��ŭ ��µ�
				// for���� ������ ������ ������.
	//			else if (bCheck == false) {
	//				System.out.println("���� �����Դϴ�");
	//			}
			}
			// �̷��� for�� �ٱ����� ���� ������ �ѹ��� ��µ�
			if (bCheck == false) {
				System.out.println("���� �����Դϴ�");
			}
		}
		
	}

}
