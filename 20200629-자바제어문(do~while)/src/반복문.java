/*
 * 	�� do ~ while
 * 		1. ����
 * 			int i = 1;
 * 			do {
 * 				System.out.print(i + " ");
 * 				i++;
 * 			} while(i <= 5);
 */

public class �ݺ��� {

	public static void main(String[] args) {
		// �ʱⰪ
		int i = 1;
		// ���๮�� + ������
		do {
			System.out.print(i);	// ���๮��
			i++;					// ������
		} while(i <= 5);			// ���ǽ�

		System.out.println("\n ============================ \n");
		
		
		i = 1;
		while(i <= 10) {
			if (i == 5) {		// i�� 5�� �� i++�����ϰ� �ٷ� ��Ƽ��(�Ʒ��� ��¸�ɹ��� �ǳʶ�)
				i++;
				continue;
			}
			System.out.print(i);
			i++;
		}
	
	}

}
