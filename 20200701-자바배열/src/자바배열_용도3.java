/*
 *  ����ڰ� ���� �Է��ϸ�
 *  2�������� ���
 *  
 *  
 */
import java.util.*;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// binary �迭 (0,1�� ����)
		int[] binary =  new int[16];
		// �Է��� ����
		int user = 0;
		// �ڿ������� ����ϰ��� 15�� �ʱ�ȭ
		int index = 15;
		
		// �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(0~32767) : ");
		user = scan.nextInt();
		
		// ������ ���
		while(true) {
			// user % 2 = 0 �Ǵ� 1
			binary[index] = user % 2;
			user = user / 2;
			// user�� 0�� �� ���� ����� ��
			if(user == 0) {
				break;
			}
			// �ε��� 15���� 0���� ����
			index--;
		}
		
		// ��� ���
		for(int i = 0; i < 16; i++) {
			if(i % 4 == 0 && i != 0) {
				System.out.println(" ");
			}
			System.out.println(binary[i]);
			
		}

	}

}
