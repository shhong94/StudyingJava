/*
 * ���� ���� ��
 * 0 ����		1 ����	2 ��
 */
import java.util.*;
public class �ڹٹ迭_�뵵 {

	public static void main(String[] args) {
		// ��ǻ�� 
		int com = (int)(Math.random()*3);
		// ���� �Է°�
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("0(����) 1(����) 2(��) �� �ϳ��� �Է� : ");
		user = scan.nextInt();
		
		// �迭 ����
		String[] result = {"����", "����", "��"};
		
		System.out.println("��ǻ�� : " + result[com]);
		System.out.println("��ǻ�� : " + result[user]);
		
		
	}

}
