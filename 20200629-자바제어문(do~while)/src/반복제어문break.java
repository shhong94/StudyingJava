/*
 * 	�� �ݺ����
 * 		1. break
 * 			�ݺ��� ����
 * 			�ݺ��� ��ü���� ��� ����(for, while, switch)
 * 		2. continue
 * 			Ư���κ� ����
 * 			�ַ� for�������� ���
 * 		�� break, continue�� �� ���� �ݺ����� ���� ����
 * 		�� continue => while���� ���ǽ����� �̵�(���ѷ����� �ɸ� �� ����)
 * 					  for���� ���������� �̵�
 */
public class �ݺ����break {

	public static void main(String[] args) {
		
		System.out.println("\n\n============= break ��� ===============\n");
		// 1~10 ���
		// 5�� �� ����
		
		// �ݺ��� + break
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");	// ��¹��� if�� �Ʒ��� ����
			if (i == 5) {				// if�� ���� i�� 6�� �Ǿ� 1~5 �����
				break;
			}			
		}
		
		System.out.println("\n\n============= continue ��� ===============\n");
		
		// �ݺ��� + continue
		// 1~10 Ȧ���� ���(continue �̿�)
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n============= i�� 2�� ���� ===============\n");
		
		// i�� 2�� ����
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n============= ���ǹ� ��� ===============\n");
		
		// ���ǹ� ���
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println("\n\n============= ���ǹ� ��� ===============\n");
		
		
	}

}
