/*
 *  ������ ���� 5�� ���� �� 
 *  �ִ񰪰� �ּڰ� ���ϱ�
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// ���� 5���� �����ϴ� ����
		int[] arr = new int[5];
		
		// 5���� ������ ������ ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		// ����� 5���� ���� Ȯ��
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// �ִ� �ּڰ��� �����ϴ� ����
		int max = 0;		// �ִ��� 0, �ּڰ��� 100���� �ʱ�ȭ�ؾ� 
		int min = 100;		// �迭 ���� �������� �ϳ��� ���س��� �� ����.
							// ���� �ִ밪�� 100, �ּҰ��� 0�̸� ������� �״�� 100�� 0�� ���͹���
		
		// �ִ�, �ּڰ� ���
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);

	}

}
