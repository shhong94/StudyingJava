/*
 * 	�� ��ø for��
 * 		1. ����
 * 			for(�ʱⰪ; ���ǽ�; ������) {			<======== ���� ���(�� ��)
 * 				for(�ʱⰪ; ���ǽ�; ������) {		<======== ���� ���(�� ��)
 * 					�ݺ����๮��
 * 				}
 * 			}
 * 		2. �������
 * 			�� 1�� �ʱⰪ
 * 			�� 1�� �ʱⰪ
 * 			�� �� 2�� for�� ��ü ��
 * 			�� 1�� ������
 */
public class �ݺ���_2��for1 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
		

	}

}
